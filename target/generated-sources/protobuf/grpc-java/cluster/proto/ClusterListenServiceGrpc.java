package cluster.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: ClusterListener.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterListenServiceGrpc {

  private ClusterListenServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.ClusterListenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cluster.proto.ClusterEndpointsRequest,
      cluster.proto.ClusterEndpointsResponse> getListenClusterEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listenClusterEndpoints",
      requestType = cluster.proto.ClusterEndpointsRequest.class,
      responseType = cluster.proto.ClusterEndpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cluster.proto.ClusterEndpointsRequest,
      cluster.proto.ClusterEndpointsResponse> getListenClusterEndpointsMethod() {
    io.grpc.MethodDescriptor<cluster.proto.ClusterEndpointsRequest, cluster.proto.ClusterEndpointsResponse> getListenClusterEndpointsMethod;
    if ((getListenClusterEndpointsMethod = ClusterListenServiceGrpc.getListenClusterEndpointsMethod) == null) {
      synchronized (ClusterListenServiceGrpc.class) {
        if ((getListenClusterEndpointsMethod = ClusterListenServiceGrpc.getListenClusterEndpointsMethod) == null) {
          ClusterListenServiceGrpc.getListenClusterEndpointsMethod = getListenClusterEndpointsMethod =
              io.grpc.MethodDescriptor.<cluster.proto.ClusterEndpointsRequest, cluster.proto.ClusterEndpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listenClusterEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ClusterEndpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ClusterEndpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterListenServiceMethodDescriptorSupplier("listenClusterEndpoints"))
              .build();
        }
      }
    }
    return getListenClusterEndpointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterListenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceStub>() {
        @java.lang.Override
        public ClusterListenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterListenServiceStub(channel, callOptions);
        }
      };
    return ClusterListenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterListenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceBlockingStub>() {
        @java.lang.Override
        public ClusterListenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterListenServiceBlockingStub(channel, callOptions);
        }
      };
    return ClusterListenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterListenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterListenServiceFutureStub>() {
        @java.lang.Override
        public ClusterListenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterListenServiceFutureStub(channel, callOptions);
        }
      };
    return ClusterListenServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClusterListenServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void listenClusterEndpoints(cluster.proto.ClusterEndpointsRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ClusterEndpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenClusterEndpointsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListenClusterEndpointsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                cluster.proto.ClusterEndpointsRequest,
                cluster.proto.ClusterEndpointsResponse>(
                  this, METHODID_LISTEN_CLUSTER_ENDPOINTS)))
          .build();
    }
  }

  /**
   */
  public static final class ClusterListenServiceStub extends io.grpc.stub.AbstractAsyncStub<ClusterListenServiceStub> {
    private ClusterListenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterListenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterListenServiceStub(channel, callOptions);
    }

    /**
     */
    public void listenClusterEndpoints(cluster.proto.ClusterEndpointsRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ClusterEndpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListenClusterEndpointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClusterListenServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClusterListenServiceBlockingStub> {
    private ClusterListenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterListenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterListenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<cluster.proto.ClusterEndpointsResponse> listenClusterEndpoints(
        cluster.proto.ClusterEndpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListenClusterEndpointsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClusterListenServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ClusterListenServiceFutureStub> {
    private ClusterListenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterListenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterListenServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LISTEN_CLUSTER_ENDPOINTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterListenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterListenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTEN_CLUSTER_ENDPOINTS:
          serviceImpl.listenClusterEndpoints((cluster.proto.ClusterEndpointsRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ClusterEndpointsResponse>) responseObserver);
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

  private static abstract class ClusterListenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterListenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cluster.proto.ClusterListener.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterListenService");
    }
  }

  private static final class ClusterListenServiceFileDescriptorSupplier
      extends ClusterListenServiceBaseDescriptorSupplier {
    ClusterListenServiceFileDescriptorSupplier() {}
  }

  private static final class ClusterListenServiceMethodDescriptorSupplier
      extends ClusterListenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterListenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterListenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterListenServiceFileDescriptorSupplier())
              .addMethod(getListenClusterEndpointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
