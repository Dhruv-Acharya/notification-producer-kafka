package com.contest.notificationProducer.dto;

import java.util.List;

public class SubscriptionNotice  extends NotificationBodyAbstractClass{
    List<String> followerIds;
    private String contestId;
    private String contestName;

    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public List<String> getFollowerIds() {
        return followerIds;
    }

    public void setFollowerIds(List<String> followerIds) {
        this.followerIds = followerIds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubscriptionNotice{");
        sb.append("followerIds=").append(followerIds);
        sb.append('}');
        return sb.toString();
    }
}
