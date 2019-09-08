package com.zking.p2p.model;

import lombok.ToString;

@ToString
public class Plx {
    private Integer lid;

    private Double jklx;

    private Double yqlx;

    private Integer jid;

    public Double getLx() {
        return lx;
    }

    public void setLx(Double lx) {
        this.lx = lx;
    }

    private Double lx;//借款金额和利息计算出来的伪列=lx

    public Double getYq() {
        return yq;
    }

    public void setYq(Double yq) {
        this.yq = yq;
    }

    private Double yq;//利息逾期的金额；伪列




    public Plx() {
        super();
    }

    public Plx(Integer lid, Double jklx, Double yqlx, Integer jid, Double lx,Double yq) {
        this.lid = lid;
        this.jklx = jklx;
        this.yqlx = yqlx;
        this.jid = jid;
        this.lx = lx;
        this.yq = yq;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Double getJklx() {
        return jklx;
    }

    public void setJklx(Double jklx) {
        this.jklx = jklx;
    }

    public Double getYqlx() {
        return yqlx;
    }

    public void setYqlx(Double yqlx) {
        this.yqlx = yqlx;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}