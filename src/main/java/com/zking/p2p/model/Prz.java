package com.zking.p2p.model;

import lombok.ToString;

import java.util.Date;

/**
 * 认证表
 */
@ToString
public class Prz {
    private Integer rz;//主键id

    private Integer uid;//用户id 外键

    private String rname;//认证用户名

    private Integer rztypes;//认证类型(0.身份认证1.实名认证2.视频认证3.短信认证）

    private Integer state;//认证状态(0.未审核1.待审核2.审核通过3.审核成功)

    private Date rztime;//认证时间

    private String rzr;//认证人

    public Prz(Integer rz, Integer uid, String rname, Integer rztypes, Integer state, Date rztime, String rzr) {
        this.rz = rz;
        this.uid = uid;
        this.rname = rname;
        this.rztypes = rztypes;
        this.state = state;
        this.rztime = rztime;
        this.rzr = rzr;
    }

    public Prz() {
        super();
    }

    public Integer getRz() {
        return rz;
    }

    public void setRz(Integer rz) {
        this.rz = rz;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getRztypes() {
        return rztypes;
    }

    public void setRztypes(Integer rztypes) {
        this.rztypes = rztypes;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getRztime() {
        return rztime;
    }

    public void setRztime(Date rztime) {
        this.rztime = rztime;
    }

    public String getRzr() {
        return rzr;
    }

    public void setRzr(String rzr) {
        this.rzr = rzr;
    }
}