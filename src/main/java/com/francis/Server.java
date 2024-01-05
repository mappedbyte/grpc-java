package com.francis;

import com.francis.proto.UserGrpc;
import com.francis.proto.UserOuterClass;
import io.grpc.stub.StreamObserver;


public class Server extends UserGrpc.UserImplBase {
    @Override
    public void getUserByMobile(UserOuterClass.MobileRequest request, StreamObserver<UserOuterClass.UserInfoResponse> responseObserver) {
        UserOuterClass.UserInfoResponse response = UserOuterClass.UserInfoResponse.newBuilder()
                .setId(1).setBirthDay(System.currentTimeMillis())
                .setRole(1).setMobile("18888888888")
                .setGender("male")
                .setNickName("JavaY")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
