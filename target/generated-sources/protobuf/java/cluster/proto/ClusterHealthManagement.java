// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

public final class ClusterHealthManagement {
  private ClusterHealthManagement() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RaftGroupMembersProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RaftGroupMembersProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RaftTermProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RaftTermProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RaftLogStatsProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RaftLogStatsProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RaftLogStatsProto_FollowerMatchIndexEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RaftLogStatsProto_FollowerMatchIndexEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RaftNodeReportProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RaftNodeReportProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetRaftNodeReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetRaftNodeReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetRaftNodeReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetRaftNodeReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetRaftNodeReportResponse_EndpointAddressEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetRaftNodeReportResponse_EndpointAddressEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddRaftEndpointAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AddRaftEndpointAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddRaftEndpointAddressResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AddRaftEndpointAddressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddRaftEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AddRaftEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddRaftEndpointResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AddRaftEndpointResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ClusterHealthManagement.proto\022\005proto\032\r" +
      "RaftRpc.proto\"S\n\025RaftGroupMembersProto\022\020" +
      "\n\010logIndex\030\001 \001(\003\022(\n\006member\030\002 \003(\0132\030.proto" +
      ".RaftEndpointProto\"\200\001\n\rRaftTermProto\022\014\n\004" +
      "term\030\001 \001(\005\0220\n\016leaderEndpoint\030\002 \001(\0132\030.pro" +
      "to.RaftEndpointProto\022/\n\rvotedEndpoint\030\003 " +
      "\001(\0132\030.proto.RaftEndpointProto\"\326\002\n\021RaftLo" +
      "gStatsProto\022\023\n\013commitIndex\030\001 \001(\003\022\035\n\025last" +
      "LogOrSnapshotTerm\030\002 \001(\003\022\036\n\026lastLogOrSnap" +
      "shotIndex\030\003 \001(\003\022\024\n\014snapshotTerm\030\004 \001(\003\022\025\n" +
      "\rsnapshotIndex\030\005 \001(\003\022\031\n\021takeSnapshotCoun" +
      "t\030\006 \001(\005\022\034\n\024installSnapshotCount\030\007 \001(\005\022L\n" +
      "\022followerMatchIndex\030\010 \003(\01320.proto.RaftLo" +
      "gStatsProto.FollowerMatchIndexEntry\0329\n\027F" +
      "ollowerMatchIndexEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\003:\0028\001\"\305\003\n\023RaftNodeReportProto\0220" +
      "\n\006reason\030\001 \001(\0162 .proto.RaftNodeReportRea" +
      "sonProto\022\017\n\007groupId\030\002 \001(\t\022*\n\010endpoint\030\003 " +
      "\001(\0132\030.proto.RaftEndpointProto\0224\n\016initial" +
      "Members\030\004 \001(\0132\034.proto.RaftGroupMembersPr" +
      "oto\0226\n\020committedMembers\030\005 \001(\0132\034.proto.Ra" +
      "ftGroupMembersProto\0226\n\020effectiveMembers\030" +
      "\006 \001(\0132\034.proto.RaftGroupMembersProto\022\"\n\004r" +
      "ole\030\007 \001(\0162\024.proto.RaftRoleProto\022*\n\006statu" +
      "s\030\010 \001(\0162\032.proto.RaftNodeStatusProto\022\"\n\004t" +
      "erm\030\t \001(\0132\024.proto.RaftTermProto\022%\n\003log\030\n" +
      " \001(\0132\030.proto.RaftLogStatsProto\"\032\n\030GetRaf" +
      "tNodeReportRequest\"\317\001\n\031GetRaftNodeReport" +
      "Response\022*\n\006report\030\001 \001(\0132\032.proto.RaftNod" +
      "eReportProto\022N\n\017endpointAddress\030\002 \003(\01325." +
      "proto.GetRaftNodeReportResponse.Endpoint" +
      "AddressEntry\0326\n\024EndpointAddressEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\\\n\035AddRaftE" +
      "ndpointAddressRequest\022*\n\010endpoint\030\001 \001(\0132" +
      "\030.proto.RaftEndpointProto\022\017\n\007address\030\002 \001" +
      "(\t\" \n\036AddRaftEndpointAddressResponse\"{\n\026" +
      "AddRaftEndpointRequest\022*\n\010endpoint\030\001 \001(\013" +
      "2\030.proto.RaftEndpointProto\022\024\n\014votingMemb" +
      "er\030\002 \001(\010\022\037\n\027groupMembersCommitIndex\030\003 \001(" +
      "\003\":\n\027AddRaftEndpointResponse\022\037\n\027groupMem" +
      "bersCommitIndex\030\001 \001(\003*E\n\rRaftRoleProto\022\n" +
      "\n\006LEADER\020\000\022\r\n\tCANDIDATE\020\001\022\014\n\010FOLLOWER\020\002\022" +
      "\013\n\007LEARNER\020\003*\236\001\n\031RaftNodeReportReasonPro" +
      "to\022\021\n\rSTATUS_CHANGE\020\000\022\017\n\013ROLE_CHANGE\020\001\022\030" +
      "\n\024GROUP_MEMBERS_CHANGE\020\002\022\021\n\rTAKE_SNAPSHO" +
      "T\020\003\022\024\n\020INSTALL_SNAPSHOT\020\004\022\014\n\010PERIODIC\020\005\022" +
      "\014\n\010API_CALL\020\006*c\n\023RaftNodeStatusProto\022\013\n\007" +
      "INITIAL\020\000\022\n\n\006ACTIVE\020\001\022#\n\037UPDATING_RAFT_G" +
      "ROUP_MEMBER_LIST\020\002\022\016\n\nTERMINATED\020\0032\261\002\n\030M" +
      "anagementRequestHandler\022X\n\021getRaftNodeRe" +
      "port\022\037.proto.GetRaftNodeReportRequest\032 ." +
      "proto.GetRaftNodeReportResponse\"\000\022g\n\026add" +
      "RaftEndpointAddress\022$.proto.AddRaftEndpo" +
      "intAddressRequest\032%.proto.AddRaftEndpoin" +
      "tAddressResponse\"\000\022R\n\017addRaftEndpoint\022\035." +
      "proto.AddRaftEndpointRequest\032\036.proto.Add" +
      "RaftEndpointResponse\"\000B\021\n\rcluster.protoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cluster.proto.RaftRpc.getDescriptor(),
        });
    internal_static_proto_RaftGroupMembersProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_RaftGroupMembersProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RaftGroupMembersProto_descriptor,
        new java.lang.String[] { "LogIndex", "Member", });
    internal_static_proto_RaftTermProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_RaftTermProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RaftTermProto_descriptor,
        new java.lang.String[] { "Term", "LeaderEndpoint", "VotedEndpoint", });
    internal_static_proto_RaftLogStatsProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_RaftLogStatsProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RaftLogStatsProto_descriptor,
        new java.lang.String[] { "CommitIndex", "LastLogOrSnapshotTerm", "LastLogOrSnapshotIndex", "SnapshotTerm", "SnapshotIndex", "TakeSnapshotCount", "InstallSnapshotCount", "FollowerMatchIndex", });
    internal_static_proto_RaftLogStatsProto_FollowerMatchIndexEntry_descriptor =
      internal_static_proto_RaftLogStatsProto_descriptor.getNestedTypes().get(0);
    internal_static_proto_RaftLogStatsProto_FollowerMatchIndexEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RaftLogStatsProto_FollowerMatchIndexEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto_RaftNodeReportProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_RaftNodeReportProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RaftNodeReportProto_descriptor,
        new java.lang.String[] { "Reason", "GroupId", "Endpoint", "InitialMembers", "CommittedMembers", "EffectiveMembers", "Role", "Status", "Term", "Log", });
    internal_static_proto_GetRaftNodeReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_GetRaftNodeReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetRaftNodeReportRequest_descriptor,
        new java.lang.String[] { });
    internal_static_proto_GetRaftNodeReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_GetRaftNodeReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetRaftNodeReportResponse_descriptor,
        new java.lang.String[] { "Report", "EndpointAddress", });
    internal_static_proto_GetRaftNodeReportResponse_EndpointAddressEntry_descriptor =
      internal_static_proto_GetRaftNodeReportResponse_descriptor.getNestedTypes().get(0);
    internal_static_proto_GetRaftNodeReportResponse_EndpointAddressEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetRaftNodeReportResponse_EndpointAddressEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto_AddRaftEndpointAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_AddRaftEndpointAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AddRaftEndpointAddressRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Address", });
    internal_static_proto_AddRaftEndpointAddressResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_AddRaftEndpointAddressResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AddRaftEndpointAddressResponse_descriptor,
        new java.lang.String[] { });
    internal_static_proto_AddRaftEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_AddRaftEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AddRaftEndpointRequest_descriptor,
        new java.lang.String[] { "Endpoint", "VotingMember", "GroupMembersCommitIndex", });
    internal_static_proto_AddRaftEndpointResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_proto_AddRaftEndpointResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AddRaftEndpointResponse_descriptor,
        new java.lang.String[] { "GroupMembersCommitIndex", });
    cluster.proto.RaftRpc.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
