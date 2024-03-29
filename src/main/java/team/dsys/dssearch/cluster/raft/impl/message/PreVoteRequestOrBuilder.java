package team.dsys.dssearch.cluster.raft.impl.message;

import cluster.internal.raft.proto.PreVoteRequestProto;
import cluster.internal.raft.proto.RaftMessageRequest;
import io.microraft.RaftEndpoint;
import io.microraft.model.message.PreVoteRequest;
import io.microraft.model.message.PreVoteRequest.PreVoteRequestBuilder;
import team.dsys.dssearch.cluster.raft.RaftNodeEndpoint;

import javax.annotation.Nonnull;

public class PreVoteRequestOrBuilder implements PreVoteRequest, PreVoteRequestBuilder, RaftMessageRequestAware {

    private PreVoteRequestProto.Builder builder;
    private PreVoteRequestProto request;
    private RaftEndpoint sender;

    public PreVoteRequestOrBuilder() {
        this.builder = PreVoteRequestProto.newBuilder();
    }

    public PreVoteRequestOrBuilder(PreVoteRequestProto request) {
        this.request = request;
        this.sender = RaftNodeEndpoint.wrap(request.getSender());
    }

    public PreVoteRequestProto getRequest() {
        return request;
    }

    @Nonnull
    @Override
    public PreVoteRequestBuilder setGroupId(@Nonnull Object groupId) {
        builder.setGroupId((String) groupId);
        return this;
    }

    @Nonnull
    @Override
    public PreVoteRequestBuilder setSender(@Nonnull RaftEndpoint sender) {
        builder.setSender(RaftNodeEndpoint.unwrap(sender));
        this.sender = sender;
        return this;
    }

    @Nonnull
    @Override
    public PreVoteRequestBuilder setTerm(int term) {
        builder.setTerm(term);
        return this;
    }

    @Nonnull
    @Override
    public PreVoteRequestBuilder setLastLogTerm(int lastLogTerm) {
        builder.setLastLogTerm(lastLogTerm);
        return this;
    }

    @Nonnull
    @Override
    public PreVoteRequestBuilder setLastLogIndex(long lastLogIndex) {
        builder.setLastLogIndex(lastLogIndex);
        return this;
    }

    @Nonnull
    @Override
    public PreVoteRequest build() {
        request = builder.build();
        builder = null;
        return this;
    }

    @Override
    public void populate(RaftMessageRequest.Builder builder) {
        builder.setPreVoteRequest(request);
    }

    @Override
    public String toString() {
        if (builder != null) {
            return "PreVoteRequest{builder=" + builder + "}";
        }

        return "PreVoteRequest{" + "groupId=" + getGroupId() + ", sender=" + sender.getId() + ", term=" + getTerm()
                + ", lastLogTerm=" + getLastLogTerm() + ", lastLogIndex=" + getLastLogIndex() + '}';
    }

    @Override
    public int getLastLogTerm() {
        return request.getLastLogTerm();
    }

    @Override
    public long getLastLogIndex() {
        return request.getLastLogIndex();
    }

    @Override
    public Object getGroupId() {
        return request.getGroupId();
    }

    @Nonnull
    @Override
    public RaftEndpoint getSender() {
        return sender;
    }

    @Override
    public int getTerm() {
        return request.getTerm();
    }

}
