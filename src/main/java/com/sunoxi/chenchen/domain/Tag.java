package com.sunoxi.chenchen.domain;

import javax.persistence.*;

/**
 * Created by sunoxi on 2018/7/14.
 */
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tid;

    @Column
    private String tag;

    @Column(length = 64)
    private String type;

    @Column(length = 64)
    private String icon;

    @Column(length = 1000)
    private String description;

    public Tag() {
    }

    public Tag(long tid) {
        this.tid = tid;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
