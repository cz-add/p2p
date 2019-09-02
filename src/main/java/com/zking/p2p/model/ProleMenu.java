package com.zking.p2p.model;

import lombok.ToString;

/**
 * 角色菜单
 */
@ToString
public class ProleMenu {
    private Integer rmid;//主键id

    private Integer rid;//角色id 外键

    private Integer mid;//菜单id 外键

    public ProleMenu(Integer rmid, Integer rid, Integer mid) {
        this.rmid = rmid;
        this.rid = rid;
        this.mid = mid;
    }

    public ProleMenu() {
        super();
    }

    public Integer getRmid() {
        return rmid;
    }

    public void setRmid(Integer rmid) {
        this.rmid = rmid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}