package com.zking.p2p.controller;

import com.zking.p2p.model.Prole;
import com.zking.p2p.service.IProleService;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/prole")
public class ProleController {
    @Autowired
    private IProleService iProleService;
    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(Prole prole) {
        int i = iProleService.insert(prole);
        JsonData jsonData=new JsonData();
        jsonData.setMessage("增加成功");
        return jsonData;
    }
    @RequestMapping("/del")
    @ResponseBody
    public JsonData del(Prole prole) {
        int i = iProleService.del(prole);
        JsonData jsonData=new JsonData();
        jsonData.setMessage("删除成功");
        return jsonData;
    }
    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(Prole prole, PageBean pageBean) {
        List<Prole> list = iProleService.list(prole, pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setResult(list);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        return jsonData;
    }
}
