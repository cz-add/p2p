package com.zking.p2p.controller;

import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.util.JsonData;
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

@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
private IuserService iuserService;
    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        Users user = new Users();
        model.addAttribute("user", user);
    }

    @RequestMapping("/index.shtml")
    public String toLogin(Model model) {
        System.out.println("toLogin");
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JsonData login(Model model, Users user) {
        String s = iuserService.doLogin(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(s);
        return  jsonData;
    }

    @RequestMapping("/zc")
    @ResponseBody
    public JsonData zc(Model model, Users user) {
        int i = iuserService.doRegister(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(i);
        return  jsonData;
    }


}
