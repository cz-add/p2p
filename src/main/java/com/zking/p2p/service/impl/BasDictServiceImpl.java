package com.zking.p2p.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.p2p.mapper.BasDictMapper;
import com.zking.p2p.model.BasDict;
import com.zking.p2p.service.IbasDictService;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasDictServiceImpl implements IbasDictService {
   @Autowired
   private BasDictMapper basDictMapper;
    @Override
    public int insert(BasDict record) {
        return basDictMapper.insert(record);
    }

    @Override
    public List<BasDict> list(BasDict record,PageBean pageBean) {
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        final List<BasDict> list = basDictMapper.list(record);
        if(null!=pageBean&&pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return list;
    }

    @Override
    public int del(BasDict dictId) {
        return basDictMapper.del(dictId);
    }

    @Override
    public int update(BasDict basDict) {
        return basDictMapper.update(basDict);
    }
}
