package com.zking.p2p.service;

import com.zking.p2p.model.Pcs;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IPcsServiceTest extends BaseTestCase{
    @Autowired
    private IPcsService IPcsService;

    private Pcs pcs;

    @Override
    public void setUp()  {
        pcs= new Pcs();
    }
    @Before
    public void before(){
        pcs = new Pcs();
    }

    @Test
    public void del()throws  Exception{
        pcs.setCid(5);
        IPcsService.delPcs(pcs);
    }


    @Test
    public void edit() throws Exception{
        pcs.setCid(4);
        pcs.setJid(1);
        pcs.setCtype(1);
        pcs.setCname("竹联帮");

        IPcsService.editPcs(pcs);
    }


    @Test
    public void List()throws Exception{
        List<Pcs> pcsList = IPcsService.list(pcs,pageBean);
        for (Pcs p:pcsList){
            System.out.println(p);
        }
        System.out.println(pageBean);
    }


}
