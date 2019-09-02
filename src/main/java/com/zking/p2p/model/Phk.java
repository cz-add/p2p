package com.zking.p2p.model;
/**
 * 还款表
 */

import lombok.ToString;

import java.util.Date;
@ToString
public class Phk {
    private Integer hid;//主键id

    private Integer uid;//用户id

    private Double syje;//剩余金额

    private Double hkje;//还款金额

    private Date htime;//还款时间

    private Integer bstatue;//状态（0.未还款;1,已还款;）

    public Phk(Integer hid, Integer uid, Double syje, Double hkje, Date htime, Integer bstatue) {
        this.hid = hid;
        this.uid = uid;
        this.syje = syje;
        this.hkje = hkje;
        this.htime = htime;
        this.bstatue = bstatue;
    }

    public Phk() {
        super();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getSyje() {
        return syje;
    }

    public void setSyje(Double syje) {
        this.syje = syje;
    }

    public Double getHkje() {
        return hkje;
    }

    public void setHkje(Double hkje) {
        this.hkje = hkje;
    }

    public Date getHtime() {
        return htime;
    }

    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Integer getBstatue() {
        return bstatue;
    }

    public void setBstatue(Integer bstatue) {
        this.bstatue = bstatue;
    }
}