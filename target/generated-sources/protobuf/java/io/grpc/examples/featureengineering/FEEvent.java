// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: featureengineering.proto

package io.grpc.examples.featureengineering;

/**
 * <pre>
 * Engineered Event
 * </pre>
 *
 * Protobuf type {@code featureengineering.FEEvent}
 */
public  final class FEEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:featureengineering.FEEvent)
    FEEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FEEvent.newBuilder() to construct.
  private FEEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FEEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FEEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FEEvent(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              result_ = com.google.protobuf.MapField.newMapField(
                  ResultDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
            result__ = input.readMessage(
                ResultDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            result_.getMutableMap().put(
                result__.getKey(), result__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetResult();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.featureengineering.FEEvent.class, io.grpc.examples.featureengineering.FEEvent.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private static final class ResultDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_ResultEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> result_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetResult() {
    if (result_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResultDefaultEntryHolder.defaultEntry);
    }
    return result_;
  }

  public int getResultCount() {
    return internalGetResult().getMap().size();
  }
  /**
   * <code>map&lt;string, int32&gt; result = 1;</code>
   */

  public boolean containsResult(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetResult().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResultMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer> getResult() {
    return getResultMap();
  }
  /**
   * <code>map&lt;string, int32&gt; result = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Integer> getResultMap() {
    return internalGetResult().getMap();
  }
  /**
   * <code>map&lt;string, int32&gt; result = 1;</code>
   */

  public int getResultOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetResult().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int32&gt; result = 1;</code>
   */

  public int getResultOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetResult().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetResult(),
        ResultDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetResult().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      result__ = ResultDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, result__);
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
    if (!(obj instanceof io.grpc.examples.featureengineering.FEEvent)) {
      return super.equals(obj);
    }
    io.grpc.examples.featureengineering.FEEvent other = (io.grpc.examples.featureengineering.FEEvent) obj;

    if (!internalGetResult().equals(
        other.internalGetResult())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetResult().getMap().isEmpty()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.featureengineering.FEEvent parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.featureengineering.FEEvent prototype) {
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
   * <pre>
   * Engineered Event
   * </pre>
   *
   * Protobuf type {@code featureengineering.FEEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:featureengineering.FEEvent)
      io.grpc.examples.featureengineering.FEEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetResult();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableResult();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.featureengineering.FEEvent.class, io.grpc.examples.featureengineering.FEEvent.Builder.class);
    }

    // Construct using io.grpc.examples.featureengineering.FEEvent.newBuilder()
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
      internalGetMutableResult().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.featureengineering.FeatureEngineerProto.internal_static_featureengineering_FEEvent_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.featureengineering.FEEvent getDefaultInstanceForType() {
      return io.grpc.examples.featureengineering.FEEvent.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.featureengineering.FEEvent build() {
      io.grpc.examples.featureengineering.FEEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.featureengineering.FEEvent buildPartial() {
      io.grpc.examples.featureengineering.FEEvent result = new io.grpc.examples.featureengineering.FEEvent(this);
      int from_bitField0_ = bitField0_;
      result.result_ = internalGetResult();
      result.result_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.featureengineering.FEEvent) {
        return mergeFrom((io.grpc.examples.featureengineering.FEEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.featureengineering.FEEvent other) {
      if (other == io.grpc.examples.featureengineering.FEEvent.getDefaultInstance()) return this;
      internalGetMutableResult().mergeFrom(
          other.internalGetResult());
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
      io.grpc.examples.featureengineering.FEEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.featureengineering.FEEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> result_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetResult() {
      if (result_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResultDefaultEntryHolder.defaultEntry);
      }
      return result_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetMutableResult() {
      onChanged();;
      if (result_ == null) {
        result_ = com.google.protobuf.MapField.newMapField(
            ResultDefaultEntryHolder.defaultEntry);
      }
      if (!result_.isMutable()) {
        result_ = result_.copy();
      }
      return result_;
    }

    public int getResultCount() {
      return internalGetResult().getMap().size();
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public boolean containsResult(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetResult().getMap().containsKey(key);
    }
    /**
     * Use {@link #getResultMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer> getResult() {
      return getResultMap();
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Integer> getResultMap() {
      return internalGetResult().getMap();
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public int getResultOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetResult().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public int getResultOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetResult().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearResult() {
      internalGetMutableResult().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public Builder removeResult(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableResult().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableResult() {
      return internalGetMutableResult().getMutableMap();
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */
    public Builder putResult(
        java.lang.String key,
        int value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableResult().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, int32&gt; result = 1;</code>
     */

    public Builder putAllResult(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableResult().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:featureengineering.FEEvent)
  }

  // @@protoc_insertion_point(class_scope:featureengineering.FEEvent)
  private static final io.grpc.examples.featureengineering.FEEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.featureengineering.FEEvent();
  }

  public static io.grpc.examples.featureengineering.FEEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FEEvent>
      PARSER = new com.google.protobuf.AbstractParser<FEEvent>() {
    @java.lang.Override
    public FEEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FEEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FEEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FEEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.featureengineering.FEEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
