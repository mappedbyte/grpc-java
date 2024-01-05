package com.francis.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.PageInfo,
      com.francis.proto.UserOuterClass.UserListResponse> METHOD_GET_USER_LIST = getGetUserListMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.PageInfo,
      com.francis.proto.UserOuterClass.UserListResponse> getGetUserListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.PageInfo,
      com.francis.proto.UserOuterClass.UserListResponse> getGetUserListMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.PageInfo, com.francis.proto.UserOuterClass.UserListResponse> getGetUserListMethod;
    if ((getGetUserListMethod = UserGrpc.getGetUserListMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserListMethod = UserGrpc.getGetUserListMethod) == null) {
          UserGrpc.getGetUserListMethod = getGetUserListMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.PageInfo, com.francis.proto.UserOuterClass.UserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "GetUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.PageInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.UserListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserList"))
                  .build();
          }
        }
     }
     return getGetUserListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserByMobileMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.MobileRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> METHOD_GET_USER_BY_MOBILE = getGetUserByMobileMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.MobileRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByMobileMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.MobileRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByMobileMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.MobileRequest, com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByMobileMethod;
    if ((getGetUserByMobileMethod = UserGrpc.getGetUserByMobileMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserByMobileMethod = UserGrpc.getGetUserByMobileMethod) == null) {
          UserGrpc.getGetUserByMobileMethod = getGetUserByMobileMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.MobileRequest, com.francis.proto.UserOuterClass.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "GetUserByMobile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.MobileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserByMobile"))
                  .build();
          }
        }
     }
     return getGetUserByMobileMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.IdRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> METHOD_GET_USER_BY_ID = getGetUserByIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.IdRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.IdRequest,
      com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.IdRequest, com.francis.proto.UserOuterClass.UserInfoResponse> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetUserByIdMethod = UserGrpc.getGetUserByIdMethod) == null) {
          UserGrpc.getGetUserByIdMethod = getGetUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.IdRequest, com.francis.proto.UserOuterClass.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("GetUserById"))
                  .build();
          }
        }
     }
     return getGetUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CreateUserInfo,
      com.francis.proto.UserOuterClass.UserInfoResponse> METHOD_CREATE_USER = getCreateUserMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CreateUserInfo,
      com.francis.proto.UserOuterClass.UserInfoResponse> getCreateUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CreateUserInfo,
      com.francis.proto.UserOuterClass.UserInfoResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CreateUserInfo, com.francis.proto.UserOuterClass.UserInfoResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserGrpc.getCreateUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getCreateUserMethod = UserGrpc.getCreateUserMethod) == null) {
          UserGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.CreateUserInfo, com.francis.proto.UserOuterClass.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.CreateUserInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.UpdateUserInfo,
      com.google.protobuf.Empty> METHOD_UPDATE_USER = getUpdateUserMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.UpdateUserInfo,
      com.google.protobuf.Empty> getUpdateUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.UpdateUserInfo,
      com.google.protobuf.Empty> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.UpdateUserInfo, com.google.protobuf.Empty> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateUserMethod = UserGrpc.getUpdateUserMethod) == null) {
          UserGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.UpdateUserInfo, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.UpdateUserInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("UpdateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCheckPasswordMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CheckPasswordRequest,
      com.francis.proto.UserOuterClass.CheckResponse> METHOD_CHECK_PASSWORD = getCheckPasswordMethod();

  private static volatile io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CheckPasswordRequest,
      com.francis.proto.UserOuterClass.CheckResponse> getCheckPasswordMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CheckPasswordRequest,
      com.francis.proto.UserOuterClass.CheckResponse> getCheckPasswordMethod() {
    io.grpc.MethodDescriptor<com.francis.proto.UserOuterClass.CheckPasswordRequest, com.francis.proto.UserOuterClass.CheckResponse> getCheckPasswordMethod;
    if ((getCheckPasswordMethod = UserGrpc.getCheckPasswordMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getCheckPasswordMethod = UserGrpc.getCheckPasswordMethod) == null) {
          UserGrpc.getCheckPasswordMethod = getCheckPasswordMethod = 
              io.grpc.MethodDescriptor.<com.francis.proto.UserOuterClass.CheckPasswordRequest, com.francis.proto.UserOuterClass.CheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "CheckPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.CheckPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.francis.proto.UserOuterClass.CheckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("CheckPassword"))
                  .build();
          }
        }
     }
     return getCheckPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *用户列表
     * </pre>
     */
    public void getUserList(com.francis.proto.UserOuterClass.PageInfo request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过mobile查询用户
     * </pre>
     */
    public void getUserByMobile(com.francis.proto.UserOuterClass.MobileRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByMobileMethod(), responseObserver);
    }

    /**
     * <pre>
     *通过id查询用户
     * </pre>
     */
    public void getUserById(com.francis.proto.UserOuterClass.IdRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *添加用户
     * </pre>
     */
    public void createUser(com.francis.proto.UserOuterClass.CreateUserInfo request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public void updateUser(com.francis.proto.UserOuterClass.UpdateUserInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *检查密码
     * </pre>
     */
    public void checkPassword(com.francis.proto.UserOuterClass.CheckPasswordRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.CheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.PageInfo,
                com.francis.proto.UserOuterClass.UserListResponse>(
                  this, METHODID_GET_USER_LIST)))
          .addMethod(
            getGetUserByMobileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.MobileRequest,
                com.francis.proto.UserOuterClass.UserInfoResponse>(
                  this, METHODID_GET_USER_BY_MOBILE)))
          .addMethod(
            getGetUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.IdRequest,
                com.francis.proto.UserOuterClass.UserInfoResponse>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.CreateUserInfo,
                com.francis.proto.UserOuterClass.UserInfoResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.UpdateUserInfo,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getCheckPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.francis.proto.UserOuterClass.CheckPasswordRequest,
                com.francis.proto.UserOuterClass.CheckResponse>(
                  this, METHODID_CHECK_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     *用户列表
     * </pre>
     */
    public void getUserList(com.francis.proto.UserOuterClass.PageInfo request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过mobile查询用户
     * </pre>
     */
    public void getUserByMobile(com.francis.proto.UserOuterClass.MobileRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByMobileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通过id查询用户
     * </pre>
     */
    public void getUserById(com.francis.proto.UserOuterClass.IdRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *添加用户
     * </pre>
     */
    public void createUser(com.francis.proto.UserOuterClass.CreateUserInfo request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public void updateUser(com.francis.proto.UserOuterClass.UpdateUserInfo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *检查密码
     * </pre>
     */
    public void checkPassword(com.francis.proto.UserOuterClass.CheckPasswordRequest request,
        io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.CheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *用户列表
     * </pre>
     */
    public com.francis.proto.UserOuterClass.UserListResponse getUserList(com.francis.proto.UserOuterClass.PageInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过mobile查询用户
     * </pre>
     */
    public com.francis.proto.UserOuterClass.UserInfoResponse getUserByMobile(com.francis.proto.UserOuterClass.MobileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByMobileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通过id查询用户
     * </pre>
     */
    public com.francis.proto.UserOuterClass.UserInfoResponse getUserById(com.francis.proto.UserOuterClass.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *添加用户
     * </pre>
     */
    public com.francis.proto.UserOuterClass.UserInfoResponse createUser(com.francis.proto.UserOuterClass.CreateUserInfo request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public com.google.protobuf.Empty updateUser(com.francis.proto.UserOuterClass.UpdateUserInfo request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *检查密码
     * </pre>
     */
    public com.francis.proto.UserOuterClass.CheckResponse checkPassword(com.francis.proto.UserOuterClass.CheckPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *用户列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.francis.proto.UserOuterClass.UserListResponse> getUserList(
        com.francis.proto.UserOuterClass.PageInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过mobile查询用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.francis.proto.UserOuterClass.UserInfoResponse> getUserByMobile(
        com.francis.proto.UserOuterClass.MobileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByMobileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通过id查询用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.francis.proto.UserOuterClass.UserInfoResponse> getUserById(
        com.francis.proto.UserOuterClass.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *添加用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.francis.proto.UserOuterClass.UserInfoResponse> createUser(
        com.francis.proto.UserOuterClass.CreateUserInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *更新用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateUser(
        com.francis.proto.UserOuterClass.UpdateUserInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *检查密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.francis.proto.UserOuterClass.CheckResponse> checkPassword(
        com.francis.proto.UserOuterClass.CheckPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LIST = 0;
  private static final int METHODID_GET_USER_BY_MOBILE = 1;
  private static final int METHODID_GET_USER_BY_ID = 2;
  private static final int METHODID_CREATE_USER = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_CHECK_PASSWORD = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_LIST:
          serviceImpl.getUserList((com.francis.proto.UserOuterClass.PageInfo) request,
              (io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserListResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_MOBILE:
          serviceImpl.getUserByMobile((com.francis.proto.UserOuterClass.MobileRequest) request,
              (io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.francis.proto.UserOuterClass.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.francis.proto.UserOuterClass.CreateUserInfo) request,
              (io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.UserInfoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.francis.proto.UserOuterClass.UpdateUserInfo) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHECK_PASSWORD:
          serviceImpl.checkPassword((com.francis.proto.UserOuterClass.CheckPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.francis.proto.UserOuterClass.CheckResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.francis.proto.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getGetUserListMethod())
              .addMethod(getGetUserByMobileMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getCheckPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
