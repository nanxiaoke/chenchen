package com.sunoxi.chenchen.domain;

import javax.persistence.*;

/**
 * Created by sunoxi on 2018/7/14.
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cid;

    @Column
    private String category;

    @Column(length = 64)
    private String type;

    @Column(length = 1000)
    private String description;

    public Category() {
    }

    public Category(long cid) {
        this.cid = cid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
