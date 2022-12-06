package cluster.external.shard.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: ShardRequest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShardRequestHandlerGrpc {

  private ShardRequestHandlerGrpc() {}

  public static final String SERVICE_NAME = "proto.ShardRequestHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cluster.external.shard.proto.PutRequest,
      cluster.external.shard.proto.ShardResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = cluster.external.shard.proto.PutRequest.class,
      responseType = cluster.external.shard.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.external.shard.proto.PutRequest,
      cluster.external.shard.proto.ShardResponse> getPutMethod() {
    io.grpc.MethodDescriptor<cluster.external.shard.proto.PutRequest, cluster.external.shard.proto.ShardResponse> getPutMethod;
    if ((getPutMethod = ShardRequestHandlerGrpc.getPutMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getPutMethod = ShardRequestHandlerGrpc.getPutMethod) == null) {
          ShardRequestHandlerGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<cluster.external.shard.proto.PutRequest, cluster.external.shard.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.external.shard.proto.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.external.shard.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.external.shard.proto.GetRequest,
      cluster.external.shard.proto.ShardResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = cluster.external.shard.proto.GetRequest.class,
      responseType = cluster.external.shard.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.external.shard.proto.GetRequest,
      cluster.external.shard.proto.ShardResponse> getGetMethod() {
    io.grpc.MethodDescriptor<cluster.external.shard.proto.GetRequest, cluster.external.shard.proto.ShardResponse> getGetMethod;
    if ((getGetMethod = ShardRequestHandlerGrpc.getGetMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getGetMethod = ShardRequestHandlerGrpc.getGetMethod) == null) {
          ShardRequestHandlerGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<cluster.external.shard.proto.GetRequest, cluster.external.shard.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.external.shard.proto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.external.shard.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShardRequestHandlerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerStub>() {
        @java.lang.Override
        public ShardRequestHandlerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardRequestHandlerStub(channel, callOptions);
        }
      };
    return ShardRequestHandlerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShardRequestHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerBlockingStub>() {
        @java.lang.Override
        public ShardRequestHandlerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardRequestHandlerBlockingStub(channel, callOptions);
        }
      };
    return ShardRequestHandlerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShardRequestHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardRequestHandlerFutureStub>() {
        @java.lang.Override
        public ShardRequestHandlerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardRequestHandlerFutureStub(channel, callOptions);
        }
      };
    return ShardRequestHandlerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ShardRequestHandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(cluster.external.shard.proto.PutRequest request,
        io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(cluster.external.shard.proto.GetRequest request,
        io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.external.shard.proto.PutRequest,
                cluster.external.shard.proto.ShardResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.external.shard.proto.GetRequest,
                cluster.external.shard.proto.ShardResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class ShardRequestHandlerStub extends io.grpc.stub.AbstractAsyncStub<ShardRequestHandlerStub> {
    private ShardRequestHandlerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardRequestHandlerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardRequestHandlerStub(channel, callOptions);
    }

    /**
     */
    public void put(cluster.external.shard.proto.PutRequest request,
        io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(cluster.external.shard.proto.GetRequest request,
        io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShardRequestHandlerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShardRequestHandlerBlockingStub> {
    private ShardRequestHandlerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardRequestHandlerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardRequestHandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public cluster.external.shard.proto.ShardResponse put(cluster.external.shard.proto.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.external.shard.proto.ShardResponse get(cluster.external.shard.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShardRequestHandlerFutureStub extends io.grpc.stub.AbstractFutureStub<ShardRequestHandlerFutureStub> {
    private ShardRequestHandlerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardRequestHandlerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardRequestHandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.external.shard.proto.ShardResponse> put(
        cluster.external.shard.proto.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.external.shard.proto.ShardResponse> get(
        cluster.external.shard.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShardRequestHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShardRequestHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((cluster.external.shard.proto.PutRequest) request,
              (io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((cluster.external.shard.proto.GetRequest) request,
              (io.grpc.stub.StreamObserver<cluster.external.shard.proto.ShardResponse>) responseObserver);
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

  private static abstract class ShardRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShardRequestHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cluster.external.shard.proto.ShardRequest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShardRequestHandler");
    }
  }

  private static final class ShardRequestHandlerFileDescriptorSupplier
      extends ShardRequestHandlerBaseDescriptorSupplier {
    ShardRequestHandlerFileDescriptorSupplier() {}
  }

  private static final class ShardRequestHandlerMethodDescriptorSupplier
      extends ShardRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShardRequestHandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShardRequestHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShardRequestHandlerFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
