package com.alibaba.benchmark.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *服务端接口类
 *todo
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: Complex.proto")
public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "grpc.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.alibaba.benchmark.grpc.ComplexDO,
      com.alibaba.benchmark.grpc.ComplexDO> METHOD_ECHO_COMPLEX_DO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "grpc.Greeter", "echoComplexDO"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.alibaba.benchmark.grpc.ComplexDO,
      com.alibaba.benchmark.grpc.ComplexDO> METHOD_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "grpc.Greeter", "echoComplexDOByServerSideStream"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.alibaba.benchmark.grpc.ComplexDO,
      com.alibaba.benchmark.grpc.ComplexDO> METHOD_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "grpc.Greeter", "echoComplexDOByClientSideStream"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.alibaba.benchmark.grpc.ComplexDO,
      com.alibaba.benchmark.grpc.ComplexDO> METHOD_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "grpc.Greeter", "echoComplexDOByBidirectionalStream"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.alibaba.benchmark.grpc.ComplexDO.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   *服务端接口类
   *todo
   * </pre>
   */
  public static interface Greeter {

    /**
     * <pre>
     *simple RPC
     * </pre>
     */
    public void echoComplexDO(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver);

    /**
     * <pre>
     *server-side streaming
     * </pre>
     */
    public void echoComplexDOByServerSideStream(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver);

    /**
     * <pre>
     *client-side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByClientSideStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver);

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByBidirectionalStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractGreeter implements Greeter, io.grpc.BindableService {

    @java.lang.Override
    public void echoComplexDO(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ECHO_COMPLEX_DO, responseObserver);
    }

    @java.lang.Override
    public void echoComplexDOByServerSideStream(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByClientSideStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByBidirectionalStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return GreeterGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   *服务端接口类
   *todo
   * </pre>
   */
  public static interface GreeterBlockingClient {

    /**
     * <pre>
     *simple RPC
     * </pre>
     */
    public com.alibaba.benchmark.grpc.ComplexDO echoComplexDO(com.alibaba.benchmark.grpc.ComplexDO request);

    /**
     * <pre>
     *server-side streaming
     * </pre>
     */
    public java.util.Iterator<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByServerSideStream(
        com.alibaba.benchmark.grpc.ComplexDO request);
  }

  /**
   * <pre>
   *服务端接口类
   *todo
   * </pre>
   */
  public static interface GreeterFutureClient {

    /**
     * <pre>
     *simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDO(
        com.alibaba.benchmark.grpc.ComplexDO request);
  }

  public static class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub>
      implements Greeter {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    @java.lang.Override
    public void echoComplexDO(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ECHO_COMPLEX_DO, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void echoComplexDOByServerSideStream(com.alibaba.benchmark.grpc.ComplexDO request,
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByClientSideStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByBidirectionalStream(
        io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM, getCallOptions()), responseObserver);
    }
  }

  public static class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.alibaba.benchmark.grpc.ComplexDO echoComplexDO(com.alibaba.benchmark.grpc.ComplexDO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ECHO_COMPLEX_DO, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDOByServerSideStream(
        com.alibaba.benchmark.grpc.ComplexDO request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM, getCallOptions(), request);
    }
  }

  public static class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.alibaba.benchmark.grpc.ComplexDO> echoComplexDO(
        com.alibaba.benchmark.grpc.ComplexDO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ECHO_COMPLEX_DO, getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO_COMPLEX_DO = 0;
  private static final int METHODID_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM = 1;
  private static final int METHODID_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM = 2;
  private static final int METHODID_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Greeter serviceImpl;
    private final int methodId;

    public MethodHandlers(Greeter serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO_COMPLEX_DO:
          serviceImpl.echoComplexDO((com.alibaba.benchmark.grpc.ComplexDO) request,
              (io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO>) responseObserver);
          break;
        case METHODID_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM:
          serviceImpl.echoComplexDOByServerSideStream((com.alibaba.benchmark.grpc.ComplexDO) request,
              (io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO>) responseObserver);
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
        case METHODID_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoComplexDOByClientSideStream(
              (io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO>) responseObserver);
        case METHODID_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoComplexDOByBidirectionalStream(
              (io.grpc.stub.StreamObserver<com.alibaba.benchmark.grpc.ComplexDO>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ECHO_COMPLEX_DO,
          asyncUnaryCall(
            new MethodHandlers<
              com.alibaba.benchmark.grpc.ComplexDO,
              com.alibaba.benchmark.grpc.ComplexDO>(
                serviceImpl, METHODID_ECHO_COMPLEX_DO)))
        .addMethod(
          METHOD_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.alibaba.benchmark.grpc.ComplexDO,
              com.alibaba.benchmark.grpc.ComplexDO>(
                serviceImpl, METHODID_ECHO_COMPLEX_DOBY_SERVER_SIDE_STREAM)))
        .addMethod(
          METHOD_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM,
          asyncClientStreamingCall(
            new MethodHandlers<
              com.alibaba.benchmark.grpc.ComplexDO,
              com.alibaba.benchmark.grpc.ComplexDO>(
                serviceImpl, METHODID_ECHO_COMPLEX_DOBY_CLIENT_SIDE_STREAM)))
        .addMethod(
          METHOD_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM,
          asyncBidiStreamingCall(
            new MethodHandlers<
              com.alibaba.benchmark.grpc.ComplexDO,
              com.alibaba.benchmark.grpc.ComplexDO>(
                serviceImpl, METHODID_ECHO_COMPLEX_DOBY_BIDIRECTIONAL_STREAM)))
        .build();
  }
}
