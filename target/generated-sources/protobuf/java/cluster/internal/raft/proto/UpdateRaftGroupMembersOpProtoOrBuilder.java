// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface UpdateRaftGroupMembersOpProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.UpdateRaftGroupMembersOpProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  java.util.List<cluster.internal.raft.proto.RaftEndpointProto> 
      getMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProto getMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  int getMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  java.util.List<? extends cluster.internal.raft.proto.RaftEndpointProtoOrBuilder> 
      getMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getMemberOrBuilder(
      int index);

  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  java.util.List<cluster.internal.raft.proto.RaftEndpointProto> 
      getVotingMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProto getVotingMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  int getVotingMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  java.util.List<? extends cluster.internal.raft.proto.RaftEndpointProtoOrBuilder> 
      getVotingMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getVotingMemberOrBuilder(
      int index);

  /**
   * <code>.proto.RaftEndpointProto endpoint = 3;</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <code>.proto.RaftEndpointProto endpoint = 3;</code>
   * @return The endpoint.
   */
  cluster.internal.raft.proto.RaftEndpointProto getEndpoint();
  /**
   * <code>.proto.RaftEndpointProto endpoint = 3;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getEndpointOrBuilder();

  /**
   * <code>.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto mode = 4;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto mode = 4;</code>
   * @return The mode.
   */
  cluster.internal.raft.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto getMode();
}
