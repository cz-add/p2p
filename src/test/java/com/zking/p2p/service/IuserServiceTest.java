package com.zking.p2p.service;

import com.zking.p2p.model.Users;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IuserServiceTest extends BaseTestCase {
    @Autowired
    private IuserService iuserService;
    private Users users;

    @Override
    public void setUp()  {
        users=new Users();
    }

    @Test
    public void doRegister() throws Exception {
        users.setUname("ls");
        users.setPassword("888888");
        int rowCount = iuserService.doRegister(users);
        System.out.println(rowCount);
    }

    @Test
    public void doLogin() throws Exception {
    }

    @Test
    public void updatePassword() throws Exception {
    }

    @Test
    public void doResetPassword() throws Exception {
    }

    @Test
    public void loadByUsername() throws Exception {
    }

    @Test
    public void listPermissionsByUserName() throws Exception {
    }

    @Test
    public void listRolesByUserName() throws Exception {
    }

}