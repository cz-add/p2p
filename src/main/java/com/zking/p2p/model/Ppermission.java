package com.zking.p2p.model;

import lombok.ToString;

/**
 * 权限表
 */
@ToString
public class Ppermission {
    private Integer pid;//主键id

    private String pname;//名称

    private String permission;//权限

    private Integer level;//权限级别

    private Integer ppid;//父id

    private Integer available;//可用

    public Ppermission(Integer pid, String pname, String permission, Integer level, Integer ppid, Integer available) {
        this.pid = pid;
        this.pname = pname;
        this.permission = permission;
        this.level = level;
        this.ppid = ppid;
        this.available = available;
    }

    public Ppermission() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}