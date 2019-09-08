package com.zking.p2p.service;

import com.zking.p2p.model.Phk;
import com.zking.p2p.model.Pjk;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.impl.PjkServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class IPjkServiceTest extends BaseTestCase {

    @Autowired
    private IPjkService PjkService;
//    private IuserService iuserService;
    private Pjk pjk;
//    private users Users;

    @Override
    public void setUp()  {
        pjk=new Pjk();
    }
    @Before
    public void before(){
        pjk = new Pjk();
    }

    @Test
    public void addPjk() throws Exception {
//        Date t = new Date();
//        pjk.setJid(2);
        pjk.setJname("陈冠希1");
        pjk.setUid("2");
        pjk.setJje(Double.valueOf("12221"));
        pjk.setBrate(1d);
        pjk.setJqx(60);
        pjk.setHkfs(2);
        PjkService.addPjk(pjk);
//        int rouCount = PjkService.addPjk(pjk);
//        System.out.println(pjk.getJid());
//        System.out.println(rouCount);
    }

    @Test
    public void delPjk()throws Exception{
        pjk.setJid(5);
        PjkService.delPjk(pjk);
    }

    @Test
    public void exit() throws  Exception{
        pjk.setJid(8);
        pjk.setJname("周星哈哈");
        pjk.setUid("2");
        pjk.setJje(Double.valueOf("222222222222"));
        pjk.setBrate(2d);
        pjk.setJqx(60);
        pjk.setHkfs(1);
        PjkService.exit(pjk);
    }



    @Test
    public void list() throws  Exception{
//        pageBean.setRows(1);
        List<Pjk> pjkList = PjkService.list(pjk,pageBean);
            for(Pjk p:pjkList){
            System.out.println(p);
        }
        System.out.println(pageBean);
    }


    @Test
    public void listlx()throws Exception{
        List<Pjk> pjks = PjkService.listlx(pjk,pageBean);
        for (Pjk p:pjks){
            System.out.println(p);
        }
        System.out.println(pageBean);
    }

//    @Test
//    public void load() throws  Exception{
//        pjk.setJid(8);
//        Pjk p = PjkService.load(pjk);
//        System.out.println(p);
//    }5

    @Test
    public void listPl()throws Exception{
        pjk.setJid(4);
        List<Pjk> pjkList = PjkService.listplatform(pjk,pageBean);
        for (Pjk p:pjkList){
            System.out.println(p);
        }
    }

    @Test
    public void listl()throws Exception{
//        pjk.setJid(4);
        List<Pjk> pjklx = PjkService.listjklx(pjk,pageBean);
        for (Pjk p :pjklx){
            System.out.println(p);
        }
    }
    @Test
    public void listyq()throws Exception{
//        pjk.setJid(4);
        List<Pjk> pjkyq = PjkService.listyq(pjk,pageBean);
        for (Pjk p :pjkyq){
            System.out.println(p);
        }
    }


}