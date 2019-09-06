package com.zking.p2p.controller;

import com.zking.p2p.model.BasDict;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IbasDictService;

import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/safety")
public class BasDictController {
    @Autowired
    private IbasDictService ibasDictService;

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(BasDict basDict, PageBean pageBean) {
        List<BasDict> list = ibasDictService.list(basDict,pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setResult(list);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        System.out.println(jsonData);

        return  jsonData;
    }

    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(BasDict basDict) {
        int s = ibasDictService.insert(basDict);
        JsonData jsonData=new JsonData();
            jsonData.setMessage("增加成功");
        return  jsonData;
    }
    @RequestMapping("/del")
    @ResponseBody
    public JsonData del(BasDict basDict) {
        int s = ibasDictService.del(basDict);
        JsonData jsonData=new JsonData();

        jsonData.setMessage("删除成功");

        return  jsonData;
    }
    @RequestMapping("/update")
    @ResponseBody
    public JsonData update(BasDict basDict) {
        int s = ibasDictService.update(basDict);
        JsonData jsonData=new JsonData();

        jsonData.setMessage("修改成功");

        return  jsonData;
    }
}
