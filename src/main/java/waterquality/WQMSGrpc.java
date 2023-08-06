package waterquality;

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
 * Water Quality Monitoring Service (WQMS) service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: waterquality.proto")
public final class WQMSGrpc {

  private WQMSGrpc() {}

  public static final String SERVICE_NAME = "waterquality.WQMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<waterquality.SensorId,
      waterquality.CurrentPhLevels> getGetCurrentWaterQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentWaterQuality",
      requestType = waterquality.SensorId.class,
      responseType = waterquality.CurrentPhLevels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<waterquality.SensorId,
      waterquality.CurrentPhLevels> getGetCurrentWaterQualityMethod() {
    io.grpc.MethodDescriptor<waterquality.SensorId, waterquality.CurrentPhLevels> getGetCurrentWaterQualityMethod;
    if ((getGetCurrentWaterQualityMethod = WQMSGrpc.getGetCurrentWaterQualityMethod) == null) {
      synchronized (WQMSGrpc.class) {
        if ((getGetCurrentWaterQualityMethod = WQMSGrpc.getGetCurrentWaterQualityMethod) == null) {
          WQMSGrpc.getGetCurrentWaterQualityMethod = getGetCurrentWaterQualityMethod = 
              io.grpc.MethodDescriptor.<waterquality.SensorId, waterquality.CurrentPhLevels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterquality.WQMS", "GetCurrentWaterQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  waterquality.SensorId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  waterquality.CurrentPhLevels.getDefaultInstance()))
                  .setSchemaDescriptor(new WQMSMethodDescriptorSupplier("GetCurrentWaterQuality"))
                  .build();
          }
        }
     }
     return getGetCurrentWaterQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<waterquality.SetAlertThresholdRequest,
      waterquality.SetAlertThresholdResponse> getSetAlertThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAlertThreshold",
      requestType = waterquality.SetAlertThresholdRequest.class,
      responseType = waterquality.SetAlertThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<waterquality.SetAlertThresholdRequest,
      waterquality.SetAlertThresholdResponse> getSetAlertThresholdMethod() {
    io.grpc.MethodDescriptor<waterquality.SetAlertThresholdRequest, waterquality.SetAlertThresholdResponse> getSetAlertThresholdMethod;
    if ((getSetAlertThresholdMethod = WQMSGrpc.getSetAlertThresholdMethod) == null) {
      synchronized (WQMSGrpc.class) {
        if ((getSetAlertThresholdMethod = WQMSGrpc.getSetAlertThresholdMethod) == null) {
          WQMSGrpc.getSetAlertThresholdMethod = getSetAlertThresholdMethod = 
              io.grpc.MethodDescriptor.<waterquality.SetAlertThresholdRequest, waterquality.SetAlertThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterquality.WQMS", "SetAlertThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  waterquality.SetAlertThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  waterquality.SetAlertThresholdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WQMSMethodDescriptorSupplier("SetAlertThreshold"))
                  .build();
          }
        }
     }
     return getSetAlertThresholdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WQMSStub newStub(io.grpc.Channel channel) {
    return new WQMSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WQMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WQMSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WQMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WQMSFutureStub(channel);
  }

  /**
   * <pre>
   * Water Quality Monitoring Service (WQMS) service definition.
   * </pre>
   */
  public static abstract class WQMSImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method for getting current pH levels.
     * </pre>
     */
    public void getCurrentWaterQuality(waterquality.SensorId request,
        io.grpc.stub.StreamObserver<waterquality.CurrentPhLevels> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentWaterQualityMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method for setting pH thresholds.
     * </pre>
     */
    public void setAlertThreshold(waterquality.SetAlertThresholdRequest request,
        io.grpc.stub.StreamObserver<waterquality.SetAlertThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAlertThresholdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentWaterQualityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                waterquality.SensorId,
                waterquality.CurrentPhLevels>(
                  this, METHODID_GET_CURRENT_WATER_QUALITY)))
          .addMethod(
            getSetAlertThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                waterquality.SetAlertThresholdRequest,
                waterquality.SetAlertThresholdResponse>(
                  this, METHODID_SET_ALERT_THRESHOLD)))
          .build();
    }
  }

  /**
   * <pre>
   * Water Quality Monitoring Service (WQMS) service definition.
   * </pre>
   */
  public static final class WQMSStub extends io.grpc.stub.AbstractStub<WQMSStub> {
    private WQMSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WQMSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WQMSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WQMSStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for getting current pH levels.
     * </pre>
     */
    public void getCurrentWaterQuality(waterquality.SensorId request,
        io.grpc.stub.StreamObserver<waterquality.CurrentPhLevels> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentWaterQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method for setting pH thresholds.
     * </pre>
     */
    public void setAlertThreshold(waterquality.SetAlertThresholdRequest request,
        io.grpc.stub.StreamObserver<waterquality.SetAlertThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Water Quality Monitoring Service (WQMS) service definition.
   * </pre>
   */
  public static final class WQMSBlockingStub extends io.grpc.stub.AbstractStub<WQMSBlockingStub> {
    private WQMSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WQMSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WQMSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WQMSBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for getting current pH levels.
     * </pre>
     */
    public waterquality.CurrentPhLevels getCurrentWaterQuality(waterquality.SensorId request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentWaterQualityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method for setting pH thresholds.
     * </pre>
     */
    public waterquality.SetAlertThresholdResponse setAlertThreshold(waterquality.SetAlertThresholdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAlertThresholdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Water Quality Monitoring Service (WQMS) service definition.
   * </pre>
   */
  public static final class WQMSFutureStub extends io.grpc.stub.AbstractStub<WQMSFutureStub> {
    private WQMSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WQMSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WQMSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WQMSFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method for getting current pH levels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<waterquality.CurrentPhLevels> getCurrentWaterQuality(
        waterquality.SensorId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentWaterQualityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method for setting pH thresholds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<waterquality.SetAlertThresholdResponse> setAlertThreshold(
        waterquality.SetAlertThresholdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_WATER_QUALITY = 0;
  private static final int METHODID_SET_ALERT_THRESHOLD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WQMSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WQMSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_WATER_QUALITY:
          serviceImpl.getCurrentWaterQuality((waterquality.SensorId) request,
              (io.grpc.stub.StreamObserver<waterquality.CurrentPhLevels>) responseObserver);
          break;
        case METHODID_SET_ALERT_THRESHOLD:
          serviceImpl.setAlertThreshold((waterquality.SetAlertThresholdRequest) request,
              (io.grpc.stub.StreamObserver<waterquality.SetAlertThresholdResponse>) responseObserver);
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

  private static abstract class WQMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WQMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return waterquality.Waterquality.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WQMS");
    }
  }

  private static final class WQMSFileDescriptorSupplier
      extends WQMSBaseDescriptorSupplier {
    WQMSFileDescriptorSupplier() {}
  }

  private static final class WQMSMethodDescriptorSupplier
      extends WQMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WQMSMethodDescriptorSupplier(String methodName) {
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
      synchronized (WQMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WQMSFileDescriptorSupplier())
              .addMethod(getGetCurrentWaterQualityMethod())
              .addMethod(getSetAlertThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
