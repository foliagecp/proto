package org.listware.sdk.pbcmdb;

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
    comments = "Source: pbcmdb/service.proto")
public final class EdgeServiceGrpc {

  private EdgeServiceGrpc() {}

  public static final String SERVICE_NAME = "org.listware.sdk.pbcmdb.EdgeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> METHOD_CREATE = getCreateMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getCreateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response> getCreateMethod;
    if ((getCreateMethod = EdgeServiceGrpc.getCreateMethod) == null) {
      synchronized (EdgeServiceGrpc.class) {
        if ((getCreateMethod = EdgeServiceGrpc.getCreateMethod) == null) {
          EdgeServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.EdgeService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EdgeServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReadMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> METHOD_READ = getReadMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getReadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getReadMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response> getReadMethod;
    if ((getReadMethod = EdgeServiceGrpc.getReadMethod) == null) {
      synchronized (EdgeServiceGrpc.class) {
        if ((getReadMethod = EdgeServiceGrpc.getReadMethod) == null) {
          EdgeServiceGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.EdgeService", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EdgeServiceMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> METHOD_UPDATE = getUpdateMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getUpdateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getUpdateMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response> getUpdateMethod;
    if ((getUpdateMethod = EdgeServiceGrpc.getUpdateMethod) == null) {
      synchronized (EdgeServiceGrpc.class) {
        if ((getUpdateMethod = EdgeServiceGrpc.getUpdateMethod) == null) {
          EdgeServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.EdgeService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EdgeServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRemoveMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> METHOD_REMOVE = getRemoveMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getRemoveMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request,
      org.listware.sdk.pbcmdb.Core.Response> getRemoveMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response> getRemoveMethod;
    if ((getRemoveMethod = EdgeServiceGrpc.getRemoveMethod) == null) {
      synchronized (EdgeServiceGrpc.class) {
        if ((getRemoveMethod = EdgeServiceGrpc.getRemoveMethod) == null) {
          EdgeServiceGrpc.getRemoveMethod = getRemoveMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.EdgeService", "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EdgeServiceMethodDescriptorSupplier("Remove"))
                  .build();
          }
        }
     }
     return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EdgeServiceStub newStub(io.grpc.Channel channel) {
    return new EdgeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EdgeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EdgeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EdgeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EdgeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EdgeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void update(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void remove(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.Core.Request,
                org.listware.sdk.pbcmdb.Core.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.Core.Request,
                org.listware.sdk.pbcmdb.Core.Response>(
                  this, METHODID_READ)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.Core.Request,
                org.listware.sdk.pbcmdb.Core.Response>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.Core.Request,
                org.listware.sdk.pbcmdb.Core.Response>(
                  this, METHODID_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class EdgeServiceStub extends io.grpc.stub.AbstractStub<EdgeServiceStub> {
    private EdgeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EdgeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EdgeServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(org.listware.sdk.pbcmdb.Core.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EdgeServiceBlockingStub extends io.grpc.stub.AbstractStub<EdgeServiceBlockingStub> {
    private EdgeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EdgeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EdgeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.Core.Response create(org.listware.sdk.pbcmdb.Core.Request request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.Core.Response read(org.listware.sdk.pbcmdb.Core.Request request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.Core.Response update(org.listware.sdk.pbcmdb.Core.Request request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.Core.Response remove(org.listware.sdk.pbcmdb.Core.Request request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EdgeServiceFutureStub extends io.grpc.stub.AbstractStub<EdgeServiceFutureStub> {
    private EdgeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EdgeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EdgeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.Core.Response> create(
        org.listware.sdk.pbcmdb.Core.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.Core.Response> read(
        org.listware.sdk.pbcmdb.Core.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.Core.Response> update(
        org.listware.sdk.pbcmdb.Core.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.Core.Response> remove(
        org.listware.sdk.pbcmdb.Core.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_REMOVE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EdgeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EdgeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((org.listware.sdk.pbcmdb.Core.Request) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((org.listware.sdk.pbcmdb.Core.Request) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((org.listware.sdk.pbcmdb.Core.Request) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((org.listware.sdk.pbcmdb.Core.Request) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.Core.Response>) responseObserver);
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

  private static abstract class EdgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EdgeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.listware.sdk.pbcmdb.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EdgeService");
    }
  }

  private static final class EdgeServiceFileDescriptorSupplier
      extends EdgeServiceBaseDescriptorSupplier {
    EdgeServiceFileDescriptorSupplier() {}
  }

  private static final class EdgeServiceMethodDescriptorSupplier
      extends EdgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EdgeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EdgeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EdgeServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
