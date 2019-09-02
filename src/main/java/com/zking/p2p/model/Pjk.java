package com.zking.p2p.model;

import lombok.ToString;

import java.util.Date;

/**
 * 借款表
 */
@ToString
public class Pjk {
    private Integer jid;//主键id

    private String jname;//借款人

    private String uid;//用户外键

    private Double jje;//金额

    private String brate;//利率

    private Date jtime;//借款时间

    private Integer jqx;//借款时间

    private Integer hkfs;//还款方式

    public Pjk(Integer jid, String jname, String uid, Double jje, String brate, Date jtime, Integer jqx, Integer hkfs) {
        this.jid = jid;
        this.jname = jname;
        this.uid = uid;
        this.jje = jje;
        this.brate = brate;
        this.jtime = jtime;
        this.jqx = jqx;
        this.hkfs = hkfs;
    }

    public Pjk() {
        super();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getJje() {
        return jje;
    }

    public void setJje(Double jje) {
        this.jje = jje;
    }

    public String getBrate() {
        return brate;
    }

    public void setBrate(String brate) {
        this.brate = brate;
    }

    public Date getJtime() {
        return jtime;
    }

    public void setJtime(Date jtime) {
        this.jtime = jtime;
    }

    public Integer getJqx() {
        return jqx;
    }

    public void setJqx(Integer jqx) {
        this.jqx = jqx;
    }

    public Integer getHkfs() {
        return hkfs;
    }

    public void setHkfs(Integer hkfs) {
        this.hkfs = hkfs;
    }
}