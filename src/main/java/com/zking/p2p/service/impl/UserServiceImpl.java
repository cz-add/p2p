package com.zking.p2p.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.p2p.mapper.UsersMapper;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.shiro.PasswordHelper;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("iuserService")
public class UserServiceImpl implements IuserService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int doRegister(Users user) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(user.getPassword(), salt);

        user.setSalt(salt);
        user.setPassword(credentials);
        return usersMapper.insert(user);
    }

    @Override
    public Users loadByUsername(Users user) {
        return usersMapper.selectByUsername(user.getUname());
    }

    @Override
    public Users doLogin(Users user) {

        Users u = usersMapper.selectByUsername(user.getUname());

        return u;
    }

    @Override
    public Set<String> listPermissionsByUserName(Users user) {
        return new HashSet<String>(usersMapper.listPermissionsByUserName(user));
    }

    @Override
    public Set<String> listRolesByUserName(Users user) {
        return new HashSet<String>(usersMapper.listRolesByUserName(user));
    }

    @Override
    public List<Users> list(Users users, PageBean pageBean) {
        if(null!=pageBean&&pageBean.isPagination()){
           PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
       }
        List<Users> list = usersMapper.list(users);
        if(null!=pageBean&&pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return list;
    }

    @Override
    public int upjy(Users users) {
        return usersMapper.upjy(users);
    }

    @Override
    public Users u(String yzm) {
        return usersMapper.Yan(yzm);
    }

    @Override
    public int updatePassword(Users user) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(user.getPassword(), salt);


        Users u = new Users();
        u.setUname(user.getUname());
        u.setPassword(credentials);
        u.setSalt(salt);

        return usersMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public int doResetPassword(Users user) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(Users.DEFAULT_PASSWORD, salt);


        Users u = new Users();
        u.setUname(user.getUname());
        u.setPassword(credentials);
        u.setSalt(salt);

        return usersMapper.updateByPrimaryKeySelective(u);
    }


}
