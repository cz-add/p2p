package com.zking.p2p.controller;

import com.zking.p2p.model.Pmenu;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IpmenuService;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pmenu")
public class PmenuController {
@Autowired
private IpmenuService ipmenuService;
    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        Pmenu pmenu = new Pmenu();
        model.addAttribute("pmenu", pmenu);
    }



    @RequestMapping("/getTree")
    @ResponseBody
    public JsonData getTree(Model model, Pmenu pmenu) {
        List<Pmenu> pmenus = ipmenuService.selectPmenuByAll(pmenu);
        JsonData jsonData=new JsonData();
        jsonData.setResult(pmenus);
        return  jsonData;
    }




}
