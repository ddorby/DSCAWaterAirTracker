// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airquality.proto

package airquality;

/**
 * Protobuf type {@code airquality.AirQualityData}
 */
public  final class AirQualityData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:airquality.AirQualityData)
    AirQualityDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AirQualityData.newBuilder() to construct.
  private AirQualityData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AirQualityData() {
    coLevels_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AirQualityData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            coLevels_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return airquality.Airquality.internal_static_airquality_AirQualityData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return airquality.Airquality.internal_static_airquality_AirQualityData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            airquality.AirQualityData.class, airquality.AirQualityData.Builder.class);
  }

  public static final int CO_LEVELS_FIELD_NUMBER = 1;
  private float coLevels_;
  /**
   * <pre>
   * Define the fields for air quality data
   * Example fields: CO levels, temperature, etc.
   * </pre>
   *
   * <code>float co_levels = 1;</code>
   */
  public float getCoLevels() {
    return coLevels_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (coLevels_ != 0F) {
      output.writeFloat(1, coLevels_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coLevels_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, coLevels_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof airquality.AirQualityData)) {
      return super.equals(obj);
    }
    airquality.AirQualityData other = (airquality.AirQualityData) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getCoLevels())
        == java.lang.Float.floatToIntBits(
            other.getCoLevels()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CO_LEVELS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCoLevels());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static airquality.AirQualityData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airquality.AirQualityData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airquality.AirQualityData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airquality.AirQualityData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airquality.AirQualityData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static airquality.AirQualityData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static airquality.AirQualityData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static airquality.AirQualityData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static airquality.AirQualityData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static airquality.AirQualityData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static airquality.AirQualityData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static airquality.AirQualityData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(airquality.AirQualityData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code airquality.AirQualityData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:airquality.AirQualityData)
      airquality.AirQualityDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return airquality.Airquality.internal_static_airquality_AirQualityData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return airquality.Airquality.internal_static_airquality_AirQualityData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              airquality.AirQualityData.class, airquality.AirQualityData.Builder.class);
    }

    // Construct using airquality.AirQualityData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      coLevels_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return airquality.Airquality.internal_static_airquality_AirQualityData_descriptor;
    }

    @java.lang.Override
    public airquality.AirQualityData getDefaultInstanceForType() {
      return airquality.AirQualityData.getDefaultInstance();
    }

    @java.lang.Override
    public airquality.AirQualityData build() {
      airquality.AirQualityData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public airquality.AirQualityData buildPartial() {
      airquality.AirQualityData result = new airquality.AirQualityData(this);
      result.coLevels_ = coLevels_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof airquality.AirQualityData) {
        return mergeFrom((airquality.AirQualityData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(airquality.AirQualityData other) {
      if (other == airquality.AirQualityData.getDefaultInstance()) return this;
      if (other.getCoLevels() != 0F) {
        setCoLevels(other.getCoLevels());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      airquality.AirQualityData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (airquality.AirQualityData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float coLevels_ ;
    /**
     * <pre>
     * Define the fields for air quality data
     * Example fields: CO levels, temperature, etc.
     * </pre>
     *
     * <code>float co_levels = 1;</code>
     */
    public float getCoLevels() {
      return coLevels_;
    }
    /**
     * <pre>
     * Define the fields for air quality data
     * Example fields: CO levels, temperature, etc.
     * </pre>
     *
     * <code>float co_levels = 1;</code>
     */
    public Builder setCoLevels(float value) {
      
      coLevels_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the fields for air quality data
     * Example fields: CO levels, temperature, etc.
     * </pre>
     *
     * <code>float co_levels = 1;</code>
     */
    public Builder clearCoLevels() {
      
      coLevels_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:airquality.AirQualityData)
  }

  // @@protoc_insertion_point(class_scope:airquality.AirQualityData)
  private static final airquality.AirQualityData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new airquality.AirQualityData();
  }

  public static airquality.AirQualityData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AirQualityData>
      PARSER = new com.google.protobuf.AbstractParser<AirQualityData>() {
    @java.lang.Override
    public AirQualityData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AirQualityData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AirQualityData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AirQualityData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public airquality.AirQualityData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

