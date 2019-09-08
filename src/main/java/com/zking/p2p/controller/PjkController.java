package com.zking.p2p.controller;

import com.zking.p2p.model.Pjk;
import com.zking.p2p.service.IPjkService;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import net.sf.json.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pjk")
public class PjkController {
    @Autowired
    public IPjkService pjkService;


    @RequestMapping("/add")
    @ResponseBody
    public int add(Pjk pjk){
        return pjkService.addPjk(pjk);
    }

    @RequestMapping("/edit")
    public void edit(Pjk pjk){
        System.out.println(pjk);
        pjkService.exit(pjk);
    }

    @RequestMapping("/delpjk")
    public String del(Pjk pjk){
        pjkService.delPjk(pjk);
            return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(Pjk pjk, PageBean pageBean){
        List<Pjk> pjks = pjkService.list(pjk,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjks);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        System.out.println(jsonData);
        return jsonData;
    }

    //查询所有利息，分页
    @RequestMapping("/listlx")
    @ResponseBody
    public JsonData listlx(Pjk pjk,PageBean pageBean){
        List<Pjk> pjkList = pjkService.listlx(pjk, pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjkList);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        System.out.println(jsonData);
        return jsonData;
    }

    //查询利息表和借款表金额=利息
    @RequestMapping("/jklx")
    @ResponseBody
    public JsonData listjklx(Pjk pjk,PageBean pageBean){
        List<Pjk> pjklx = pjkService.listjklx(pjk,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjklx);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        System.out.println(jsonData);
        return jsonData;
    }
    //逾期金额
    @RequestMapping("/yqlx")
    @ResponseBody
    public JsonData listyqlx(Pjk pjk,PageBean pageBean){
        List<Pjk> pjkyq = pjkService.listyq(pjk ,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjkyq);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        System.out.println(jsonData);
        return jsonData;
    }


    //从哪个平台借的款
    @RequestMapping("/jkpt")
    @ResponseBody
    public JsonData listjkpt(Pjk pjk,PageBean pageBean){
        List<Pjk> pjkpt = pjkService.listplatform(pjk,pageBean);
        JsonData jsonData = new JsonData();
        jsonData.setResult(pjkpt);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        System.out.println(jsonData);
        return jsonData;
    }




//    @ResponseBody
//    @RequestMapping("load")
//    public JsonData load(Integer jid){
//        pjkService.load();
//        JsonData jsonData = new JsonData();
//        jsonData.setResult(jid);
//        return jsonData;
//    }




}
