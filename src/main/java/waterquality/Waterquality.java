// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: waterquality.proto

package waterquality;

public final class Waterquality {
  private Waterquality() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_SensorId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_SensorId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_CurrentPhLevels_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_CurrentPhLevels_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_WaterQualityHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_WaterQualityHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_WaterQualityData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_WaterQualityData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_WaterQualityHistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_WaterQualityHistoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_SetAlertThresholdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_SetAlertThresholdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_waterquality_SetAlertThresholdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_waterquality_SetAlertThresholdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022waterquality.proto\022\014waterquality\"\026\n\010Se" +
      "nsorId\022\n\n\002id\030\001 \001(\t\"\035\n\017CurrentPhLevels\022\n\n" +
      "\002ph\030\001 \001(\002\"L\n\032WaterQualityHistoryRequest\022" +
      "\027\n\017start_timestamp\030\001 \001(\003\022\025\n\rend_timestam" +
      "p\030\002 \001(\003\"S\n\020WaterQualityData\022\n\n\002ph\030\001 \001(\002\022" +
      "\021\n\tturbidity\030\002 \001(\002\022\013\n\003tds\030\003 \001(\002\022\023\n\013tempe" +
      "rature\030\004 \001(\002\"K\n\033WaterQualityHistoryRespo" +
      "nse\022,\n\004data\030\001 \003(\0132\036.waterquality.WaterQu" +
      "alityData\":\n\030SetAlertThresholdRequest\022\016\n" +
      "\006min_ph\030\001 \001(\002\022\016\n\006max_ph\030\002 \001(\002\",\n\031SetAler" +
      "tThresholdResponse\022\017\n\007success\030\001 \001(\0102\262\002\n\004" +
      "WQMS\022Q\n\026GetCurrentWaterQuality\022\026.waterqu" +
      "ality.SensorId\032\035.waterquality.CurrentPhL" +
      "evels\"\000\022o\n\026GetWaterQualityHistory\022(.wate" +
      "rquality.WaterQualityHistoryRequest\032).wa" +
      "terquality.WaterQualityHistoryResponse\"\000" +
      "\022f\n\021SetAlertThreshold\022&.waterquality.Set" +
      "AlertThresholdRequest\032\'.waterquality.Set" +
      "AlertThresholdResponse\"\000B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_waterquality_SensorId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_waterquality_SensorId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_SensorId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_waterquality_CurrentPhLevels_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_waterquality_CurrentPhLevels_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_CurrentPhLevels_descriptor,
        new java.lang.String[] { "Ph", });
    internal_static_waterquality_WaterQualityHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_waterquality_WaterQualityHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_WaterQualityHistoryRequest_descriptor,
        new java.lang.String[] { "StartTimestamp", "EndTimestamp", });
    internal_static_waterquality_WaterQualityData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_waterquality_WaterQualityData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_WaterQualityData_descriptor,
        new java.lang.String[] { "Ph", "Turbidity", "Tds", "Temperature", });
    internal_static_waterquality_WaterQualityHistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_waterquality_WaterQualityHistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_WaterQualityHistoryResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_waterquality_SetAlertThresholdRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_waterquality_SetAlertThresholdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_SetAlertThresholdRequest_descriptor,
        new java.lang.String[] { "MinPh", "MaxPh", });
    internal_static_waterquality_SetAlertThresholdResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_waterquality_SetAlertThresholdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_waterquality_SetAlertThresholdResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
