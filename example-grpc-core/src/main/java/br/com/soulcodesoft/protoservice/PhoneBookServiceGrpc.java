package br.com.soulcodesoft.protoservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: proto/service/phone-book-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PhoneBookServiceGrpc {

  private PhoneBookServiceGrpc() {}

  public static final String SERVICE_NAME = "service.PhoneBookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactSimpleRpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordContactSimpleRpc",
      requestType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      responseType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactSimpleRpcMethod() {
    io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactSimpleRpcMethod;
    if ((getRecordContactSimpleRpcMethod = PhoneBookServiceGrpc.getRecordContactSimpleRpcMethod) == null) {
      synchronized (PhoneBookServiceGrpc.class) {
        if ((getRecordContactSimpleRpcMethod = PhoneBookServiceGrpc.getRecordContactSimpleRpcMethod) == null) {
          PhoneBookServiceGrpc.getRecordContactSimpleRpcMethod = getRecordContactSimpleRpcMethod =
              io.grpc.MethodDescriptor.<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordContactSimpleRpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookServiceMethodDescriptorSupplier("recordContactSimpleRpc"))
              .build();
        }
      }
    }
    return getRecordContactSimpleRpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordContactServerStream",
      requestType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      responseType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactServerStreamMethod() {
    io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactServerStreamMethod;
    if ((getRecordContactServerStreamMethod = PhoneBookServiceGrpc.getRecordContactServerStreamMethod) == null) {
      synchronized (PhoneBookServiceGrpc.class) {
        if ((getRecordContactServerStreamMethod = PhoneBookServiceGrpc.getRecordContactServerStreamMethod) == null) {
          PhoneBookServiceGrpc.getRecordContactServerStreamMethod = getRecordContactServerStreamMethod =
              io.grpc.MethodDescriptor.<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordContactServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookServiceMethodDescriptorSupplier("recordContactServerStream"))
              .build();
        }
      }
    }
    return getRecordContactServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordContactClientStream",
      requestType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      responseType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactClientStreamMethod() {
    io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactClientStreamMethod;
    if ((getRecordContactClientStreamMethod = PhoneBookServiceGrpc.getRecordContactClientStreamMethod) == null) {
      synchronized (PhoneBookServiceGrpc.class) {
        if ((getRecordContactClientStreamMethod = PhoneBookServiceGrpc.getRecordContactClientStreamMethod) == null) {
          PhoneBookServiceGrpc.getRecordContactClientStreamMethod = getRecordContactClientStreamMethod =
              io.grpc.MethodDescriptor.<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordContactClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookServiceMethodDescriptorSupplier("recordContactClientStream"))
              .build();
        }
      }
    }
    return getRecordContactClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactBidirecionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordContactBidirecionalStream",
      requestType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      responseType = br.com.soulcodesoft.protoentity.ContactMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage,
      br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactBidirecionalStreamMethod() {
    io.grpc.MethodDescriptor<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage> getRecordContactBidirecionalStreamMethod;
    if ((getRecordContactBidirecionalStreamMethod = PhoneBookServiceGrpc.getRecordContactBidirecionalStreamMethod) == null) {
      synchronized (PhoneBookServiceGrpc.class) {
        if ((getRecordContactBidirecionalStreamMethod = PhoneBookServiceGrpc.getRecordContactBidirecionalStreamMethod) == null) {
          PhoneBookServiceGrpc.getRecordContactBidirecionalStreamMethod = getRecordContactBidirecionalStreamMethod =
              io.grpc.MethodDescriptor.<br.com.soulcodesoft.protoentity.ContactMessage, br.com.soulcodesoft.protoentity.ContactMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordContactBidirecionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.soulcodesoft.protoentity.ContactMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PhoneBookServiceMethodDescriptorSupplier("recordContactBidirecionalStream"))
              .build();
        }
      }
    }
    return getRecordContactBidirecionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhoneBookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceStub>() {
        @java.lang.Override
        public PhoneBookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookServiceStub(channel, callOptions);
        }
      };
    return PhoneBookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhoneBookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceBlockingStub>() {
        @java.lang.Override
        public PhoneBookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookServiceBlockingStub(channel, callOptions);
        }
      };
    return PhoneBookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhoneBookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhoneBookServiceFutureStub>() {
        @java.lang.Override
        public PhoneBookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhoneBookServiceFutureStub(channel, callOptions);
        }
      };
    return PhoneBookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PhoneBookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void recordContactSimpleRpc(br.com.soulcodesoft.protoentity.ContactMessage request,
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordContactSimpleRpcMethod(), responseObserver);
    }

    /**
     */
    public void recordContactServerStream(br.com.soulcodesoft.protoentity.ContactMessage request,
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordContactServerStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> recordContactClientStream(
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordContactClientStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> recordContactBidirecionalStream(
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordContactBidirecionalStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordContactSimpleRpcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.soulcodesoft.protoentity.ContactMessage,
                br.com.soulcodesoft.protoentity.ContactMessage>(
                  this, METHODID_RECORD_CONTACT_SIMPLE_RPC)))
          .addMethod(
            getRecordContactServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                br.com.soulcodesoft.protoentity.ContactMessage,
                br.com.soulcodesoft.protoentity.ContactMessage>(
                  this, METHODID_RECORD_CONTACT_SERVER_STREAM)))
          .addMethod(
            getRecordContactClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                br.com.soulcodesoft.protoentity.ContactMessage,
                br.com.soulcodesoft.protoentity.ContactMessage>(
                  this, METHODID_RECORD_CONTACT_CLIENT_STREAM)))
          .addMethod(
            getRecordContactBidirecionalStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                br.com.soulcodesoft.protoentity.ContactMessage,
                br.com.soulcodesoft.protoentity.ContactMessage>(
                  this, METHODID_RECORD_CONTACT_BIDIRECIONAL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class PhoneBookServiceStub extends io.grpc.stub.AbstractAsyncStub<PhoneBookServiceStub> {
    private PhoneBookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookServiceStub(channel, callOptions);
    }

    /**
     */
    public void recordContactSimpleRpc(br.com.soulcodesoft.protoentity.ContactMessage request,
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordContactSimpleRpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordContactServerStream(br.com.soulcodesoft.protoentity.ContactMessage request,
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRecordContactServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> recordContactClientStream(
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRecordContactClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> recordContactBidirecionalStream(
        io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRecordContactBidirecionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PhoneBookServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PhoneBookServiceBlockingStub> {
    private PhoneBookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.soulcodesoft.protoentity.ContactMessage recordContactSimpleRpc(br.com.soulcodesoft.protoentity.ContactMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordContactSimpleRpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<br.com.soulcodesoft.protoentity.ContactMessage> recordContactServerStream(
        br.com.soulcodesoft.protoentity.ContactMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRecordContactServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PhoneBookServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PhoneBookServiceFutureStub> {
    private PhoneBookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneBookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhoneBookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.soulcodesoft.protoentity.ContactMessage> recordContactSimpleRpc(
        br.com.soulcodesoft.protoentity.ContactMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordContactSimpleRpcMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_CONTACT_SIMPLE_RPC = 0;
  private static final int METHODID_RECORD_CONTACT_SERVER_STREAM = 1;
  private static final int METHODID_RECORD_CONTACT_CLIENT_STREAM = 2;
  private static final int METHODID_RECORD_CONTACT_BIDIRECIONAL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhoneBookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhoneBookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_CONTACT_SIMPLE_RPC:
          serviceImpl.recordContactSimpleRpc((br.com.soulcodesoft.protoentity.ContactMessage) request,
              (io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage>) responseObserver);
          break;
        case METHODID_RECORD_CONTACT_SERVER_STREAM:
          serviceImpl.recordContactServerStream((br.com.soulcodesoft.protoentity.ContactMessage) request,
              (io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage>) responseObserver);
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
        case METHODID_RECORD_CONTACT_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordContactClientStream(
              (io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage>) responseObserver);
        case METHODID_RECORD_CONTACT_BIDIRECIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordContactBidirecionalStream(
              (io.grpc.stub.StreamObserver<br.com.soulcodesoft.protoentity.ContactMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PhoneBookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhoneBookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.soulcodesoft.protoservice.PhoneBook.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhoneBookService");
    }
  }

  private static final class PhoneBookServiceFileDescriptorSupplier
      extends PhoneBookServiceBaseDescriptorSupplier {
    PhoneBookServiceFileDescriptorSupplier() {}
  }

  private static final class PhoneBookServiceMethodDescriptorSupplier
      extends PhoneBookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhoneBookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PhoneBookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhoneBookServiceFileDescriptorSupplier())
              .addMethod(getRecordContactSimpleRpcMethod())
              .addMethod(getRecordContactServerStreamMethod())
              .addMethod(getRecordContactClientStreamMethod())
              .addMethod(getRecordContactBidirecionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
