package com.zking.p2p.controller;

import com.aliyun.oss.OSSClient;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.shiro.PasswordHelper;
import com.zking.p2p.util.AliyunOSSClientUtil;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IuserService iuserService;




    @RequestMapping("/login")
    @ResponseBody
    public JsonData login( Users user) {
        Users u = iuserService.doLogin(user);
        String message=null;

        if (null == u || !PasswordHelper.checkCredentials(user.getPassword(), u.getSalt(), u.getPassword())) {

            message = "帐号或密码错误";
        } else if (new Integer(1).equals(u.getLocked())) {
            message = "帐号已锁定，请与管理员联系";
        }
        JsonData jsonData=new JsonData();
        jsonData.setResult(u);
        jsonData.setMessage(message);
        return  jsonData;
    }

    @RequestMapping("/zc")
    @ResponseBody
    public JsonData zc( Users user) {
        int i = iuserService.doRegister(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(i);
        return  jsonData;
    }

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list( Users user,PageBean pageBean) {
        List<Users> list = iuserService.list(user,pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setResult(list);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        System.out.println(jsonData);

        return  jsonData;
    }
    @RequestMapping("/upjy")
    @ResponseBody
    public JsonData upjy( Users user) {
        int upjy = iuserService.upjy(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(upjy);

        System.out.println(jsonData);

        return  jsonData;
    }



}
