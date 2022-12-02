// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.proto;

/**
 * <pre>
 * https://github.com/MicroRaft/MicroRaft/blob/master/microraft/src/main/java/io/microraft/model/log/RaftGroupMembersView.java
 * </pre>
 *
 * Protobuf type {@code proto.RaftGroupMembersViewProto}
 */
public final class RaftGroupMembersViewProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.RaftGroupMembersViewProto)
    RaftGroupMembersViewProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RaftGroupMembersViewProto.newBuilder() to construct.
  private RaftGroupMembersViewProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RaftGroupMembersViewProto() {
    member_ = java.util.Collections.emptyList();
    votingMember_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RaftGroupMembersViewProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.proto.RaftRpc.internal_static_proto_RaftGroupMembersViewProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.proto.RaftRpc.internal_static_proto_RaftGroupMembersViewProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.proto.RaftGroupMembersViewProto.class, cluster.proto.RaftGroupMembersViewProto.Builder.class);
  }

  public static final int LOGINDEX_FIELD_NUMBER = 1;
  private long logIndex_;
  /**
   * <code>int64 logIndex = 1;</code>
   * @return The logIndex.
   */
  @java.lang.Override
  public long getLogIndex() {
    return logIndex_;
  }

  public static final int MEMBER_FIELD_NUMBER = 2;
  private java.util.List<cluster.proto.RaftEndpointProto> member_;
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  @java.lang.Override
  public java.util.List<cluster.proto.RaftEndpointProto> getMemberList() {
    return member_;
  }
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
      getMemberOrBuilderList() {
    return member_;
  }
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  @java.lang.Override
  public int getMemberCount() {
    return member_.size();
  }
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProto getMember(int index) {
    return member_.get(index);
  }
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProtoOrBuilder getMemberOrBuilder(
      int index) {
    return member_.get(index);
  }

  public static final int VOTINGMEMBER_FIELD_NUMBER = 3;
  private java.util.List<cluster.proto.RaftEndpointProto> votingMember_;
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
   */
  @java.lang.Override
  public java.util.List<cluster.proto.RaftEndpointProto> getVotingMemberList() {
    return votingMember_;
  }
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
      getVotingMemberOrBuilderList() {
    return votingMember_;
  }
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
   */
  @java.lang.Override
  public int getVotingMemberCount() {
    return votingMember_.size();
  }
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProto getVotingMember(int index) {
    return votingMember_.get(index);
  }
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
   */
  @java.lang.Override
  public cluster.proto.RaftEndpointProtoOrBuilder getVotingMemberOrBuilder(
      int index) {
    return votingMember_.get(index);
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
    if (logIndex_ != 0L) {
      output.writeInt64(1, logIndex_);
    }
    for (int i = 0; i < member_.size(); i++) {
      output.writeMessage(2, member_.get(i));
    }
    for (int i = 0; i < votingMember_.size(); i++) {
      output.writeMessage(3, votingMember_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (logIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, logIndex_);
    }
    for (int i = 0; i < member_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, member_.get(i));
    }
    for (int i = 0; i < votingMember_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, votingMember_.get(i));
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
    if (!(obj instanceof cluster.proto.RaftGroupMembersViewProto)) {
      return super.equals(obj);
    }
    cluster.proto.RaftGroupMembersViewProto other = (cluster.proto.RaftGroupMembersViewProto) obj;

    if (getLogIndex()
        != other.getLogIndex()) return false;
    if (!getMemberList()
        .equals(other.getMemberList())) return false;
    if (!getVotingMemberList()
        .equals(other.getVotingMemberList())) return false;
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
    hash = (37 * hash) + LOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLogIndex());
    if (getMemberCount() > 0) {
      hash = (37 * hash) + MEMBER_FIELD_NUMBER;
      hash = (53 * hash) + getMemberList().hashCode();
    }
    if (getVotingMemberCount() > 0) {
      hash = (37 * hash) + VOTINGMEMBER_FIELD_NUMBER;
      hash = (53 * hash) + getVotingMemberList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.proto.RaftGroupMembersViewProto parseFrom(
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
  public static Builder newBuilder(cluster.proto.RaftGroupMembersViewProto prototype) {
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
   * https://github.com/MicroRaft/MicroRaft/blob/master/microraft/src/main/java/io/microraft/model/log/RaftGroupMembersView.java
   * </pre>
   *
   * Protobuf type {@code proto.RaftGroupMembersViewProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.RaftGroupMembersViewProto)
      cluster.proto.RaftGroupMembersViewProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.proto.RaftRpc.internal_static_proto_RaftGroupMembersViewProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.proto.RaftRpc.internal_static_proto_RaftGroupMembersViewProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.proto.RaftGroupMembersViewProto.class, cluster.proto.RaftGroupMembersViewProto.Builder.class);
    }

    // Construct using cluster.proto.RaftGroupMembersViewProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logIndex_ = 0L;

      if (memberBuilder_ == null) {
        member_ = java.util.Collections.emptyList();
      } else {
        member_ = null;
        memberBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (votingMemberBuilder_ == null) {
        votingMember_ = java.util.Collections.emptyList();
      } else {
        votingMember_ = null;
        votingMemberBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.proto.RaftRpc.internal_static_proto_RaftGroupMembersViewProto_descriptor;
    }

    @java.lang.Override
    public cluster.proto.RaftGroupMembersViewProto getDefaultInstanceForType() {
      return cluster.proto.RaftGroupMembersViewProto.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.proto.RaftGroupMembersViewProto build() {
      cluster.proto.RaftGroupMembersViewProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.proto.RaftGroupMembersViewProto buildPartial() {
      cluster.proto.RaftGroupMembersViewProto result = new cluster.proto.RaftGroupMembersViewProto(this);
      int from_bitField0_ = bitField0_;
      result.logIndex_ = logIndex_;
      if (memberBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          member_ = java.util.Collections.unmodifiableList(member_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.member_ = member_;
      } else {
        result.member_ = memberBuilder_.build();
      }
      if (votingMemberBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          votingMember_ = java.util.Collections.unmodifiableList(votingMember_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.votingMember_ = votingMember_;
      } else {
        result.votingMember_ = votingMemberBuilder_.build();
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
      if (other instanceof cluster.proto.RaftGroupMembersViewProto) {
        return mergeFrom((cluster.proto.RaftGroupMembersViewProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.proto.RaftGroupMembersViewProto other) {
      if (other == cluster.proto.RaftGroupMembersViewProto.getDefaultInstance()) return this;
      if (other.getLogIndex() != 0L) {
        setLogIndex(other.getLogIndex());
      }
      if (memberBuilder_ == null) {
        if (!other.member_.isEmpty()) {
          if (member_.isEmpty()) {
            member_ = other.member_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMemberIsMutable();
            member_.addAll(other.member_);
          }
          onChanged();
        }
      } else {
        if (!other.member_.isEmpty()) {
          if (memberBuilder_.isEmpty()) {
            memberBuilder_.dispose();
            memberBuilder_ = null;
            member_ = other.member_;
            bitField0_ = (bitField0_ & ~0x00000001);
            memberBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMemberFieldBuilder() : null;
          } else {
            memberBuilder_.addAllMessages(other.member_);
          }
        }
      }
      if (votingMemberBuilder_ == null) {
        if (!other.votingMember_.isEmpty()) {
          if (votingMember_.isEmpty()) {
            votingMember_ = other.votingMember_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVotingMemberIsMutable();
            votingMember_.addAll(other.votingMember_);
          }
          onChanged();
        }
      } else {
        if (!other.votingMember_.isEmpty()) {
          if (votingMemberBuilder_.isEmpty()) {
            votingMemberBuilder_.dispose();
            votingMemberBuilder_ = null;
            votingMember_ = other.votingMember_;
            bitField0_ = (bitField0_ & ~0x00000002);
            votingMemberBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVotingMemberFieldBuilder() : null;
          } else {
            votingMemberBuilder_.addAllMessages(other.votingMember_);
          }
        }
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
              logIndex_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              cluster.proto.RaftEndpointProto m =
                  input.readMessage(
                      cluster.proto.RaftEndpointProto.parser(),
                      extensionRegistry);
              if (memberBuilder_ == null) {
                ensureMemberIsMutable();
                member_.add(m);
              } else {
                memberBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              cluster.proto.RaftEndpointProto m =
                  input.readMessage(
                      cluster.proto.RaftEndpointProto.parser(),
                      extensionRegistry);
              if (votingMemberBuilder_ == null) {
                ensureVotingMemberIsMutable();
                votingMember_.add(m);
              } else {
                votingMemberBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private long logIndex_ ;
    /**
     * <code>int64 logIndex = 1;</code>
     * @return The logIndex.
     */
    @java.lang.Override
    public long getLogIndex() {
      return logIndex_;
    }
    /**
     * <code>int64 logIndex = 1;</code>
     * @param value The logIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLogIndex(long value) {
      
      logIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 logIndex = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogIndex() {
      
      logIndex_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<cluster.proto.RaftEndpointProto> member_ =
      java.util.Collections.emptyList();
    private void ensureMemberIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        member_ = new java.util.ArrayList<cluster.proto.RaftEndpointProto>(member_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> memberBuilder_;

    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public java.util.List<cluster.proto.RaftEndpointProto> getMemberList() {
      if (memberBuilder_ == null) {
        return java.util.Collections.unmodifiableList(member_);
      } else {
        return memberBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public int getMemberCount() {
      if (memberBuilder_ == null) {
        return member_.size();
      } else {
        return memberBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public cluster.proto.RaftEndpointProto getMember(int index) {
      if (memberBuilder_ == null) {
        return member_.get(index);
      } else {
        return memberBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder setMember(
        int index, cluster.proto.RaftEndpointProto value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.set(index, value);
        onChanged();
      } else {
        memberBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder setMember(
        int index, cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.set(index, builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder addMember(cluster.proto.RaftEndpointProto value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.add(value);
        onChanged();
      } else {
        memberBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder addMember(
        int index, cluster.proto.RaftEndpointProto value) {
      if (memberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMemberIsMutable();
        member_.add(index, value);
        onChanged();
      } else {
        memberBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder addMember(
        cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.add(builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder addMember(
        int index, cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.add(index, builderForValue.build());
        onChanged();
      } else {
        memberBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder addAllMember(
        java.lang.Iterable<? extends cluster.proto.RaftEndpointProto> values) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, member_);
        onChanged();
      } else {
        memberBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder clearMember() {
      if (memberBuilder_ == null) {
        member_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        memberBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public Builder removeMember(int index) {
      if (memberBuilder_ == null) {
        ensureMemberIsMutable();
        member_.remove(index);
        onChanged();
      } else {
        memberBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder getMemberBuilder(
        int index) {
      return getMemberFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public cluster.proto.RaftEndpointProtoOrBuilder getMemberOrBuilder(
        int index) {
      if (memberBuilder_ == null) {
        return member_.get(index);  } else {
        return memberBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
         getMemberOrBuilderList() {
      if (memberBuilder_ != null) {
        return memberBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(member_);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder addMemberBuilder() {
      return getMemberFieldBuilder().addBuilder(
          cluster.proto.RaftEndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder addMemberBuilder(
        int index) {
      return getMemberFieldBuilder().addBuilder(
          index, cluster.proto.RaftEndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.RaftEndpointProto member = 2;</code>
     */
    public java.util.List<cluster.proto.RaftEndpointProto.Builder> 
         getMemberBuilderList() {
      return getMemberFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> 
        getMemberFieldBuilder() {
      if (memberBuilder_ == null) {
        memberBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder>(
                member_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        member_ = null;
      }
      return memberBuilder_;
    }

    private java.util.List<cluster.proto.RaftEndpointProto> votingMember_ =
      java.util.Collections.emptyList();
    private void ensureVotingMemberIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        votingMember_ = new java.util.ArrayList<cluster.proto.RaftEndpointProto>(votingMember_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> votingMemberBuilder_;

    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public java.util.List<cluster.proto.RaftEndpointProto> getVotingMemberList() {
      if (votingMemberBuilder_ == null) {
        return java.util.Collections.unmodifiableList(votingMember_);
      } else {
        return votingMemberBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public int getVotingMemberCount() {
      if (votingMemberBuilder_ == null) {
        return votingMember_.size();
      } else {
        return votingMemberBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public cluster.proto.RaftEndpointProto getVotingMember(int index) {
      if (votingMemberBuilder_ == null) {
        return votingMember_.get(index);
      } else {
        return votingMemberBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder setVotingMember(
        int index, cluster.proto.RaftEndpointProto value) {
      if (votingMemberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotingMemberIsMutable();
        votingMember_.set(index, value);
        onChanged();
      } else {
        votingMemberBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder setVotingMember(
        int index, cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (votingMemberBuilder_ == null) {
        ensureVotingMemberIsMutable();
        votingMember_.set(index, builderForValue.build());
        onChanged();
      } else {
        votingMemberBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder addVotingMember(cluster.proto.RaftEndpointProto value) {
      if (votingMemberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotingMemberIsMutable();
        votingMember_.add(value);
        onChanged();
      } else {
        votingMemberBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder addVotingMember(
        int index, cluster.proto.RaftEndpointProto value) {
      if (votingMemberBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotingMemberIsMutable();
        votingMember_.add(index, value);
        onChanged();
      } else {
        votingMemberBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder addVotingMember(
        cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (votingMemberBuilder_ == null) {
        ensureVotingMemberIsMutable();
        votingMember_.add(builderForValue.build());
        onChanged();
      } else {
        votingMemberBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder addVotingMember(
        int index, cluster.proto.RaftEndpointProto.Builder builderForValue) {
      if (votingMemberBuilder_ == null) {
        ensureVotingMemberIsMutable();
        votingMember_.add(index, builderForValue.build());
        onChanged();
      } else {
        votingMemberBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder addAllVotingMember(
        java.lang.Iterable<? extends cluster.proto.RaftEndpointProto> values) {
      if (votingMemberBuilder_ == null) {
        ensureVotingMemberIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, votingMember_);
        onChanged();
      } else {
        votingMemberBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder clearVotingMember() {
      if (votingMemberBuilder_ == null) {
        votingMember_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        votingMemberBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public Builder removeVotingMember(int index) {
      if (votingMemberBuilder_ == null) {
        ensureVotingMemberIsMutable();
        votingMember_.remove(index);
        onChanged();
      } else {
        votingMemberBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder getVotingMemberBuilder(
        int index) {
      return getVotingMemberFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public cluster.proto.RaftEndpointProtoOrBuilder getVotingMemberOrBuilder(
        int index) {
      if (votingMemberBuilder_ == null) {
        return votingMember_.get(index);  } else {
        return votingMemberBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
         getVotingMemberOrBuilderList() {
      if (votingMemberBuilder_ != null) {
        return votingMemberBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(votingMember_);
      }
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder addVotingMemberBuilder() {
      return getVotingMemberFieldBuilder().addBuilder(
          cluster.proto.RaftEndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public cluster.proto.RaftEndpointProto.Builder addVotingMemberBuilder(
        int index) {
      return getVotingMemberFieldBuilder().addBuilder(
          index, cluster.proto.RaftEndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.RaftEndpointProto votingMember = 3;</code>
     */
    public java.util.List<cluster.proto.RaftEndpointProto.Builder> 
         getVotingMemberBuilderList() {
      return getVotingMemberFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder> 
        getVotingMemberFieldBuilder() {
      if (votingMemberBuilder_ == null) {
        votingMemberBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cluster.proto.RaftEndpointProto, cluster.proto.RaftEndpointProto.Builder, cluster.proto.RaftEndpointProtoOrBuilder>(
                votingMember_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        votingMember_ = null;
      }
      return votingMemberBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.RaftGroupMembersViewProto)
  }

  // @@protoc_insertion_point(class_scope:proto.RaftGroupMembersViewProto)
  private static final cluster.proto.RaftGroupMembersViewProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.proto.RaftGroupMembersViewProto();
  }

  public static cluster.proto.RaftGroupMembersViewProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaftGroupMembersViewProto>
      PARSER = new com.google.protobuf.AbstractParser<RaftGroupMembersViewProto>() {
    @java.lang.Override
    public RaftGroupMembersViewProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<RaftGroupMembersViewProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaftGroupMembersViewProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.proto.RaftGroupMembersViewProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

