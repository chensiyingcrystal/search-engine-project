package cluster.internal.raft.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service definition for the Raft communication between cluster servers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: RaftRpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RaftCommunicationServiceGrpc {

  private RaftCommunicationServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.RaftCommunicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cluster.internal.raft.proto.RaftMessageRequest,
      cluster.internal.raft.proto.RaftMessageResponse> getHandleRaftMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "handleRaftMessage",
      requestType = cluster.internal.raft.proto.RaftMessageRequest.class,
      responseType = cluster.internal.raft.proto.RaftMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cluster.internal.raft.proto.RaftMessageRequest,
      cluster.internal.raft.proto.RaftMessageResponse> getHandleRaftMessageMethod() {
    io.grpc.MethodDescriptor<cluster.internal.raft.proto.RaftMessageRequest, cluster.internal.raft.proto.RaftMessageResponse> getHandleRaftMessageMethod;
    if ((getHandleRaftMessageMethod = RaftCommunicationServiceGrpc.getHandleRaftMessageMethod) == null) {
      synchronized (RaftCommunicationServiceGrpc.class) {
        if ((getHandleRaftMessageMethod = RaftCommunicationServiceGrpc.getHandleRaftMessageMethod) == null) {
          RaftCommunicationServiceGrpc.getHandleRaftMessageMethod = getHandleRaftMessageMethod =
              io.grpc.MethodDescriptor.<cluster.internal.raft.proto.RaftMessageRequest, cluster.internal.raft.proto.RaftMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "handleRaftMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.raft.proto.RaftMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.raft.proto.RaftMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RaftCommunicationServiceMethodDescriptorSupplier("handleRaftMessage"))
              .build();
        }
      }
    }
    return getHandleRaftMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftCommunicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceStub>() {
        @java.lang.Override
        public RaftCommunicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftCommunicationServiceStub(channel, callOptions);
        }
      };
    return RaftCommunicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftCommunicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceBlockingStub>() {
        @java.lang.Override
        public RaftCommunicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftCommunicationServiceBlockingStub(channel, callOptions);
        }
      };
    return RaftCommunicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftCommunicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RaftCommunicationServiceFutureStub>() {
        @java.lang.Override
        public RaftCommunicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RaftCommunicationServiceFutureStub(channel, callOptions);
        }
      };
    return RaftCommunicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service definition for the Raft communication between cluster servers.
   * </pre>
   */
  public static abstract class RaftCommunicationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<cluster.internal.raft.proto.RaftMessageRequest> handleRaftMessage(
        io.grpc.stub.StreamObserver<cluster.internal.raft.proto.RaftMessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHandleRaftMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHandleRaftMessageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                cluster.internal.raft.proto.RaftMessageRequest,
                cluster.internal.raft.proto.RaftMessageResponse>(
                  this, METHODID_HANDLE_RAFT_MESSAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition for the Raft communication between cluster servers.
   * </pre>
   */
  public static final class RaftCommunicationServiceStub extends io.grpc.stub.AbstractAsyncStub<RaftCommunicationServiceStub> {
    private RaftCommunicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftCommunicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftCommunicationServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<cluster.internal.raft.proto.RaftMessageRequest> handleRaftMessage(
        io.grpc.stub.StreamObserver<cluster.internal.raft.proto.RaftMessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHandleRaftMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition for the Raft communication between cluster servers.
   * </pre>
   */
  public static final class RaftCommunicationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RaftCommunicationServiceBlockingStub> {
    private RaftCommunicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftCommunicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftCommunicationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service definition for the Raft communication between cluster servers.
   * </pre>
   */
  public static final class RaftCommunicationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RaftCommunicationServiceFutureStub> {
    private RaftCommunicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftCommunicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RaftCommunicationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HANDLE_RAFT_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RaftCommunicationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RaftCommunicationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDLE_RAFT_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handleRaftMessage(
              (io.grpc.stub.StreamObserver<cluster.internal.raft.proto.RaftMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RaftCommunicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftCommunicationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftCommunicationService");
    }
  }

  private static final class RaftCommunicationServiceFileDescriptorSupplier
      extends RaftCommunicationServiceBaseDescriptorSupplier {
    RaftCommunicationServiceFileDescriptorSupplier() {}
  }

  private static final class RaftCommunicationServiceMethodDescriptorSupplier
      extends RaftCommunicationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RaftCommunicationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RaftCommunicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftCommunicationServiceFileDescriptorSupplier())
              .addMethod(getHandleRaftMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
