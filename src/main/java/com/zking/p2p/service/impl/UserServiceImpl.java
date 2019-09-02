package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.UsersMapper;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.shiro.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("userService")
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
    public String doLogin(Users user) {
        String message = null;
        Users u = usersMapper.selectByUsername(user.getUname());
        if (null == u || !PasswordHelper.checkCredentials(user.getPassword(), u.getSalt(), u.getPassword())) {
            message = "帐号或密码错误";
        } else if (new Integer(1).equals(u.getLocked())) {
            message = "帐号已锁定，请与管理员联系";
        }
        return message;
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
