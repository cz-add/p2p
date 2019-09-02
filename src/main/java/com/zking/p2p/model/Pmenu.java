package com.zking.p2p.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单表
 */
@ToString
public class Pmenu {
    private Integer mid;//主键Id

    private String mname;//菜单名字

    private Integer mtype;//菜单类型模块

    private Integer parentMid;//mid树节点

    private String url;//路径

    private Integer position;

    private String icon;//图标



    private List<Pmenu> pmenus=new ArrayList<Pmenu>();

    public Pmenu(Integer mid, String mname, Integer mtype, Integer parentMid, String url, Integer position, String icon, List<Pmenu> pmenus) {
        this.mid = mid;
        this.mname = mname;
        this.mtype = mtype;
        this.parentMid = parentMid;
        this.url = url;
        this.position = position;
        this.icon = icon;
        this.pmenus = pmenus;
    }

    public List<Pmenu> getPmenus() {
        return pmenus;
    }

    public void setPmenus(List<Pmenu> pmenus) {
        this.pmenus = pmenus;
    }
    public Pmenu() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getParentMid() {
        return parentMid;
    }

    public void setParentMid(Integer parentMid) {
        this.parentMid = parentMid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}