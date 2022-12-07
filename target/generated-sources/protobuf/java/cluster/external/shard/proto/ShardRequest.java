// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public final class ShardRequest {
  private ShardRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ShardInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ShardInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DataNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DataNodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PutShardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PutShardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CommonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CommonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetShardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetShardRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ShardInfoWithDataNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ShardInfoWithDataNodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetShardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetShardResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ShardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ShardResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetAllShardRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetAllShardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ShardRequest.proto\022\005proto\"/\n\tShardInfo" +
      "\022\017\n\007shardId\030\003 \001(\005\022\021\n\tisPrimary\030\004 \001(\010\"3\n\014" +
      "DataNodeInfo\022\022\n\ndataNodeId\030\001 \001(\005\022\017\n\007addr" +
      "ess\030\002 \001(\t\"a\n\017PutShardRequest\022)\n\014dataNode" +
      "Info\030\001 \001(\0132\023.proto.DataNodeInfo\022#\n\tshard" +
      "Info\030\002 \003(\0132\020.proto.ShardInfo\"-\n\016CommonRe" +
      "sponse\022\016\n\006status\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\":\n\017G" +
      "etShardRequest\022\017\n\007shardId\030\001 \003(\005\022\026\n\016minCo" +
      "mmitIndex\030\002 \001(\003\"l\n\031ShardInfoWithDataNode" +
      "Info\022#\n\tshardInfo\030\001 \001(\0132\020.proto.ShardInf" +
      "o\022*\n\rdataNodeInfos\030\002 \003(\0132\023.proto.DataNod" +
      "eInfo\"W\n\020GetShardResponse\022C\n\031shardInfoWi" +
      "thDataNodeInfo\030\001 \003(\0132 .proto.ShardInfoWi" +
      "thDataNodeInfo\"\224\001\n\rShardResponse\022\023\n\013comm" +
      "itIndex\030\001 \001(\003\022/\n\016commonResponse\030\002 \001(\0132\025." +
      "proto.CommonResponseH\000\0223\n\020getShardRespon" +
      "se\030\003 \001(\0132\027.proto.GetShardResponseH\000B\010\n\006r" +
      "esult\"\024\n\022GetAllShardRequest2\272\001\n\023ShardReq" +
      "uestHandler\0223\n\003put\022\026.proto.PutShardReque" +
      "st\032\024.proto.ShardResponse\0223\n\003get\022\026.proto." +
      "GetShardRequest\032\024.proto.ShardResponse\0229\n" +
      "\006getAll\022\031.proto.GetAllShardRequest\032\024.pro" +
      "to.ShardResponseB \n\034cluster.external.sha" +
      "rd.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_ShardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ShardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ShardInfo_descriptor,
        new java.lang.String[] { "ShardId", "IsPrimary", });
    internal_static_proto_DataNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_DataNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DataNodeInfo_descriptor,
        new java.lang.String[] { "DataNodeId", "Address", });
    internal_static_proto_PutShardRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_PutShardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PutShardRequest_descriptor,
        new java.lang.String[] { "DataNodeInfo", "ShardInfo", });
    internal_static_proto_CommonResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_CommonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CommonResponse_descriptor,
        new java.lang.String[] { "Status", "Msg", });
    internal_static_proto_GetShardRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_GetShardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetShardRequest_descriptor,
        new java.lang.String[] { "ShardId", "MinCommitIndex", });
    internal_static_proto_ShardInfoWithDataNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_ShardInfoWithDataNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ShardInfoWithDataNodeInfo_descriptor,
        new java.lang.String[] { "ShardInfo", "DataNodeInfos", });
    internal_static_proto_GetShardResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_GetShardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetShardResponse_descriptor,
        new java.lang.String[] { "ShardInfoWithDataNodeInfo", });
    internal_static_proto_ShardResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_ShardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ShardResponse_descriptor,
        new java.lang.String[] { "CommitIndex", "CommonResponse", "GetShardResponse", "Result", });
    internal_static_proto_GetAllShardRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_GetAllShardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetAllShardRequest_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}