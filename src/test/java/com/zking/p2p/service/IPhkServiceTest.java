package com.zking.p2p.service;

import com.zking.p2p.mapper.PhkMapper;
import com.zking.p2p.model.Phk;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IPhkServiceTest extends BaseTestCase{

    @Autowired
    private IPhkService phkService;

    private Phk phk;

    @Override
    public void setUp()  {
        phk= new Phk();
    }
    @Before
    public void before(){
        phk = new Phk();
    }
    @Test
    public void addPhk() throws Exception{

    }

    @Test
    public void exit() throws  Exception{
        phk.setHid(1);
        phk.setSyje(Double.valueOf(50000));
        phk.setHkje(Double.valueOf(2223));
        phk.setBstatue(1);
        phkService.edit(phk);
    }


    @Test
    public void List() throws Exception{
        List<Phk> pjkList = phkService.list(phk,pageBean);
        for(Phk p:pjkList){
            System.out.println(p);
        }
        System.out.println(pageBean);
    }



}
