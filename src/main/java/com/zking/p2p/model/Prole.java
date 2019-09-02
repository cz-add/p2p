package com.zking.p2p.model;

import lombok.ToString;

/**
 * 角色表
 */
@ToString
public class Prole {
    private Integer rid;//主键id

    private String rname;//角色名：唯一

    private Integer available;//可用

    private String content;//角色描述

    public Prole(Integer rid, String rname, Integer available, String content) {
        this.rid = rid;
        this.rname = rname;
        this.available = available;
        this.content = content;
    }

    public Prole() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}