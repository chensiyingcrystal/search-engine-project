package cluster.internal.management.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: ClusterHealthManagement.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManagementRequestHandlerGrpc {

  private ManagementRequestHandlerGrpc() {}

  public static final String SERVICE_NAME = "proto.ManagementRequestHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cluster.internal.management.proto.GetRaftNodeReportRequest,
      cluster.internal.management.proto.GetRaftNodeReportResponse> getGetRaftNodeReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRaftNodeReport",
      requestType = cluster.internal.management.proto.GetRaftNodeReportRequest.class,
      responseType = cluster.internal.management.proto.GetRaftNodeReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.internal.management.proto.GetRaftNodeReportRequest,
      cluster.internal.management.proto.GetRaftNodeReportResponse> getGetRaftNodeReportMethod() {
    io.grpc.MethodDescriptor<cluster.internal.management.proto.GetRaftNodeReportRequest, cluster.internal.management.proto.GetRaftNodeReportResponse> getGetRaftNodeReportMethod;
    if ((getGetRaftNodeReportMethod = ManagementRequestHandlerGrpc.getGetRaftNodeReportMethod) == null) {
      synchronized (ManagementRequestHandlerGrpc.class) {
        if ((getGetRaftNodeReportMethod = ManagementRequestHandlerGrpc.getGetRaftNodeReportMethod) == null) {
          ManagementRequestHandlerGrpc.getGetRaftNodeReportMethod = getGetRaftNodeReportMethod =
              io.grpc.MethodDescriptor.<cluster.internal.management.proto.GetRaftNodeReportRequest, cluster.internal.management.proto.GetRaftNodeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRaftNodeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.GetRaftNodeReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.GetRaftNodeReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementRequestHandlerMethodDescriptorSupplier("getRaftNodeReport"))
              .build();
        }
      }
    }
    return getGetRaftNodeReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointAddressRequest,
      cluster.internal.management.proto.AddRaftEndpointAddressResponse> getAddRaftEndpointAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRaftEndpointAddress",
      requestType = cluster.internal.management.proto.AddRaftEndpointAddressRequest.class,
      responseType = cluster.internal.management.proto.AddRaftEndpointAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointAddressRequest,
      cluster.internal.management.proto.AddRaftEndpointAddressResponse> getAddRaftEndpointAddressMethod() {
    io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointAddressRequest, cluster.internal.management.proto.AddRaftEndpointAddressResponse> getAddRaftEndpointAddressMethod;
    if ((getAddRaftEndpointAddressMethod = ManagementRequestHandlerGrpc.getAddRaftEndpointAddressMethod) == null) {
      synchronized (ManagementRequestHandlerGrpc.class) {
        if ((getAddRaftEndpointAddressMethod = ManagementRequestHandlerGrpc.getAddRaftEndpointAddressMethod) == null) {
          ManagementRequestHandlerGrpc.getAddRaftEndpointAddressMethod = getAddRaftEndpointAddressMethod =
              io.grpc.MethodDescriptor.<cluster.internal.management.proto.AddRaftEndpointAddressRequest, cluster.internal.management.proto.AddRaftEndpointAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRaftEndpointAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.AddRaftEndpointAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.AddRaftEndpointAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementRequestHandlerMethodDescriptorSupplier("addRaftEndpointAddress"))
              .build();
        }
      }
    }
    return getAddRaftEndpointAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointRequest,
      cluster.internal.management.proto.AddRaftEndpointResponse> getAddRaftEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRaftEndpoint",
      requestType = cluster.internal.management.proto.AddRaftEndpointRequest.class,
      responseType = cluster.internal.management.proto.AddRaftEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointRequest,
      cluster.internal.management.proto.AddRaftEndpointResponse> getAddRaftEndpointMethod() {
    io.grpc.MethodDescriptor<cluster.internal.management.proto.AddRaftEndpointRequest, cluster.internal.management.proto.AddRaftEndpointResponse> getAddRaftEndpointMethod;
    if ((getAddRaftEndpointMethod = ManagementRequestHandlerGrpc.getAddRaftEndpointMethod) == null) {
      synchronized (ManagementRequestHandlerGrpc.class) {
        if ((getAddRaftEndpointMethod = ManagementRequestHandlerGrpc.getAddRaftEndpointMethod) == null) {
          ManagementRequestHandlerGrpc.getAddRaftEndpointMethod = getAddRaftEndpointMethod =
              io.grpc.MethodDescriptor.<cluster.internal.management.proto.AddRaftEndpointRequest, cluster.internal.management.proto.AddRaftEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRaftEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.AddRaftEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.internal.management.proto.AddRaftEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementRequestHandlerMethodDescriptorSupplier("addRaftEndpoint"))
              .build();
        }
      }
    }
    return getAddRaftEndpointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagementRequestHandlerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerStub>() {
        @java.lang.Override
        public ManagementRequestHandlerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementRequestHandlerStub(channel, callOptions);
        }
      };
    return ManagementRequestHandlerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagementRequestHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerBlockingStub>() {
        @java.lang.Override
        public ManagementRequestHandlerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementRequestHandlerBlockingStub(channel, callOptions);
        }
      };
    return ManagementRequestHandlerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagementRequestHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementRequestHandlerFutureStub>() {
        @java.lang.Override
        public ManagementRequestHandlerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementRequestHandlerFutureStub(channel, callOptions);
        }
      };
    return ManagementRequestHandlerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ManagementRequestHandlerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetches the RaftNodeReport object from the RaftNode object running
     * inside a server
     * </pre>
     */
    public void getRaftNodeReport(cluster.internal.management.proto.GetRaftNodeReportRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.GetRaftNodeReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRaftNodeReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds the given RaftEndpoint -&gt; address mapping to a server.
     * Before adding a new server is added to the cluster, its
     * RaftEndpoint's address must be added to all running servers.
     * </pre>
     */
    public void addRaftEndpointAddress(cluster.internal.management.proto.AddRaftEndpointAddressRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRaftEndpointAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a new server to the cluster.
     * When this api is called, microraft will trigger corresponding membershipchange request
     *note that this request is only sent to the leader
     *before calling this, every current node must have raftendpoint address of the adding node
     *This can be implemented at the method above
     * </pre>
     */
    public void addRaftEndpoint(cluster.internal.management.proto.AddRaftEndpointRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRaftEndpointMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRaftNodeReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.internal.management.proto.GetRaftNodeReportRequest,
                cluster.internal.management.proto.GetRaftNodeReportResponse>(
                  this, METHODID_GET_RAFT_NODE_REPORT)))
          .addMethod(
            getAddRaftEndpointAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.internal.management.proto.AddRaftEndpointAddressRequest,
                cluster.internal.management.proto.AddRaftEndpointAddressResponse>(
                  this, METHODID_ADD_RAFT_ENDPOINT_ADDRESS)))
          .addMethod(
            getAddRaftEndpointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.internal.management.proto.AddRaftEndpointRequest,
                cluster.internal.management.proto.AddRaftEndpointResponse>(
                  this, METHODID_ADD_RAFT_ENDPOINT)))
          .build();
    }
  }

  /**
   */
  public static final class ManagementRequestHandlerStub extends io.grpc.stub.AbstractAsyncStub<ManagementRequestHandlerStub> {
    private ManagementRequestHandlerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementRequestHandlerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementRequestHandlerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetches the RaftNodeReport object from the RaftNode object running
     * inside a server
     * </pre>
     */
    public void getRaftNodeReport(cluster.internal.management.proto.GetRaftNodeReportRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.GetRaftNodeReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRaftNodeReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds the given RaftEndpoint -&gt; address mapping to a server.
     * Before adding a new server is added to the cluster, its
     * RaftEndpoint's address must be added to all running servers.
     * </pre>
     */
    public void addRaftEndpointAddress(cluster.internal.management.proto.AddRaftEndpointAddressRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRaftEndpointAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a new server to the cluster.
     * When this api is called, microraft will trigger corresponding membershipchange request
     *note that this request is only sent to the leader
     *before calling this, every current node must have raftendpoint address of the adding node
     *This can be implemented at the method above
     * </pre>
     */
    public void addRaftEndpoint(cluster.internal.management.proto.AddRaftEndpointRequest request,
        io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRaftEndpointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ManagementRequestHandlerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ManagementRequestHandlerBlockingStub> {
    private ManagementRequestHandlerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementRequestHandlerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementRequestHandlerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetches the RaftNodeReport object from the RaftNode object running
     * inside a server
     * </pre>
     */
    public cluster.internal.management.proto.GetRaftNodeReportResponse getRaftNodeReport(cluster.internal.management.proto.GetRaftNodeReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRaftNodeReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds the given RaftEndpoint -&gt; address mapping to a server.
     * Before adding a new server is added to the cluster, its
     * RaftEndpoint's address must be added to all running servers.
     * </pre>
     */
    public cluster.internal.management.proto.AddRaftEndpointAddressResponse addRaftEndpointAddress(cluster.internal.management.proto.AddRaftEndpointAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRaftEndpointAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a new server to the cluster.
     * When this api is called, microraft will trigger corresponding membershipchange request
     *note that this request is only sent to the leader
     *before calling this, every current node must have raftendpoint address of the adding node
     *This can be implemented at the method above
     * </pre>
     */
    public cluster.internal.management.proto.AddRaftEndpointResponse addRaftEndpoint(cluster.internal.management.proto.AddRaftEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRaftEndpointMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ManagementRequestHandlerFutureStub extends io.grpc.stub.AbstractFutureStub<ManagementRequestHandlerFutureStub> {
    private ManagementRequestHandlerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementRequestHandlerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementRequestHandlerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetches the RaftNodeReport object from the RaftNode object running
     * inside a server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.internal.management.proto.GetRaftNodeReportResponse> getRaftNodeReport(
        cluster.internal.management.proto.GetRaftNodeReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRaftNodeReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds the given RaftEndpoint -&gt; address mapping to a server.
     * Before adding a new server is added to the cluster, its
     * RaftEndpoint's address must be added to all running servers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.internal.management.proto.AddRaftEndpointAddressResponse> addRaftEndpointAddress(
        cluster.internal.management.proto.AddRaftEndpointAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRaftEndpointAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a new server to the cluster.
     * When this api is called, microraft will trigger corresponding membershipchange request
     *note that this request is only sent to the leader
     *before calling this, every current node must have raftendpoint address of the adding node
     *This can be implemented at the method above
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.internal.management.proto.AddRaftEndpointResponse> addRaftEndpoint(
        cluster.internal.management.proto.AddRaftEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRaftEndpointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RAFT_NODE_REPORT = 0;
  private static final int METHODID_ADD_RAFT_ENDPOINT_ADDRESS = 1;
  private static final int METHODID_ADD_RAFT_ENDPOINT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagementRequestHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagementRequestHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RAFT_NODE_REPORT:
          serviceImpl.getRaftNodeReport((cluster.internal.management.proto.GetRaftNodeReportRequest) request,
              (io.grpc.stub.StreamObserver<cluster.internal.management.proto.GetRaftNodeReportResponse>) responseObserver);
          break;
        case METHODID_ADD_RAFT_ENDPOINT_ADDRESS:
          serviceImpl.addRaftEndpointAddress((cluster.internal.management.proto.AddRaftEndpointAddressRequest) request,
              (io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointAddressResponse>) responseObserver);
          break;
        case METHODID_ADD_RAFT_ENDPOINT:
          serviceImpl.addRaftEndpoint((cluster.internal.management.proto.AddRaftEndpointRequest) request,
              (io.grpc.stub.StreamObserver<cluster.internal.management.proto.AddRaftEndpointResponse>) responseObserver);
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

  private static abstract class ManagementRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagementRequestHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cluster.internal.management.proto.ClusterHealthManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagementRequestHandler");
    }
  }

  private static final class ManagementRequestHandlerFileDescriptorSupplier
      extends ManagementRequestHandlerBaseDescriptorSupplier {
    ManagementRequestHandlerFileDescriptorSupplier() {}
  }

  private static final class ManagementRequestHandlerMethodDescriptorSupplier
      extends ManagementRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagementRequestHandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagementRequestHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagementRequestHandlerFileDescriptorSupplier())
              .addMethod(getGetRaftNodeReportMethod())
              .addMethod(getAddRaftEndpointAddressMethod())
              .addMethod(getAddRaftEndpointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
