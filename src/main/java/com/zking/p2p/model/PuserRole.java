package com.zking.p2p.model;

import lombok.ToString;

/**
 * 用户角色表
 */
@ToString
public class PuserRole {
    private Integer urid;//主键id

    private String uid;//用户id 外键

    private Integer rid;//角色id 外键

    public PuserRole(Integer urid, String uid, Integer rid) {
        this.urid = urid;
        this.uid = uid;
        this.rid = rid;
    }

    public PuserRole() {
        super();
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}