package com.zking.p2p.model;

import lombok.ToString;

/**
 * 权限角色表
 */
@ToString
public class PpermissionRole {
    private Integer rrid;//主键id

    private Integer pid;//权限id 外键

    private Integer rid;//角色id 外键

    public PpermissionRole(Integer rrid, Integer pid, Integer rid) {
        this.rrid = rrid;
        this.pid = pid;
        this.rid = rid;
    }

    public PpermissionRole() {
        super();
    }

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}