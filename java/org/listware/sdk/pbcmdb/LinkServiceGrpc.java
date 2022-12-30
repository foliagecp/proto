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
public final class LinkServiceGrpc {

  private LinkServiceGrpc() {}

  public static final String SERVICE_NAME = "org.listware.sdk.pbcmdb.LinkService";

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
    if ((getCreateMethod = LinkServiceGrpc.getCreateMethod) == null) {
      synchronized (LinkServiceGrpc.class) {
        if ((getCreateMethod = LinkServiceGrpc.getCreateMethod) == null) {
          LinkServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.LinkService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LinkServiceMethodDescriptorSupplier("Create"))
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
    if ((getReadMethod = LinkServiceGrpc.getReadMethod) == null) {
      synchronized (LinkServiceGrpc.class) {
        if ((getReadMethod = LinkServiceGrpc.getReadMethod) == null) {
          LinkServiceGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.LinkService", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LinkServiceMethodDescriptorSupplier("Read"))
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
    if ((getUpdateMethod = LinkServiceGrpc.getUpdateMethod) == null) {
      synchronized (LinkServiceGrpc.class) {
        if ((getUpdateMethod = LinkServiceGrpc.getUpdateMethod) == null) {
          LinkServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.LinkService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LinkServiceMethodDescriptorSupplier("Update"))
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
    if ((getRemoveMethod = LinkServiceGrpc.getRemoveMethod) == null) {
      synchronized (LinkServiceGrpc.class) {
        if ((getRemoveMethod = LinkServiceGrpc.getRemoveMethod) == null) {
          LinkServiceGrpc.getRemoveMethod = getRemoveMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.Core.Request, org.listware.sdk.pbcmdb.Core.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.LinkService", "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.Core.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LinkServiceMethodDescriptorSupplier("Remove"))
                  .build();
          }
        }
     }
     return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LinkServiceStub newStub(io.grpc.Channel channel) {
    return new LinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LinkServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LinkServiceImplBase implements io.grpc.BindableService {

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
  public static final class LinkServiceStub extends io.grpc.stub.AbstractStub<LinkServiceStub> {
    private LinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LinkServiceStub(channel, callOptions);
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
  public static final class LinkServiceBlockingStub extends io.grpc.stub.AbstractStub<LinkServiceBlockingStub> {
    private LinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LinkServiceBlockingStub(channel, callOptions);
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
  public static final class LinkServiceFutureStub extends io.grpc.stub.AbstractStub<LinkServiceFutureStub> {
    private LinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LinkServiceFutureStub(channel, callOptions);
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
    private final LinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LinkServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class LinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.listware.sdk.pbcmdb.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LinkService");
    }
  }

  private static final class LinkServiceFileDescriptorSupplier
      extends LinkServiceBaseDescriptorSupplier {
    LinkServiceFileDescriptorSupplier() {}
  }

  private static final class LinkServiceMethodDescriptorSupplier
      extends LinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LinkServiceFileDescriptorSupplier())
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
