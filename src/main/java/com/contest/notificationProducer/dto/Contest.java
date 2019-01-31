package com.contest.notificationProducer.dto;

import javax.validation.constraints.NotNull;

public class Contest extends NotificationBodyAbstractClass {
    @NotNull
    private String contestId;
    @NotNull
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
}
