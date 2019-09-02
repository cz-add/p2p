package com.zking.p2p.model;

import lombok.ToString;

/**
 * 审核表
 */
@ToString
public class Paudit {
    private Integer aid;//主键id

    private String aname;//审核人

    private Integer jid;//外键 借款Id 说明：通过借款表来获取借款信息

    private Integer atype;//审核状态(0.未审核1.审核中2.审核通过3.审核失败）

    private String remark;// 审核备注

    public Paudit(Integer aid, String aname, Integer jid, Integer atype, String remark) {
        this.aid = aid;
        this.aname = aname;
        this.jid = jid;
        this.atype = atype;
        this.remark = remark;
    }

    public Paudit() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getAtype() {
        return atype;
    }

    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}