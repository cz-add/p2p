package com.zking.p2p.controller;

import com.zking.p2p.model.Pcs;
import com.zking.p2p.service.IPcsService;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/pcs")
public class PcsController {
    @Autowired
    private IPcsService iPcsService;


    @RequestMapping("/edit")
    @ResponseBody
    public void edit(Pcs pcs){
        iPcsService.editPcs(pcs);
    }


    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(Pcs pcs, PageBean pageBean){
        List<Pcs> pcsList = iPcsService.list(pcs,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pcsList);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        System.out.println(jsonData);
        return jsonData;
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(Pcs pcs){
        iPcsService.delPcs(pcs);

        return "index";
    }
}
