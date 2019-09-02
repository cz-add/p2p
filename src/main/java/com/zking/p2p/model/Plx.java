package com.zking.p2p.model;

import lombok.ToString;

/**
 * 利息表
 */
@ToString
public class Plx {
    private Integer lid;//主键id

    private Integer jklx;//借款利息

    private Integer yqlx;//逾期利息

    public Plx(Integer lid, Integer jklx, Integer yqlx) {
        this.lid = lid;
        this.jklx = jklx;
        this.yqlx = yqlx;
    }

    public Plx() {
        super();
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getJklx() {
        return jklx;
    }

    public void setJklx(Integer jklx) {
        this.jklx = jklx;
    }

    public Integer getYqlx() {
        return yqlx;
    }

    public void setYqlx(Integer yqlx) {
        this.yqlx = yqlx;
    }
}