// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterListener.proto

package cluster.external.listener.proto;

/**
 * Protobuf type {@code proto.ClusterEndpointsInfo}
 */
public final class ClusterEndpointsInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ClusterEndpointsInfo)
    ClusterEndpointsInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClusterEndpointsInfo.newBuilder() to construct.
  private ClusterEndpointsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterEndpointsInfo() {
    clusterId_ = "";
    leaderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClusterEndpointsInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetEndpoints();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.external.listener.proto.ClusterEndpointsInfo.class, cluster.external.listener.proto.ClusterEndpointsInfo.Builder.class);
  }

  public static final int CLUSTERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clusterId_;
  /**
   * <code>string clusterId = 1;</code>
   * @return The clusterId.
   */
  @java.lang.Override
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <code>string clusterId = 1;</code>
   * @return The bytes for clusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINTSCOMMITINDEX_FIELD_NUMBER = 2;
  private long endpointsCommitIndex_;
  /**
   * <code>int64 endpointsCommitIndex = 2;</code>
   * @return The endpointsCommitIndex.
   */
  @java.lang.Override
  public long getEndpointsCommitIndex() {
    return endpointsCommitIndex_;
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 3;
  private static final class EndpointsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_EndpointsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> endpoints_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetEndpoints() {
    if (endpoints_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          EndpointsDefaultEntryHolder.defaultEntry);
    }
    return endpoints_;
  }

  public int getEndpointsCount() {
    return internalGetEndpoints().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; endpoints = 3;</code>
   */

  @java.lang.Override
  public boolean containsEndpoints(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetEndpoints().getMap().containsKey(key);
  }
  /**
   * Use {@link #getEndpointsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getEndpoints() {
    return getEndpointsMap();
  }
  /**
   * <code>map&lt;string, string&gt; endpoints = 3;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getEndpointsMap() {
    return internalGetEndpoints().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; endpoints = 3;</code>
   */
  @java.lang.Override

  public java.lang.String getEndpointsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetEndpoints().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; endpoints = 3;</code>
   */
  @java.lang.Override

  public java.lang.String getEndpointsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetEndpoints().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int LEADERID_FIELD_NUMBER = 4;
  private volatile java.lang.Object leaderId_;
  /**
   * <code>string leaderId = 4;</code>
   * @return The leaderId.
   */
  @java.lang.Override
  public java.lang.String getLeaderId() {
    java.lang.Object ref = leaderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leaderId_ = s;
      return s;
    }
  }
  /**
   * <code>string leaderId = 4;</code>
   * @return The bytes for leaderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLeaderIdBytes() {
    java.lang.Object ref = leaderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leaderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TERM_FIELD_NUMBER = 5;
  private int term_;
  /**
   * <code>int32 term = 5;</code>
   * @return The term.
   */
  @java.lang.Override
  public int getTerm() {
    return term_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clusterId_);
    }
    if (endpointsCommitIndex_ != 0L) {
      output.writeInt64(2, endpointsCommitIndex_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetEndpoints(),
        EndpointsDefaultEntryHolder.defaultEntry,
        3);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(leaderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, leaderId_);
    }
    if (term_ != 0) {
      output.writeInt32(5, term_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clusterId_);
    }
    if (endpointsCommitIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, endpointsCommitIndex_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetEndpoints().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      endpoints__ = EndpointsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, endpoints__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(leaderId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, leaderId_);
    }
    if (term_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, term_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cluster.external.listener.proto.ClusterEndpointsInfo)) {
      return super.equals(obj);
    }
    cluster.external.listener.proto.ClusterEndpointsInfo other = (cluster.external.listener.proto.ClusterEndpointsInfo) obj;

    if (!getClusterId()
        .equals(other.getClusterId())) return false;
    if (getEndpointsCommitIndex()
        != other.getEndpointsCommitIndex()) return false;
    if (!internalGetEndpoints().equals(
        other.internalGetEndpoints())) return false;
    if (!getLeaderId()
        .equals(other.getLeaderId())) return false;
    if (getTerm()
        != other.getTerm()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLUSTERID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    hash = (37 * hash) + ENDPOINTSCOMMITINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndpointsCommitIndex());
    if (!internalGetEndpoints().getMap().isEmpty()) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEndpoints().hashCode();
    }
    hash = (37 * hash) + LEADERID_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderId().hashCode();
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.external.listener.proto.ClusterEndpointsInfo parseFrom(
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
  public static Builder newBuilder(cluster.external.listener.proto.ClusterEndpointsInfo prototype) {
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
   * Protobuf type {@code proto.ClusterEndpointsInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ClusterEndpointsInfo)
      cluster.external.listener.proto.ClusterEndpointsInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetEndpoints();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableEndpoints();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.external.listener.proto.ClusterEndpointsInfo.class, cluster.external.listener.proto.ClusterEndpointsInfo.Builder.class);
    }

    // Construct using cluster.external.listener.proto.ClusterEndpointsInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clusterId_ = "";

      endpointsCommitIndex_ = 0L;

      internalGetMutableEndpoints().clear();
      leaderId_ = "";

      term_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.external.listener.proto.ClusterListener.internal_static_proto_ClusterEndpointsInfo_descriptor;
    }

    @java.lang.Override
    public cluster.external.listener.proto.ClusterEndpointsInfo getDefaultInstanceForType() {
      return cluster.external.listener.proto.ClusterEndpointsInfo.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.external.listener.proto.ClusterEndpointsInfo build() {
      cluster.external.listener.proto.ClusterEndpointsInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.external.listener.proto.ClusterEndpointsInfo buildPartial() {
      cluster.external.listener.proto.ClusterEndpointsInfo result = new cluster.external.listener.proto.ClusterEndpointsInfo(this);
      int from_bitField0_ = bitField0_;
      result.clusterId_ = clusterId_;
      result.endpointsCommitIndex_ = endpointsCommitIndex_;
      result.endpoints_ = internalGetEndpoints();
      result.endpoints_.makeImmutable();
      result.leaderId_ = leaderId_;
      result.term_ = term_;
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
      if (other instanceof cluster.external.listener.proto.ClusterEndpointsInfo) {
        return mergeFrom((cluster.external.listener.proto.ClusterEndpointsInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.external.listener.proto.ClusterEndpointsInfo other) {
      if (other == cluster.external.listener.proto.ClusterEndpointsInfo.getDefaultInstance()) return this;
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (other.getEndpointsCommitIndex() != 0L) {
        setEndpointsCommitIndex(other.getEndpointsCommitIndex());
      }
      internalGetMutableEndpoints().mergeFrom(
          other.internalGetEndpoints());
      if (!other.getLeaderId().isEmpty()) {
        leaderId_ = other.leaderId_;
        onChanged();
      }
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              clusterId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              endpointsCommitIndex_ = input.readInt64();

              break;
            } // case 16
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              endpoints__ = input.readMessage(
                  EndpointsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableEndpoints().getMutableMap().put(
                  endpoints__.getKey(), endpoints__.getValue());
              break;
            } // case 26
            case 34: {
              leaderId_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 40: {
              term_ = input.readInt32();

              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object clusterId_ = "";
    /**
     * <code>string clusterId = 1;</code>
     * @return The clusterId.
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clusterId = 1;</code>
     * @return The bytes for clusterId.
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clusterId = 1;</code>
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clusterId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <code>string clusterId = 1;</code>
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private long endpointsCommitIndex_ ;
    /**
     * <code>int64 endpointsCommitIndex = 2;</code>
     * @return The endpointsCommitIndex.
     */
    @java.lang.Override
    public long getEndpointsCommitIndex() {
      return endpointsCommitIndex_;
    }
    /**
     * <code>int64 endpointsCommitIndex = 2;</code>
     * @param value The endpointsCommitIndex to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointsCommitIndex(long value) {
      
      endpointsCommitIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 endpointsCommitIndex = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpointsCommitIndex() {
      
      endpointsCommitIndex_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> endpoints_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetEndpoints() {
      if (endpoints_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EndpointsDefaultEntryHolder.defaultEntry);
      }
      return endpoints_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableEndpoints() {
      onChanged();;
      if (endpoints_ == null) {
        endpoints_ = com.google.protobuf.MapField.newMapField(
            EndpointsDefaultEntryHolder.defaultEntry);
      }
      if (!endpoints_.isMutable()) {
        endpoints_ = endpoints_.copy();
      }
      return endpoints_;
    }

    public int getEndpointsCount() {
      return internalGetEndpoints().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */

    @java.lang.Override
    public boolean containsEndpoints(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetEndpoints().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEndpointsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getEndpoints() {
      return getEndpointsMap();
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getEndpointsMap() {
      return internalGetEndpoints().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */
    @java.lang.Override

    public java.lang.String getEndpointsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetEndpoints().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */
    @java.lang.Override

    public java.lang.String getEndpointsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetEndpoints().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearEndpoints() {
      internalGetMutableEndpoints().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */

    public Builder removeEndpoints(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableEndpoints().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableEndpoints() {
      return internalGetMutableEndpoints().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */
    public Builder putEndpoints(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableEndpoints().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; endpoints = 3;</code>
     */

    public Builder putAllEndpoints(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableEndpoints().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object leaderId_ = "";
    /**
     * <code>string leaderId = 4;</code>
     * @return The leaderId.
     */
    public java.lang.String getLeaderId() {
      java.lang.Object ref = leaderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leaderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string leaderId = 4;</code>
     * @return The bytes for leaderId.
     */
    public com.google.protobuf.ByteString
        getLeaderIdBytes() {
      java.lang.Object ref = leaderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leaderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string leaderId = 4;</code>
     * @param value The leaderId to set.
     * @return This builder for chaining.
     */
    public Builder setLeaderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leaderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string leaderId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeaderId() {
      
      leaderId_ = getDefaultInstance().getLeaderId();
      onChanged();
      return this;
    }
    /**
     * <code>string leaderId = 4;</code>
     * @param value The bytes for leaderId to set.
     * @return This builder for chaining.
     */
    public Builder setLeaderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leaderId_ = value;
      onChanged();
      return this;
    }

    private int term_ ;
    /**
     * <code>int32 term = 5;</code>
     * @return The term.
     */
    @java.lang.Override
    public int getTerm() {
      return term_;
    }
    /**
     * <code>int32 term = 5;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(int value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 term = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      
      term_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:proto.ClusterEndpointsInfo)
  }

  // @@protoc_insertion_point(class_scope:proto.ClusterEndpointsInfo)
  private static final cluster.external.listener.proto.ClusterEndpointsInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.external.listener.proto.ClusterEndpointsInfo();
  }

  public static cluster.external.listener.proto.ClusterEndpointsInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterEndpointsInfo>
      PARSER = new com.google.protobuf.AbstractParser<ClusterEndpointsInfo>() {
    @java.lang.Override
    public ClusterEndpointsInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ClusterEndpointsInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterEndpointsInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.external.listener.proto.ClusterEndpointsInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

