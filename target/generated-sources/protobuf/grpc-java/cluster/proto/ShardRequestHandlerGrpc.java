package cluster.proto;

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
  private static volatile io.grpc.MethodDescriptor<cluster.proto.PutRequest,
      cluster.proto.ShardResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = cluster.proto.PutRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.PutRequest,
      cluster.proto.ShardResponse> getPutMethod() {
    io.grpc.MethodDescriptor<cluster.proto.PutRequest, cluster.proto.ShardResponse> getPutMethod;
    if ((getPutMethod = ShardRequestHandlerGrpc.getPutMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getPutMethod = ShardRequestHandlerGrpc.getPutMethod) == null) {
          ShardRequestHandlerGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<cluster.proto.PutRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.SetRequest,
      cluster.proto.ShardResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "set",
      requestType = cluster.proto.SetRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.SetRequest,
      cluster.proto.ShardResponse> getSetMethod() {
    io.grpc.MethodDescriptor<cluster.proto.SetRequest, cluster.proto.ShardResponse> getSetMethod;
    if ((getSetMethod = ShardRequestHandlerGrpc.getSetMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getSetMethod = ShardRequestHandlerGrpc.getSetMethod) == null) {
          ShardRequestHandlerGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<cluster.proto.SetRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.GetRequest,
      cluster.proto.ShardResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = cluster.proto.GetRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.GetRequest,
      cluster.proto.ShardResponse> getGetMethod() {
    io.grpc.MethodDescriptor<cluster.proto.GetRequest, cluster.proto.ShardResponse> getGetMethod;
    if ((getGetMethod = ShardRequestHandlerGrpc.getGetMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getGetMethod = ShardRequestHandlerGrpc.getGetMethod) == null) {
          ShardRequestHandlerGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<cluster.proto.GetRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.ContainsRequest,
      cluster.proto.ShardResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "contains",
      requestType = cluster.proto.ContainsRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.ContainsRequest,
      cluster.proto.ShardResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<cluster.proto.ContainsRequest, cluster.proto.ShardResponse> getContainsMethod;
    if ((getContainsMethod = ShardRequestHandlerGrpc.getContainsMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getContainsMethod = ShardRequestHandlerGrpc.getContainsMethod) == null) {
          ShardRequestHandlerGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<cluster.proto.ContainsRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.RemoveRequest,
      cluster.proto.ShardResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove",
      requestType = cluster.proto.RemoveRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.RemoveRequest,
      cluster.proto.ShardResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<cluster.proto.RemoveRequest, cluster.proto.ShardResponse> getRemoveMethod;
    if ((getRemoveMethod = ShardRequestHandlerGrpc.getRemoveMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getRemoveMethod = ShardRequestHandlerGrpc.getRemoveMethod) == null) {
          ShardRequestHandlerGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<cluster.proto.RemoveRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.ReplaceRequest,
      cluster.proto.ShardResponse> getReplaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "replace",
      requestType = cluster.proto.ReplaceRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.ReplaceRequest,
      cluster.proto.ShardResponse> getReplaceMethod() {
    io.grpc.MethodDescriptor<cluster.proto.ReplaceRequest, cluster.proto.ShardResponse> getReplaceMethod;
    if ((getReplaceMethod = ShardRequestHandlerGrpc.getReplaceMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getReplaceMethod = ShardRequestHandlerGrpc.getReplaceMethod) == null) {
          ShardRequestHandlerGrpc.getReplaceMethod = getReplaceMethod =
              io.grpc.MethodDescriptor.<cluster.proto.ReplaceRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "replace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ReplaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("replace"))
              .build();
        }
      }
    }
    return getReplaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.SizeRequest,
      cluster.proto.ShardResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "size",
      requestType = cluster.proto.SizeRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.SizeRequest,
      cluster.proto.ShardResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<cluster.proto.SizeRequest, cluster.proto.ShardResponse> getSizeMethod;
    if ((getSizeMethod = ShardRequestHandlerGrpc.getSizeMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getSizeMethod = ShardRequestHandlerGrpc.getSizeMethod) == null) {
          ShardRequestHandlerGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<cluster.proto.SizeRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.proto.ClearRequest,
      cluster.proto.ShardResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clear",
      requestType = cluster.proto.ClearRequest.class,
      responseType = cluster.proto.ShardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.proto.ClearRequest,
      cluster.proto.ShardResponse> getClearMethod() {
    io.grpc.MethodDescriptor<cluster.proto.ClearRequest, cluster.proto.ShardResponse> getClearMethod;
    if ((getClearMethod = ShardRequestHandlerGrpc.getClearMethod) == null) {
      synchronized (ShardRequestHandlerGrpc.class) {
        if ((getClearMethod = ShardRequestHandlerGrpc.getClearMethod) == null) {
          ShardRequestHandlerGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<cluster.proto.ClearRequest, cluster.proto.ShardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.proto.ShardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShardRequestHandlerMethodDescriptorSupplier("clear"))
              .build();
        }
      }
    }
    return getClearMethod;
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
    public void put(cluster.proto.PutRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void set(cluster.proto.SetRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     */
    public void get(cluster.proto.GetRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void contains(cluster.proto.ContainsRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     */
    public void remove(cluster.proto.RemoveRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     */
    public void replace(cluster.proto.ReplaceRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceMethod(), responseObserver);
    }

    /**
     */
    public void size(cluster.proto.SizeRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     */
    public void clear(cluster.proto.ClearRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.PutRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.SetRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.GetRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getContainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.ContainsRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.RemoveRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getReplaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.ReplaceRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_REPLACE)))
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.SizeRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                cluster.proto.ClearRequest,
                cluster.proto.ShardResponse>(
                  this, METHODID_CLEAR)))
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
    public void put(cluster.proto.PutRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void set(cluster.proto.SetRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(cluster.proto.GetRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contains(cluster.proto.ContainsRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(cluster.proto.RemoveRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replace(cluster.proto.ReplaceRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void size(cluster.proto.SizeRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clear(cluster.proto.ClearRequest request,
        io.grpc.stub.StreamObserver<cluster.proto.ShardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
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
    public cluster.proto.ShardResponse put(cluster.proto.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse set(cluster.proto.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse get(cluster.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse contains(cluster.proto.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse remove(cluster.proto.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse replace(cluster.proto.ReplaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse size(cluster.proto.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.proto.ShardResponse clear(cluster.proto.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> put(
        cluster.proto.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> set(
        cluster.proto.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> get(
        cluster.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> contains(
        cluster.proto.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> remove(
        cluster.proto.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> replace(
        cluster.proto.ReplaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> size(
        cluster.proto.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.proto.ShardResponse> clear(
        cluster.proto.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_SET = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_CONTAINS = 3;
  private static final int METHODID_REMOVE = 4;
  private static final int METHODID_REPLACE = 5;
  private static final int METHODID_SIZE = 6;
  private static final int METHODID_CLEAR = 7;

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
          serviceImpl.put((cluster.proto.PutRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((cluster.proto.SetRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((cluster.proto.GetRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((cluster.proto.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((cluster.proto.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_REPLACE:
          serviceImpl.replace((cluster.proto.ReplaceRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((cluster.proto.SizeRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((cluster.proto.ClearRequest) request,
              (io.grpc.stub.StreamObserver<cluster.proto.ShardResponse>) responseObserver);
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
      return cluster.proto.ShardRequest.getDescriptor();
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
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getContainsMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getReplaceMethod())
              .addMethod(getSizeMethod())
              .addMethod(getClearMethod())
              .build();
        }
      }
    }
    return result;
  }
}
