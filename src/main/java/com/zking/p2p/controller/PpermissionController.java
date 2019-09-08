package com.zking.p2p.controller;

import com.zking.p2p.model.BasDict;
import com.zking.p2p.model.Ppermission;
import com.zking.p2p.service.IbasDictService;
import com.zking.p2p.service.IppermissionService;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ppermisson")
public class PpermissionController {
    @Autowired
    private IppermissionService ippermissionService;



    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(Ppermission ppermission) {
        int s = ippermissionService.insert(ppermission);
        JsonData jsonData=new JsonData();
            jsonData.setMessage("增加成功");
        return  jsonData;
    }
    @RequestMapping("/del")
    @ResponseBody
    public JsonData del(BasDict basDict) {
//        int s = ippermissionService.del(basDict);
        JsonData jsonData=new JsonData();

        jsonData.setMessage("删除成功");

        return  jsonData;
    }
    @RequestMapping("/update")
    @ResponseBody
    public JsonData update(BasDict basDict) {
//        int s = ippermissionService.update(basDict);
        JsonData jsonData=new JsonData();

        jsonData.setMessage("修改成功");

        return  jsonData;
    }
}
