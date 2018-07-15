package com.sunoxi.chenchen.domain;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sunoxi on 2018/7/14.
 * 照片
 */
@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vid;

    @Column
    private String name;

    @Column
    private String title;

    @ManyToMany
    @Cascade(value = {CascadeType.SAVE_UPDATE})
    @JoinTable(name="video_tags",joinColumns={@JoinColumn(name="vid")},inverseJoinColumns={@JoinColumn(name="tid")})
    private List<Tag> tags = new ArrayList<>();

    @Column(length = 1000)
    private String description;

    @Column(name = "shooting_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shootingTime;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "net_url", length = 1000)
    private String netUrl;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Video() {
    }

    public Video(long vid) {
        this.vid = vid;
    }

    public long getVid() {
        return vid;
    }

    public void setVid(long vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getShootingTime() {
        return shootingTime;
    }

    public void setShootingTime(Date shootingTime) {
        this.shootingTime = shootingTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getNetUrl() {
        return netUrl;
    }

    public void setNetUrl(String netUrl) {
        this.netUrl = netUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
