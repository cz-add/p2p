package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.PhkMapper;
import com.zking.p2p.model.Phk;
import com.zking.p2p.service.IPhkService;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhkServiceImpl implements IPhkService{

    @Autowired
    private PhkMapper phkMapper;

    @Override
    public int delPhk(Phk phk) {
        return phkMapper.insert(phk);
    }

    @Override
    public int edit(Phk phk) {
        return phkMapper.updateByPrimaryKey(phk);
    }

    @Override
    public List<Phk> list(Phk phk, PageBean pageBean) {
        List<Phk> phkList = phkMapper.list(phk,pageBean);
            return phkList;
    }
}
