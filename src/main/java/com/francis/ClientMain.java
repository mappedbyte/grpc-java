package com.francis;

import com.francis.proto.UserGrpc;
import com.francis.proto.UserOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClientMain {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext()
                .keepAliveTime(10, TimeUnit.SECONDS)  // 心跳间隔时间，单位为秒
                .keepAliveTimeout(5, TimeUnit.SECONDS)  // 心跳超时时间，单位为秒
                .keepAliveWithoutCalls(true)  // 允许在没有调用时发送心跳
                .build();
        UserGrpc.UserBlockingStub userBlockingStub = UserGrpc.newBlockingStub(channel);
        UserOuterClass.UserListResponse userList = userBlockingStub.getUserList(UserOuterClass.PageInfo.
                newBuilder().setPage(1).setPageSize(10).build());
        List<UserOuterClass.UserInfoResponse> dataList = userList.getDataList();
        for (UserOuterClass.UserInfoResponse userInfoResponse : dataList) {
            System.out.println(userInfoResponse.getNickName());
        }
        UserOuterClass.UserInfoResponse user = userBlockingStub.getUserById(UserOuterClass.IdRequest.newBuilder().setId(1).build());
        System.out.println(user);
    }
}
