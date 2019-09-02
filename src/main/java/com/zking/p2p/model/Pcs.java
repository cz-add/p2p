package com.zking.p2p.model;
/**
 * 催收表
 */

import lombok.ToString;

import java.util.Date;
@ToString
public class Pcs {
    private Integer cid;//主键id

    private Integer jid;//借款人id

    private String cname;//催收人

    private Integer ctype;//催收方式(0.短信 1.电话 2.上门）

    private Date ctiem;//处理时间

    public Pcs(Integer cid, Integer jid, String cname, Integer ctype, Date ctiem) {
        this.cid = cid;
        this.jid = jid;
        this.cname = cname;
        this.ctype = ctype;
        this.ctiem = ctiem;
    }

    public Pcs() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public Date getCtiem() {
        return ctiem;
    }

    public void setCtiem(Date ctiem) {
        this.ctiem = ctiem;
    }
}