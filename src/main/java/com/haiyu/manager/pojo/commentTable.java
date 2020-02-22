package com.haiyu.manager.pojo;

import java.util.Date;

public class commentTable {
    private Long id;

    private Long postId;

    private Long userId;

    private String replyContent;

    private Date time;

    private String commentSuperiors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCommentSuperiors() {
        return commentSuperiors;
    }

    public void setCommentSuperiors(String commentSuperiors) {
        this.commentSuperiors = commentSuperiors == null ? null : commentSuperiors.trim();
    }
}