package com.contest.notificationProducer.dto;


import com.contest.notificationProducer.notificationEnum.PostComment;

import javax.validation.constraints.NotNull;

public class Like  extends NotificationBodyAbstractClass {
    @NotNull
    private String postId;
    @NotNull
    private String sender;
    @NotNull
    private PostComment postComment;

    public PostComment getPostComment() {
        return postComment;
    }

    public void setPostComment(PostComment postComment) {
        this.postComment = postComment;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Like{");
        sb.append("postId='").append(postId).append('\'');
        sb.append(", sender='").append(sender).append('\'');
        sb.append(", postComment=").append(postComment);
        sb.append('}');
        return sb.toString();
    }
}
