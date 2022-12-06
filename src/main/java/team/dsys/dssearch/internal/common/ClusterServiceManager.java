package team.dsys.dssearch.internal.common;

import team.dsys.dssearch.internal.common.message.CommonResponse;
import team.dsys.dssearch.internal.common.message.GetShardRequest;
import team.dsys.dssearch.internal.common.message.GetShardResponse;
import team.dsys.dssearch.internal.common.message.PutShardRequest;

import java.net.InetSocketAddress;
import java.util.Map;

public interface ClusterServiceManager {

    String getClusterReport();
    String getShardReport();
    CommonResponse putShardInfo(PutShardRequest request);
    GetShardResponse getShardInfo(GetShardRequest request);



}
