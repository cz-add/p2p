package com.zking.p2p.model;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 借款表
 */
@ToString
public class Pjk {
    public Pjk(Integer jid, @NotBlank(message = "借款姓名必须", groups = {ValidateGroups.Add.class, ValidateGroups.Edit.class}) String jname, String uid, Double jje, Double brate, Date jtime, Integer jqx, Integer hkfs,  List<Pfk> pfkList, List<Plx> plxList,List<Plx> yqlist) {
        this.jid = jid;
        this.jname = jname;
        this.uid = uid;
        this.jje = jje;
        this.brate = brate;
        this.jtime = jtime;
        this.jqx = jqx;
        this.hkfs = hkfs;
        this.pfkList = pfkList;
        this.plxList = plxList;
        this.yqlist = yqlist;
    }

    //借款的验证
    public static interface ValidateGroups{
        //接口中类部类
        public static interface Add{

        }
        public static interface Edit{

        }
    }

    private Integer jid;//主键id
    @NotBlank(message = "借款姓名必须",groups = {Pjk.ValidateGroups.Add.class,Pjk.ValidateGroups.Edit.class})
    private String jname;//借款人

    private String uid;//用户外键

    private Double jje;//金额

    private Double brate;//利率

    private Date jtime;//借款时间

    private Integer jqx;//借款时间

    private Integer hkfs;//还款方式

//    private Double lx;//借款金额和利息计算出来的伪列=lx

//    private Pfk platform;//放款表中的平台信息
    private List<Pfk> pfkList = new ArrayList<Pfk>();

    private List<Plx> plxList = new ArrayList<Plx>();

    private List<Plx> yqlist = new ArrayList<Plx>();

    public List<Plx> getYqlist() {
        return yqlist;
    }

    public void setYqlist(List<Plx> yqlist) {
        this.yqlist = yqlist;
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

    public Double getBrate() {
        return brate;
    }

    public void setBrate(Double brate) {
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



    public List<Pfk> getPfkList() {
        return pfkList;
    }

    public void setPfkList(List<Pfk> pfkList) {
        this.pfkList = pfkList;
    }
    public List<Plx> getPlxList() {
        return plxList;
    }

    public void setPlxList(List<Plx> plxList) {
        this.plxList = plxList;
    }



}