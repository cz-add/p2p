package com.zking.p2p.controller;

import com.zking.p2p.model.Phk;
import com.zking.p2p.service.IPhkService;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/phk")
public class PhkController {
    @Autowired
    private IPhkService phkService;


    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(Phk phk, PageBean pageBean){
        List<Phk> pjks = phkService.list(phk,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjks);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        System.out.println(jsonData);
        return jsonData;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public void edit(Phk phk){
        phkService.edit(phk);
    }
}
