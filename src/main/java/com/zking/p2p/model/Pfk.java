package com.zking.p2p.model;

import lombok.ToString;

/**
 * 放款表
 */
@ToString
public class Pfk {
    private Integer fid;//主键id

    private Integer jid;//借款id

    private String platform;//平台名称

    public Pfk(Integer fid, Integer jid, String platform) {
        this.fid = fid;
        this.jid = jid;
        this.platform = platform;
    }

    public Pfk() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}