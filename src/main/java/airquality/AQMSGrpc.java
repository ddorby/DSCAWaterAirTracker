package airquality;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: airquality.proto")
public final class AQMSGrpc {

  private AQMSGrpc() {}

  public static final String SERVICE_NAME = "airquality.AQMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<airquality.SensorID,
      airquality.COLevels> getGetCurrentAirQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentAirQuality",
      requestType = airquality.SensorID.class,
      responseType = airquality.COLevels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<airquality.SensorID,
      airquality.COLevels> getGetCurrentAirQualityMethod() {
    io.grpc.MethodDescriptor<airquality.SensorID, airquality.COLevels> getGetCurrentAirQualityMethod;
    if ((getGetCurrentAirQualityMethod = AQMSGrpc.getGetCurrentAirQualityMethod) == null) {
      synchronized (AQMSGrpc.class) {
        if ((getGetCurrentAirQualityMethod = AQMSGrpc.getGetCurrentAirQualityMethod) == null) {
          AQMSGrpc.getGetCurrentAirQualityMethod = getGetCurrentAirQualityMethod = 
              io.grpc.MethodDescriptor.<airquality.SensorID, airquality.COLevels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AQMS", "GetCurrentAirQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.SensorID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.COLevels.getDefaultInstance()))
                  .setSchemaDescriptor(new AQMSMethodDescriptorSupplier("GetCurrentAirQuality"))
                  .build();
          }
        }
     }
     return getGetCurrentAirQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<airquality.TimeRange,
      airquality.AirQualityData> getGetAirQualityHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAirQualityHistory",
      requestType = airquality.TimeRange.class,
      responseType = airquality.AirQualityData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<airquality.TimeRange,
      airquality.AirQualityData> getGetAirQualityHistoryMethod() {
    io.grpc.MethodDescriptor<airquality.TimeRange, airquality.AirQualityData> getGetAirQualityHistoryMethod;
    if ((getGetAirQualityHistoryMethod = AQMSGrpc.getGetAirQualityHistoryMethod) == null) {
      synchronized (AQMSGrpc.class) {
        if ((getGetAirQualityHistoryMethod = AQMSGrpc.getGetAirQualityHistoryMethod) == null) {
          AQMSGrpc.getGetAirQualityHistoryMethod = getGetAirQualityHistoryMethod = 
              io.grpc.MethodDescriptor.<airquality.TimeRange, airquality.AirQualityData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AQMS", "GetAirQualityHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.TimeRange.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.AirQualityData.getDefaultInstance()))
                  .setSchemaDescriptor(new AQMSMethodDescriptorSupplier("GetAirQualityHistory"))
                  .build();
          }
        }
     }
     return getGetAirQualityHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<airquality.Thresholds,
      airquality.SuccessStatus> getSetAlertThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAlertThreshold",
      requestType = airquality.Thresholds.class,
      responseType = airquality.SuccessStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<airquality.Thresholds,
      airquality.SuccessStatus> getSetAlertThresholdMethod() {
    io.grpc.MethodDescriptor<airquality.Thresholds, airquality.SuccessStatus> getSetAlertThresholdMethod;
    if ((getSetAlertThresholdMethod = AQMSGrpc.getSetAlertThresholdMethod) == null) {
      synchronized (AQMSGrpc.class) {
        if ((getSetAlertThresholdMethod = AQMSGrpc.getSetAlertThresholdMethod) == null) {
          AQMSGrpc.getSetAlertThresholdMethod = getSetAlertThresholdMethod = 
              io.grpc.MethodDescriptor.<airquality.Thresholds, airquality.SuccessStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airquality.AQMS", "SetAlertThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.Thresholds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airquality.SuccessStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new AQMSMethodDescriptorSupplier("SetAlertThreshold"))
                  .build();
          }
        }
     }
     return getSetAlertThresholdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AQMSStub newStub(io.grpc.Channel channel) {
    return new AQMSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AQMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AQMSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AQMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AQMSFutureStub(channel);
  }

  /**
   */
  public static abstract class AQMSImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentAirQuality(airquality.SensorID request,
        io.grpc.stub.StreamObserver<airquality.COLevels> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentAirQualityMethod(), responseObserver);
    }

    /**
     */
    public void getAirQualityHistory(airquality.TimeRange request,
        io.grpc.stub.StreamObserver<airquality.AirQualityData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirQualityHistoryMethod(), responseObserver);
    }

    /**
     */
    public void setAlertThreshold(airquality.Thresholds request,
        io.grpc.stub.StreamObserver<airquality.SuccessStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAlertThresholdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentAirQualityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                airquality.SensorID,
                airquality.COLevels>(
                  this, METHODID_GET_CURRENT_AIR_QUALITY)))
          .addMethod(
            getGetAirQualityHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                airquality.TimeRange,
                airquality.AirQualityData>(
                  this, METHODID_GET_AIR_QUALITY_HISTORY)))
          .addMethod(
            getSetAlertThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                airquality.Thresholds,
                airquality.SuccessStatus>(
                  this, METHODID_SET_ALERT_THRESHOLD)))
          .build();
    }
  }

  /**
   */
  public static final class AQMSStub extends io.grpc.stub.AbstractStub<AQMSStub> {
    private AQMSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AQMSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AQMSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AQMSStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentAirQuality(airquality.SensorID request,
        io.grpc.stub.StreamObserver<airquality.COLevels> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentAirQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAirQualityHistory(airquality.TimeRange request,
        io.grpc.stub.StreamObserver<airquality.AirQualityData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAirQualityHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAlertThreshold(airquality.Thresholds request,
        io.grpc.stub.StreamObserver<airquality.SuccessStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AQMSBlockingStub extends io.grpc.stub.AbstractStub<AQMSBlockingStub> {
    private AQMSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AQMSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AQMSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AQMSBlockingStub(channel, callOptions);
    }

    /**
     */
    public airquality.COLevels getCurrentAirQuality(airquality.SensorID request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentAirQualityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<airquality.AirQualityData> getAirQualityHistory(
        airquality.TimeRange request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAirQualityHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public airquality.SuccessStatus setAlertThreshold(airquality.Thresholds request) {
      return blockingUnaryCall(
          getChannel(), getSetAlertThresholdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AQMSFutureStub extends io.grpc.stub.AbstractStub<AQMSFutureStub> {
    private AQMSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AQMSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AQMSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AQMSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<airquality.COLevels> getCurrentAirQuality(
        airquality.SensorID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentAirQualityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<airquality.SuccessStatus> setAlertThreshold(
        airquality.Thresholds request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAlertThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_AIR_QUALITY = 0;
  private static final int METHODID_GET_AIR_QUALITY_HISTORY = 1;
  private static final int METHODID_SET_ALERT_THRESHOLD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AQMSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AQMSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_AIR_QUALITY:
          serviceImpl.getCurrentAirQuality((airquality.SensorID) request,
              (io.grpc.stub.StreamObserver<airquality.COLevels>) responseObserver);
          break;
        case METHODID_GET_AIR_QUALITY_HISTORY:
          serviceImpl.getAirQualityHistory((airquality.TimeRange) request,
              (io.grpc.stub.StreamObserver<airquality.AirQualityData>) responseObserver);
          break;
        case METHODID_SET_ALERT_THRESHOLD:
          serviceImpl.setAlertThreshold((airquality.Thresholds) request,
              (io.grpc.stub.StreamObserver<airquality.SuccessStatus>) responseObserver);
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

  private static abstract class AQMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AQMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return airquality.Airquality.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AQMS");
    }
  }

  private static final class AQMSFileDescriptorSupplier
      extends AQMSBaseDescriptorSupplier {
    AQMSFileDescriptorSupplier() {}
  }

  private static final class AQMSMethodDescriptorSupplier
      extends AQMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AQMSMethodDescriptorSupplier(String methodName) {
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
      synchronized (AQMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AQMSFileDescriptorSupplier())
              .addMethod(getGetCurrentAirQualityMethod())
              .addMethod(getGetAirQualityHistoryMethod())
              .addMethod(getSetAlertThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
