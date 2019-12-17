package com.example.demo.domain;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;


@Entity  // 该注解声明一个实体类，与数据库中的表对应
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id //表明id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自动生成
    private Long id;

    private String lon;
    private String lat;
    private String landClass;
    private String resourceAddress;

    private String landRemarks;

    @CreatedDate    //自动生成时间
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    public User() {
    }

    public User(String lon, String lat, String landClass, String resourceAddress, String landRemarks) {
        this.lon = lon;
        this.lat = lat;
        this.landClass = landClass;
        this.resourceAddress = resourceAddress;
        this.landRemarks = landRemarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLandClass() {
        return landClass;
    }

    public void setLandClass(String landClass) {
        this.landClass = landClass;
    }

    public String getResourceAddress() {
        return resourceAddress;
    }

    public void setResourceAddress(String resourceAddress) {
        this.resourceAddress = resourceAddress;
    }

    public String getLandRemarks() {
        return landRemarks;
    }

    public void setLandRemarks(String landRemarks) {
        this.landRemarks = landRemarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}