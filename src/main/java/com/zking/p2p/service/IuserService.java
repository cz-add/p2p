package com.zking.p2p.service;

import com.zking.p2p.model.Users;
import com.zking.p2p.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
@Transactional
public interface IuserService {

    int doRegister(Users user);//用户注册

    Users doLogin(Users user);//用户登陆

    int updatePassword(Users user);//所有人都可以修改自己的密码

    int doResetPassword(Users user);//管理员可以重置所有人的密码，密码默认值为888888

    //权限关键接口
    Users loadByUsername(Users user);//根据用户名查询用户
    Set<String> listPermissionsByUserName(Users user);//查询指定用户拥有的权限
    Set<String> listRolesByUserName(Users user);//查询指定用户拥有的角色
    @Transactional(readOnly = true)
    List<Users> list(Users users, PageBean pageBean);//查询所有
    int upjy(Users users);//禁用用户

    Users u(String yzm);

}
