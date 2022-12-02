package team.dsys.dssearch.cluster.raft.impl.group;

import cluster.proto.UpdateRaftGroupMembersOpProto;
import io.microraft.MembershipChangeMode;
import io.microraft.RaftEndpoint;
import io.microraft.model.groupop.UpdateRaftGroupMembersOp;
import team.dsys.dssearch.cluster.raft.RaftNodeEndpoint;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateRaftGroupMembersOpOrBuilder implements UpdateRaftGroupMembersOp, UpdateRaftGroupMembersOp.UpdateRaftGroupMembersOpBuilder {

    private UpdateRaftGroupMembersOpProto.Builder builder;
    private UpdateRaftGroupMembersOpProto operation;
    private Collection<RaftEndpoint> members = new LinkedHashSet<>();
    private Collection<RaftEndpoint> votingMembers = new LinkedHashSet<>();
    private RaftEndpoint endpoint;

    public UpdateRaftGroupMembersOpOrBuilder() {
        this.builder = UpdateRaftGroupMembersOpProto.newBuilder();
    }

    public UpdateRaftGroupMembersOpOrBuilder(UpdateRaftGroupMembersOpProto op) {
        this.operation = op;
        op.getMemberList().stream().map(RaftNodeEndpoint::new).forEach(members::add);
        op.getVotingMemberList().stream().map(RaftNodeEndpoint::new).forEach(votingMembers::add);
        this.endpoint = new RaftNodeEndpoint(op.getEndpoint());
    }

    public UpdateRaftGroupMembersOpProto getOp() {
        return operation;
    }

    @Nonnull
    @Override
    public Collection<RaftEndpoint> getMembers() {
        return members;
    }

    @Nonnull
    @Override
    public Collection<RaftEndpoint> getVotingMembers() {
        return votingMembers;
    }

    @Nonnull
    @Override
    public RaftEndpoint getEndpoint() {
        return endpoint;
    }

    @Nonnull
    @Override
    public MembershipChangeMode getMode() {
        if (operation.getMode() == UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.ADD_LEARNER) {
            return MembershipChangeMode.ADD_LEARNER;
        } else if (operation.getMode() == UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.ADD_OR_PROMOTE_TO_FOLLOWER) {
            return MembershipChangeMode.ADD_OR_PROMOTE_TO_FOLLOWER;
        } else if (operation.getMode() == UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.REMOVE_MEMBER) {
            return MembershipChangeMode.REMOVE_MEMBER;
        }
        throw new IllegalStateException();
    }

    @Nonnull
    @Override
    public UpdateRaftGroupMembersOpBuilder setMembers(@Nonnull Collection<RaftEndpoint> members) {
        for (RaftEndpoint member : members) {
            builder.addMember((String) member.getId());
        }
        this.members.clear();
        this.members.addAll(members);
        return this;
    }

    @Nonnull
    @Override
    public UpdateRaftGroupMembersOpBuilder setVotingMembers(@Nonnull Collection<RaftEndpoint> votingMembers) {
        for (RaftEndpoint votingMember : votingMembers) {
            builder.addMember((String) votingMember.getId());
        }
        this.votingMembers.clear();
        this.votingMembers.addAll(votingMembers);
        return this;
    }

    @Nonnull
    @Override
    public UpdateRaftGroupMembersOpBuilder setEndpoint(@Nonnull RaftEndpoint raftEndpoint) {
        builder.setEndpoint((String) raftEndpoint.getId());
        this.endpoint = raftEndpoint;
        return this;
    }

    @Nonnull
    @Override
    public UpdateRaftGroupMembersOpBuilder setMode(@Nonnull MembershipChangeMode membershipChangeMode) {
        if (membershipChangeMode == MembershipChangeMode.ADD_LEARNER) {
            builder.setMode(UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.ADD_LEARNER);
            return this;
        } else if (membershipChangeMode == MembershipChangeMode.ADD_OR_PROMOTE_TO_FOLLOWER) {
            builder.setMode(UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.ADD_OR_PROMOTE_TO_FOLLOWER);
            return this;
        } else if (membershipChangeMode == MembershipChangeMode.REMOVE_MEMBER) {
            builder.setMode(UpdateRaftGroupMembersOpProto.MembershipChangeModeProto.REMOVE_MEMBER);
            return this;
        }

        throw new RuntimeException("Invalid mode: " + membershipChangeMode);
    }

    @Nonnull
    @Override
    public UpdateRaftGroupMembersOp build() {
        operation = builder.build();
        builder = null;
        return this;
    }

    @Override
    public String toString() {
        if (builder != null) {
            return "UpdateRaftGroupMembersOp{builder=" + builder + "}";
        }

        List<Object> memberIds = members.stream().map(RaftEndpoint::getId).collect(Collectors.toList());
        List<Object> votingMemberIds = votingMembers.stream().map(RaftEndpoint::getId).collect(Collectors.toList());
        return "UpdateRaftGroupMembersOp{" + "members=" + memberIds + ", votingMembers=" + votingMemberIds
                + ", endpoint=" + endpoint.getId() + ", " + "mode=" + getMode() + '}';
    }
}
