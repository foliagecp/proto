package org.listware.sdk.pbcmdb.pbqdsl;

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
    comments = "Source: pbcmdb/pbqdsl/service.proto")
public final class QdslServiceGrpc {

  private QdslServiceGrpc() {}

  public static final String SERVICE_NAME = "org.listware.sdk.pbcmdb.pbqdsl.QdslService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQdslMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query,
      org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> METHOD_QDSL = getQdslMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query,
      org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> getQdslMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query,
      org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> getQdslMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query, org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> getQdslMethod;
    if ((getQdslMethod = QdslServiceGrpc.getQdslMethod) == null) {
      synchronized (QdslServiceGrpc.class) {
        if ((getQdslMethod = QdslServiceGrpc.getQdslMethod) == null) {
          QdslServiceGrpc.getQdslMethod = getQdslMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query, org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.pbqdsl.QdslService", "Qdsl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements.getDefaultInstance()))
                  .setSchemaDescriptor(new QdslServiceMethodDescriptorSupplier("Qdsl"))
                  .build();
          }
        }
     }
     return getQdslMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QdslServiceStub newStub(io.grpc.Channel channel) {
    return new QdslServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QdslServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QdslServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QdslServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QdslServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QdslServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void qdsl(org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> responseObserver) {
      asyncUnimplementedUnaryCall(getQdslMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQdslMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query,
                org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements>(
                  this, METHODID_QDSL)))
          .build();
    }
  }

  /**
   */
  public static final class QdslServiceStub extends io.grpc.stub.AbstractStub<QdslServiceStub> {
    private QdslServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QdslServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QdslServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QdslServiceStub(channel, callOptions);
    }

    /**
     */
    public void qdsl(org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQdslMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QdslServiceBlockingStub extends io.grpc.stub.AbstractStub<QdslServiceBlockingStub> {
    private QdslServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QdslServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QdslServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QdslServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements qdsl(org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query request) {
      return blockingUnaryCall(
          getChannel(), getQdslMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QdslServiceFutureStub extends io.grpc.stub.AbstractStub<QdslServiceFutureStub> {
    private QdslServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QdslServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QdslServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QdslServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements> qdsl(
        org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query request) {
      return futureUnaryCall(
          getChannel().newCall(getQdslMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QDSL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QdslServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QdslServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QDSL:
          serviceImpl.qdsl((org.listware.sdk.pbcmdb.pbqdsl.QDSL.Query) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbqdsl.QDSL.Elements>) responseObserver);
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

  private static abstract class QdslServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QdslServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.listware.sdk.pbcmdb.pbqdsl.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QdslService");
    }
  }

  private static final class QdslServiceFileDescriptorSupplier
      extends QdslServiceBaseDescriptorSupplier {
    QdslServiceFileDescriptorSupplier() {}
  }

  private static final class QdslServiceMethodDescriptorSupplier
      extends QdslServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QdslServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QdslServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QdslServiceFileDescriptorSupplier())
              .addMethod(getQdslMethod())
              .build();
        }
      }
    }
    return result;
  }
}
