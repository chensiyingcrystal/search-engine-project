// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.proto;

public interface UpdateRaftGroupMembersOpProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.UpdateRaftGroupMembersOpProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  java.util.List<cluster.proto.RaftEndpointProto> 
      getMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  cluster.proto.RaftEndpointProto getMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  int getMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
      getMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 1;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getMemberOrBuilder(
      int index);

  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  java.util.List<cluster.proto.RaftEndpointProto> 
      getVotingMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  cluster.proto.RaftEndpointProto getVotingMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  int getVotingMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
      getVotingMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto votingMember = 2;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getVotingMemberOrBuilder(
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
  cluster.proto.RaftEndpointProto getEndpoint();
  /**
   * <code>.proto.RaftEndpointProto endpoint = 3;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getEndpointOrBuilder();

  /**
   * <code>.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto mode = 4;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto mode = 4;</code>
   * @return The mode.
   */
  cluster.proto.UpdateRaftGroupMembersOpProto.MembershipChangeModeProto getMode();
}
