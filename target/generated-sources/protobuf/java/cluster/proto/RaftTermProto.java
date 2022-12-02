// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

/**
 * <pre>
 * https://github.com/MicroRaft/MicroRaft/blob/master/microraft/src/main/java/io/microraft/report/RaftTerm.java
 * </pre>
 *
 * Protobuf type {@code proto.RaftTermProto}
 */
public final class RaftTermProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.RaftTermProto)
    RaftTermProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RaftTermProto.newBuilder() to construct.
  private RaftTermProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RaftTermProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RaftTermProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.proto.ClusterHealthManagement.internal_static_proto_RaftTermProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.proto.ClusterHealthManagement.internal_static_proto_RaftTermProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.proto.RaftTermProto.class, cluster.proto.RaftTermProto.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private int term_;
  /**
   * <code>int32 term = 1;</code>
   * @return The term.
   */
  @java.lang.Override
  public int getTerm() {
    return term_;
  }

  public static final int LEADERENDPOINT_FIELD_NUMBER = 2;
  private cluster.proto.RaftEndpointProto leaderEndpoint_;
  /**
   * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
   * @return Whether the leaderEndpoint field is set.
   */
  @java.lang.Override
  public boolean hasLeaderEndpoint() {
    return leaderEndpoint_ != null;
  }
  /**
   * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
   * @return The leaderEndpoint.
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProto getLeaderEndpoint() {
    return leaderEndpoint_ == null ? cluster.proto.RaftEndpointProto.getDefaultInstance() : leaderEndpoint_;
  }
  /**
   * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProtoOrBuilder getLeaderEndpointOrBuilder() {
    return getLeaderEndpoint();
  }

  public static final int VOTEDENDPOINT_FIELD_NUMBER = 3;
  private cluster.proto.RaftEndpointProto votedEndpoint_;
  /**
   * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
   * @return Whether the votedEndpoint field is set.
   */
  @java.lang.Override
  public boolean hasVotedEndpoint() {
    return votedEndpoint_ != null;
  }
  /**
   * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
   * @return The votedEndpoint.
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProto getVotedEndpoint() {
    return votedEndpoint_ == null ? cluster.proto.RaftEndpointProto.getDefaultInstance() : votedEndpoint_;
  }
  /**
   * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProtoOrBuilder getVotedEndpointOrBuilder() {
    return getVotedEndpoint();
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
    if (term_ != 0) {
      output.writeInt32(1, term_);
    }
    if (leaderEndpoint_ != null) {
      output.writeMessage(2, getLeaderEndpoint());
    }
    if (votedEndpoint_ != null) {
      output.writeMessage(3, getVotedEndpoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, term_);
    }
    if (leaderEndpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLeaderEndpoint());
    }
    if (votedEndpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVotedEndpoint());
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
    if (!(obj instanceof cluster.proto.RaftTermProto)) {
      return super.equals(obj);
    }
    cluster.proto.RaftTermProto other = (cluster.proto.RaftTermProto) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (hasLeaderEndpoint() != other.hasLeaderEndpoint()) return false;
    if (hasLeaderEndpoint()) {
      if (!getLeaderEndpoint()
          .equals(other.getLeaderEndpoint())) return false;
    }
    if (hasVotedEndpoint() != other.hasVotedEndpoint()) return false;
    if (hasVotedEndpoint()) {
      if (!getVotedEndpoint()
          .equals(other.getVotedEndpoint())) return false;
    }
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm();
    if (hasLeaderEndpoint()) {
      hash = (37 * hash) + LEADERENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getLeaderEndpoint().hashCode();
    }
    if (hasVotedEndpoint()) {
      hash = (37 * hash) + VOTEDENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getVotedEndpoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.proto.RaftTermProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftTermProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftTermProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.RaftTermProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftTermProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.RaftTermProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftTermProto parseFrom(
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
  public static Builder newBuilder(cluster.proto.RaftTermProto prototype) {
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
   * https://github.com/MicroRaft/MicroRaft/blob/master/microraft/src/main/java/io/microraft/report/RaftTerm.java
   * </pre>
   *
   * Protobuf type {@code proto.RaftTermProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.RaftTermProto)
      cluster.proto.RaftTermProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_RaftTermProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_RaftTermProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.proto.RaftTermProto.class, cluster.proto.RaftTermProto.Builder.class);
    }

    // Construct using cluster.proto.RaftTermProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      term_ = 0;

      if (leaderEndpointBuilder_ == null) {
        leaderEndpoint_ = null;
      } else {
        leaderEndpoint_ = null;
        leaderEndpointBuilder_ = null;
      }
      if (votedEndpointBuilder_ == null) {
        votedEndpoint_ = null;
      } else {
        votedEndpoint_ = null;
        votedEndpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.proto.ClusterHealthManagement.internal_static_proto_RaftTermProto_descriptor;
    }

    @java.lang.Override
    public cluster.proto.RaftTermProto getDefaultInstanceForType() {
      return cluster.proto.RaftTermProto.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.proto.RaftTermProto build() {
      cluster.proto.RaftTermProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.proto.RaftTermProto buildPartial() {
      cluster.proto.RaftTermProto result = new cluster.proto.RaftTermProto(this);
      result.term_ = term_;
      if (leaderEndpointBuilder_ == null) {
        result.leaderEndpoint_ = leaderEndpoint_;
      } else {
        result.leaderEndpoint_ = leaderEndpointBuilder_.build();
      }
      if (votedEndpointBuilder_ == null) {
        result.votedEndpoint_ = votedEndpoint_;
      } else {
        result.votedEndpoint_ = votedEndpointBuilder_.build();
      }
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
      if (other instanceof cluster.proto.RaftTermProto) {
        return mergeFrom((cluster.proto.RaftTermProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.proto.RaftTermProto other) {
      if (other == cluster.proto.RaftTermProto.getDefaultInstance()) return this;
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      if (other.hasLeaderEndpoint()) {
        mergeLeaderEndpoint(other.getLeaderEndpoint());
      }
      if (other.hasVotedEndpoint()) {
        mergeVotedEndpoint(other.getVotedEndpoint());
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
              term_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getLeaderEndpointFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getVotedEndpointFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private int term_ ;
    /**
     * <code>int32 term = 1;</code>
     * @return The term.
     */
    @java.lang.Override
    public int getTerm() {
      return term_;
    }
    /**
     * <code>int32 term = 1;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(int value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 term = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      
      term_ = 0;
      onChanged();
      return this;
    }

    private cluster.proto.RaftEndpointProto leaderEndpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> leaderEndpointBuilder_;
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     * @return Whether the leaderEndpoint field is set.
     */
    public boolean hasLeaderEndpoint() {
      return leaderEndpointBuilder_ != null || leaderEndpoint_ != null;
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     * @return The leaderEndpoint.
     */
    public cluster.proto.RaftEndpointProto getLeaderEndpoint() {
      if (leaderEndpointBuilder_ == null) {
        return leaderEndpoint_ == null ? cluster.proto.RaftEndpointProto.getDefaultInstance() : leaderEndpoint_;
      } else {
        return leaderEndpointBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public Builder setLeaderEndpoint(cluster.proto.RaftEndpointProto value) {
      if (leaderEndpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leaderEndpoint_ = value;
        onChanged();
      } else {
        leaderEndpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public Builder setLeaderEndpoint(
        cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (leaderEndpointBuilder_ == null) {
        leaderEndpoint_ = builderForValue.build();
        onChanged();
      } else {
        leaderEndpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public Builder mergeLeaderEndpoint(cluster.proto.RaftEndpointProto value) {
      if (leaderEndpointBuilder_ == null) {
        if (leaderEndpoint_ != null) {
          leaderEndpoint_ =
            cluster.proto.RaftEndpointProto.newBuilder(leaderEndpoint_).mergeFrom(value).buildPartial();
        } else {
          leaderEndpoint_ = value;
        }
        onChanged();
      } else {
        leaderEndpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public Builder clearLeaderEndpoint() {
      if (leaderEndpointBuilder_ == null) {
        leaderEndpoint_ = null;
        onChanged();
      } else {
        leaderEndpoint_ = null;
        leaderEndpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder getLeaderEndpointBuilder() {
      
      onChanged();
      return getLeaderEndpointFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    public cluster.proto.RaftEndpointProtoOrBuilder getLeaderEndpointOrBuilder() {
      if (leaderEndpointBuilder_ != null) {
        return leaderEndpointBuilder_.getMessageOrBuilder();
      } else {
        return leaderEndpoint_ == null ?
            cluster.proto.RaftEndpointProto.getDefaultInstance() : leaderEndpoint_;
      }
    }
    /**
     * <code>.proto.RaftEndpointProto leaderEndpoint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> 
        getLeaderEndpointFieldBuilder() {
      if (leaderEndpointBuilder_ == null) {
        leaderEndpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder>(
                getLeaderEndpoint(),
                getParentForChildren(),
                isClean());
        leaderEndpoint_ = null;
      }
      return leaderEndpointBuilder_;
    }

    private cluster.proto.RaftEndpointProto votedEndpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> votedEndpointBuilder_;
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     * @return Whether the votedEndpoint field is set.
     */
    public boolean hasVotedEndpoint() {
      return votedEndpointBuilder_ != null || votedEndpoint_ != null;
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     * @return The votedEndpoint.
     */
    public cluster.proto.RaftEndpointProto getVotedEndpoint() {
      if (votedEndpointBuilder_ == null) {
        return votedEndpoint_ == null ? cluster.proto.RaftEndpointProto.getDefaultInstance() : votedEndpoint_;
      } else {
        return votedEndpointBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public Builder setVotedEndpoint(cluster.proto.RaftEndpointProto value) {
      if (votedEndpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        votedEndpoint_ = value;
        onChanged();
      } else {
        votedEndpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public Builder setVotedEndpoint(
        cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (votedEndpointBuilder_ == null) {
        votedEndpoint_ = builderForValue.build();
        onChanged();
      } else {
        votedEndpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public Builder mergeVotedEndpoint(cluster.proto.RaftEndpointProto value) {
      if (votedEndpointBuilder_ == null) {
        if (votedEndpoint_ != null) {
          votedEndpoint_ =
            cluster.proto.RaftEndpointProto.newBuilder(votedEndpoint_).mergeFrom(value).buildPartial();
        } else {
          votedEndpoint_ = value;
        }
        onChanged();
      } else {
        votedEndpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public Builder clearVotedEndpoint() {
      if (votedEndpointBuilder_ == null) {
        votedEndpoint_ = null;
        onChanged();
      } else {
        votedEndpoint_ = null;
        votedEndpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder getVotedEndpointBuilder() {
      
      onChanged();
      return getVotedEndpointFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    public cluster.proto.RaftEndpointProtoOrBuilder getVotedEndpointOrBuilder() {
      if (votedEndpointBuilder_ != null) {
        return votedEndpointBuilder_.getMessageOrBuilder();
      } else {
        return votedEndpoint_ == null ?
            cluster.proto.RaftEndpointProto.getDefaultInstance() : votedEndpoint_;
      }
    }
    /**
     * <code>.proto.RaftEndpointProto votedEndpoint = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> 
        getVotedEndpointFieldBuilder() {
      if (votedEndpointBuilder_ == null) {
        votedEndpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder>(
                getVotedEndpoint(),
                getParentForChildren(),
                isClean());
        votedEndpoint_ = null;
      }
      return votedEndpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.RaftTermProto)
  }

  // @@protoc_insertion_point(class_scope:proto.RaftTermProto)
  private static final cluster.proto.RaftTermProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.proto.RaftTermProto();
  }

  public static cluster.proto.RaftTermProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaftTermProto>
      PARSER = new com.google.protobuf.AbstractParser<RaftTermProto>() {
    @java.lang.Override
    public RaftTermProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<RaftTermProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaftTermProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.proto.RaftTermProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

