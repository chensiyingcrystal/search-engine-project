// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

/**
 * Protobuf type {@code proto.AddRaftEndpointResponse}
 */
public final class AddRaftEndpointResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AddRaftEndpointResponse)
    AddRaftEndpointResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddRaftEndpointResponse.newBuilder() to construct.
  private AddRaftEndpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddRaftEndpointResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddRaftEndpointResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.proto.ClusterHealthManagement.internal_static_proto_AddRaftEndpointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.proto.ClusterHealthManagement.internal_static_proto_AddRaftEndpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.proto.AddRaftEndpointResponse.class, cluster.proto.AddRaftEndpointResponse.Builder.class);
  }

  public static final int GROUPMEMBERSCOMMITINDEX_FIELD_NUMBER = 1;
  private long groupMembersCommitIndex_;
  /**
   * <code>int64 groupMembersCommitIndex = 1;</code>
   * @return The groupMembersCommitIndex.
   */
  @java.lang.Override
  public long getGroupMembersCommitIndex() {
    return groupMembersCommitIndex_;
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
    if (groupMembersCommitIndex_ != 0L) {
      output.writeInt64(1, groupMembersCommitIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupMembersCommitIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, groupMembersCommitIndex_);
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
    if (!(obj instanceof cluster.proto.AddRaftEndpointResponse)) {
      return super.equals(obj);
    }
    cluster.proto.AddRaftEndpointResponse other = (cluster.proto.AddRaftEndpointResponse) obj;

    if (getGroupMembersCommitIndex()
        != other.getGroupMembersCommitIndex()) return false;
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
    hash = (37 * hash) + GROUPMEMBERSCOMMITINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGroupMembersCommitIndex());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.AddRaftEndpointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.proto.AddRaftEndpointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.AddRaftEndpointResponse parseFrom(
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
  public static Builder newBuilder(cluster.proto.AddRaftEndpointResponse prototype) {
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
   * Protobuf type {@code proto.AddRaftEndpointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AddRaftEndpointResponse)
      cluster.proto.AddRaftEndpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_AddRaftEndpointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_AddRaftEndpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.proto.AddRaftEndpointResponse.class, cluster.proto.AddRaftEndpointResponse.Builder.class);
    }

    // Construct using cluster.proto.AddRaftEndpointResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupMembersCommitIndex_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_AddRaftEndpointResponse_descriptor;
    }

    @java.lang.Override
    public cluster.proto.AddRaftEndpointResponse getDefaultInstanceForType() {
      return cluster.proto.AddRaftEndpointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.proto.AddRaftEndpointResponse build() {
      cluster.proto.AddRaftEndpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.proto.AddRaftEndpointResponse buildPartial() {
      cluster.proto.AddRaftEndpointResponse result = new cluster.proto.AddRaftEndpointResponse(this);
      result.groupMembersCommitIndex_ = groupMembersCommitIndex_;
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
      if (other instanceof cluster.proto.AddRaftEndpointResponse) {
        return mergeFrom((cluster.proto.AddRaftEndpointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.proto.AddRaftEndpointResponse other) {
      if (other == cluster.proto.AddRaftEndpointResponse.getDefaultInstance()) return this;
      if (other.getGroupMembersCommitIndex() != 0L) {
        setGroupMembersCommitIndex(other.getGroupMembersCommitIndex());
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
            case 8: {
              groupMembersCommitIndex_ = input.readInt64();

              break;
            } // case 8
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

    private long groupMembersCommitIndex_ ;
    /**
     * <code>int64 groupMembersCommitIndex = 1;</code>
     * @return The groupMembersCommitIndex.
     */
    @java.lang.Override
    public long getGroupMembersCommitIndex() {
      return groupMembersCommitIndex_;
    }
    /**
     * <code>int64 groupMembersCommitIndex = 1;</code>
     * @param value The groupMembersCommitIndex to set.
     * @return This builder for chaining.
     */
    public Builder setGroupMembersCommitIndex(long value) {
      
      groupMembersCommitIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 groupMembersCommitIndex = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupMembersCommitIndex() {
      
      groupMembersCommitIndex_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:proto.AddRaftEndpointResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.AddRaftEndpointResponse)
  private static final cluster.proto.AddRaftEndpointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.proto.AddRaftEndpointResponse();
  }

  public static cluster.proto.AddRaftEndpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddRaftEndpointResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddRaftEndpointResponse>() {
    @java.lang.Override
    public AddRaftEndpointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddRaftEndpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddRaftEndpointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.proto.AddRaftEndpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
