package com.zking.p2p.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.p2p.mapper.ProleMapper;
import com.zking.p2p.model.BasDict;
import com.zking.p2p.model.Prole;
import com.zking.p2p.service.IProleService;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProleServiceImpl implements IProleService {
    @Autowired
    private ProleMapper proleMapper;
    @Override
    public int insert(Prole record) {
        return proleMapper.insert(record);
    }

    @Override
    public List<Prole> list(Prole prole, PageBean pageBean) {
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        final List<Prole> list = proleMapper.list(prole);
        if(null!=pageBean&&pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return list;
    }

    @Override
    public int del(Prole prole) {
      return proleMapper.del(prole);
    }
}
