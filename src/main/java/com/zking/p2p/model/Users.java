package com.zking.p2p.model;

import lombok.ToString;

import java.util.Date;

/**
 * 用户表
 */
@ToString
public class Users {
    public static final String DEFAULT_PASSWORD = "888888";

    private Integer uid;//用户ID

    private String uname;//用户名

    private String realname;//用户真实姓名

    private String email;//邮箱

    private String address;//地址

    private String tel;//手机号

    private Date time;//注册时间

    private String password;//密码

    private String sfz;//身份证

    private String tx;//头像


    private String salt;//盐

    private Integer locked;//状态

    public Users(Integer uid, String uname, String realname, String email, String address, String tel, Date time, String password, String sfz, String tx, String salt, Integer locked) {
        this.uid = uid;
        this.uname = uname;
        this.realname = realname;
        this.email = email;
        this.address = address;
        this.tel = tel;
        this.time = time;
        this.password = password;
        this.sfz = sfz;
        this.tx = tx;
        this.salt = salt;
        this.locked = locked;
    }

    public Users() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}