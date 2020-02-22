package com.haiyu.manager.pojo;

import java.util.Date;

public class postsTable {
    private Long id;

    private String title;

    private String content;

    private Date releaseTime;

    private Long userId;

    private Long readingVolume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReadingVolume() {
        return readingVolume;
    }

    public void setReadingVolume(Long readingVolume) {
        this.readingVolume = readingVolume;
    }
}