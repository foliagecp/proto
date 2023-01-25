package org.listware.sdk.pbcmdb.pbfinder;

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
    comments = "Source: pbcmdb/pbfinder/service.proto")
public final class FinderServiceGrpc {

  private FinderServiceGrpc() {}

  public static final String SERVICE_NAME = "org.listware.sdk.pbcmdb.pbfinder.FinderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLinksMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbfinder.Finder.Request,
      org.listware.sdk.pbcmdb.pbfinder.Finder.Response> METHOD_LINKS = getLinksMethod();

  private static volatile io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbfinder.Finder.Request,
      org.listware.sdk.pbcmdb.pbfinder.Finder.Response> getLinksMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbfinder.Finder.Request,
      org.listware.sdk.pbcmdb.pbfinder.Finder.Response> getLinksMethod() {
    io.grpc.MethodDescriptor<org.listware.sdk.pbcmdb.pbfinder.Finder.Request, org.listware.sdk.pbcmdb.pbfinder.Finder.Response> getLinksMethod;
    if ((getLinksMethod = FinderServiceGrpc.getLinksMethod) == null) {
      synchronized (FinderServiceGrpc.class) {
        if ((getLinksMethod = FinderServiceGrpc.getLinksMethod) == null) {
          FinderServiceGrpc.getLinksMethod = getLinksMethod = 
              io.grpc.MethodDescriptor.<org.listware.sdk.pbcmdb.pbfinder.Finder.Request, org.listware.sdk.pbcmdb.pbfinder.Finder.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.listware.sdk.pbcmdb.pbfinder.FinderService", "Links"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.pbfinder.Finder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.listware.sdk.pbcmdb.pbfinder.Finder.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new FinderServiceMethodDescriptorSupplier("Links"))
                  .build();
          }
        }
     }
     return getLinksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FinderServiceStub newStub(io.grpc.Channel channel) {
    return new FinderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FinderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FinderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FinderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FinderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FinderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void links(org.listware.sdk.pbcmdb.pbfinder.Finder.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbfinder.Finder.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLinksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.listware.sdk.pbcmdb.pbfinder.Finder.Request,
                org.listware.sdk.pbcmdb.pbfinder.Finder.Response>(
                  this, METHODID_LINKS)))
          .build();
    }
  }

  /**
   */
  public static final class FinderServiceStub extends io.grpc.stub.AbstractStub<FinderServiceStub> {
    private FinderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinderServiceStub(channel, callOptions);
    }

    /**
     */
    public void links(org.listware.sdk.pbcmdb.pbfinder.Finder.Request request,
        io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbfinder.Finder.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FinderServiceBlockingStub extends io.grpc.stub.AbstractStub<FinderServiceBlockingStub> {
    private FinderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.listware.sdk.pbcmdb.pbfinder.Finder.Response links(org.listware.sdk.pbcmdb.pbfinder.Finder.Request request) {
      return blockingUnaryCall(
          getChannel(), getLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FinderServiceFutureStub extends io.grpc.stub.AbstractStub<FinderServiceFutureStub> {
    private FinderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FinderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FinderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FinderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.listware.sdk.pbcmdb.pbfinder.Finder.Response> links(
        org.listware.sdk.pbcmdb.pbfinder.Finder.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LINKS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FinderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FinderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LINKS:
          serviceImpl.links((org.listware.sdk.pbcmdb.pbfinder.Finder.Request) request,
              (io.grpc.stub.StreamObserver<org.listware.sdk.pbcmdb.pbfinder.Finder.Response>) responseObserver);
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

  private static abstract class FinderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FinderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.listware.sdk.pbcmdb.pbfinder.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FinderService");
    }
  }

  private static final class FinderServiceFileDescriptorSupplier
      extends FinderServiceBaseDescriptorSupplier {
    FinderServiceFileDescriptorSupplier() {}
  }

  private static final class FinderServiceMethodDescriptorSupplier
      extends FinderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FinderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FinderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FinderServiceFileDescriptorSupplier())
              .addMethod(getLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
