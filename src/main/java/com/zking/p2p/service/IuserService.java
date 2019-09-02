package com.zking.p2p.service;

import com.zking.p2p.model.Users;

import java.util.Set;
public interface IuserService {

    int doRegister(Users user);//用户注册

    String doLogin(Users user);//用户登陆

    int updatePassword(Users user);//所有人都可以修改自己的密码

    int doResetPassword(Users user);//管理员可以重置所有人的密码，密码默认值为888888

    //权限关键接口
    Users loadByUsername(Users user);//根据用户名查询用户
    Set<String> listPermissionsByUserName(Users user);//查询指定用户拥有的权限
    Set<String> listRolesByUserName(Users user);//查询指定用户拥有的角色
}
