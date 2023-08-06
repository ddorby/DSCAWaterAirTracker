package alert;

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
 * <pre>
 * The Alert Notification Service (ANS) service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: alert.proto")
public final class AlertNotificationServiceGrpc {

  private AlertNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "alert.AlertNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alert.RegisterRequest,
      alert.RegisterResponse> getRegisterForAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterForAlerts",
      requestType = alert.RegisterRequest.class,
      responseType = alert.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alert.RegisterRequest,
      alert.RegisterResponse> getRegisterForAlertsMethod() {
    io.grpc.MethodDescriptor<alert.RegisterRequest, alert.RegisterResponse> getRegisterForAlertsMethod;
    if ((getRegisterForAlertsMethod = AlertNotificationServiceGrpc.getRegisterForAlertsMethod) == null) {
      synchronized (AlertNotificationServiceGrpc.class) {
        if ((getRegisterForAlertsMethod = AlertNotificationServiceGrpc.getRegisterForAlertsMethod) == null) {
          AlertNotificationServiceGrpc.getRegisterForAlertsMethod = getRegisterForAlertsMethod = 
              io.grpc.MethodDescriptor.<alert.RegisterRequest, alert.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alert.AlertNotificationService", "RegisterForAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.RegisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertNotificationServiceMethodDescriptorSupplier("RegisterForAlerts"))
                  .build();
          }
        }
     }
     return getRegisterForAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alert.UnregisterRequest,
      alert.UnregisterResponse> getUnregisterForAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterForAlerts",
      requestType = alert.UnregisterRequest.class,
      responseType = alert.UnregisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alert.UnregisterRequest,
      alert.UnregisterResponse> getUnregisterForAlertsMethod() {
    io.grpc.MethodDescriptor<alert.UnregisterRequest, alert.UnregisterResponse> getUnregisterForAlertsMethod;
    if ((getUnregisterForAlertsMethod = AlertNotificationServiceGrpc.getUnregisterForAlertsMethod) == null) {
      synchronized (AlertNotificationServiceGrpc.class) {
        if ((getUnregisterForAlertsMethod = AlertNotificationServiceGrpc.getUnregisterForAlertsMethod) == null) {
          AlertNotificationServiceGrpc.getUnregisterForAlertsMethod = getUnregisterForAlertsMethod = 
              io.grpc.MethodDescriptor.<alert.UnregisterRequest, alert.UnregisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alert.AlertNotificationService", "UnregisterForAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.UnregisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.UnregisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertNotificationServiceMethodDescriptorSupplier("UnregisterForAlerts"))
                  .build();
          }
        }
     }
     return getUnregisterForAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alert.StreamAlertsRequest,
      alert.AlertMessage> getStreamAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAlerts",
      requestType = alert.StreamAlertsRequest.class,
      responseType = alert.AlertMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<alert.StreamAlertsRequest,
      alert.AlertMessage> getStreamAlertsMethod() {
    io.grpc.MethodDescriptor<alert.StreamAlertsRequest, alert.AlertMessage> getStreamAlertsMethod;
    if ((getStreamAlertsMethod = AlertNotificationServiceGrpc.getStreamAlertsMethod) == null) {
      synchronized (AlertNotificationServiceGrpc.class) {
        if ((getStreamAlertsMethod = AlertNotificationServiceGrpc.getStreamAlertsMethod) == null) {
          AlertNotificationServiceGrpc.getStreamAlertsMethod = getStreamAlertsMethod = 
              io.grpc.MethodDescriptor.<alert.StreamAlertsRequest, alert.AlertMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "alert.AlertNotificationService", "StreamAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.StreamAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alert.AlertMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertNotificationServiceMethodDescriptorSupplier("StreamAlerts"))
                  .build();
          }
        }
     }
     return getStreamAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertNotificationServiceStub newStub(io.grpc.Channel channel) {
    return new AlertNotificationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlertNotificationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlertNotificationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Alert Notification Service (ANS) service definition.
   * </pre>
   */
  public static abstract class AlertNotificationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC Method 1: RegisterForAlerts
     * </pre>
     */
    public void registerForAlerts(alert.RegisterRequest request,
        io.grpc.stub.StreamObserver<alert.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterForAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2: UnregisterForAlerts
     * </pre>
     */
    public void unregisterForAlerts(alert.UnregisterRequest request,
        io.grpc.stub.StreamObserver<alert.UnregisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterForAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC Method 3: StreamAlerts
     * </pre>
     */
    public io.grpc.stub.StreamObserver<alert.StreamAlertsRequest> streamAlerts(
        io.grpc.stub.StreamObserver<alert.AlertMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamAlertsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterForAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alert.RegisterRequest,
                alert.RegisterResponse>(
                  this, METHODID_REGISTER_FOR_ALERTS)))
          .addMethod(
            getUnregisterForAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alert.UnregisterRequest,
                alert.UnregisterResponse>(
                  this, METHODID_UNREGISTER_FOR_ALERTS)))
          .addMethod(
            getStreamAlertsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                alert.StreamAlertsRequest,
                alert.AlertMessage>(
                  this, METHODID_STREAM_ALERTS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Alert Notification Service (ANS) service definition.
   * </pre>
   */
  public static final class AlertNotificationServiceStub extends io.grpc.stub.AbstractStub<AlertNotificationServiceStub> {
    private AlertNotificationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertNotificationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertNotificationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertNotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1: RegisterForAlerts
     * </pre>
     */
    public void registerForAlerts(alert.RegisterRequest request,
        io.grpc.stub.StreamObserver<alert.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterForAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC Method 2: UnregisterForAlerts
     * </pre>
     */
    public void unregisterForAlerts(alert.UnregisterRequest request,
        io.grpc.stub.StreamObserver<alert.UnregisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterForAlertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC Method 3: StreamAlerts
     * </pre>
     */
    public io.grpc.stub.StreamObserver<alert.StreamAlertsRequest> streamAlerts(
        io.grpc.stub.StreamObserver<alert.AlertMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamAlertsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The Alert Notification Service (ANS) service definition.
   * </pre>
   */
  public static final class AlertNotificationServiceBlockingStub extends io.grpc.stub.AbstractStub<AlertNotificationServiceBlockingStub> {
    private AlertNotificationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertNotificationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertNotificationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1: RegisterForAlerts
     * </pre>
     */
    public alert.RegisterResponse registerForAlerts(alert.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterForAlertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC Method 2: UnregisterForAlerts
     * </pre>
     */
    public alert.UnregisterResponse unregisterForAlerts(alert.UnregisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterForAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Alert Notification Service (ANS) service definition.
   * </pre>
   */
  public static final class AlertNotificationServiceFutureStub extends io.grpc.stub.AbstractStub<AlertNotificationServiceFutureStub> {
    private AlertNotificationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertNotificationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertNotificationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC Method 1: RegisterForAlerts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alert.RegisterResponse> registerForAlerts(
        alert.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterForAlertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC Method 2: UnregisterForAlerts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alert.UnregisterResponse> unregisterForAlerts(
        alert.UnregisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterForAlertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_FOR_ALERTS = 0;
  private static final int METHODID_UNREGISTER_FOR_ALERTS = 1;
  private static final int METHODID_STREAM_ALERTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertNotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertNotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_FOR_ALERTS:
          serviceImpl.registerForAlerts((alert.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<alert.RegisterResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_FOR_ALERTS:
          serviceImpl.unregisterForAlerts((alert.UnregisterRequest) request,
              (io.grpc.stub.StreamObserver<alert.UnregisterResponse>) responseObserver);
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
        case METHODID_STREAM_ALERTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamAlerts(
              (io.grpc.stub.StreamObserver<alert.AlertMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlertNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alert.Alert.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertNotificationService");
    }
  }

  private static final class AlertNotificationServiceFileDescriptorSupplier
      extends AlertNotificationServiceBaseDescriptorSupplier {
    AlertNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class AlertNotificationServiceMethodDescriptorSupplier
      extends AlertNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertNotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlertNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertNotificationServiceFileDescriptorSupplier())
              .addMethod(getRegisterForAlertsMethod())
              .addMethod(getUnregisterForAlertsMethod())
              .addMethod(getStreamAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
