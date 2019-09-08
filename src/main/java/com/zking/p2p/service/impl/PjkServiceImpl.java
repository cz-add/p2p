package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.PjkMapper;
import com.zking.p2p.model.Pjk;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IPjkService;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PjkServiceImpl implements IPjkService {

    @Autowired
    private PjkMapper pjkMapper;

    //借款
    @Override
    public int addPjk(Pjk pjk) {
        return pjkMapper.insert(pjk);
    }

    @Override
    public int delPjk(Pjk pjk) {
        return pjkMapper.deleteByPrimaryKey(pjk.getJid());
    }

    @Override
    public int exit(Pjk pjk) {
        return pjkMapper.updateByPrimaryKey(pjk);
    }

    @Override
    public List<Pjk> list(Pjk pjk, PageBean pageBean) {
        List<Pjk> pjkList = pjkMapper.list(pjk);
        return pjkList;
    }

    @Override
    public List<Pjk> listlx(Pjk pjk, PageBean pageBean) {
        List<Pjk> pjklx = pjkMapper.listlx(pjk);
        return pjklx;
    }

    //查询放款表中的平台信息
    @Override
    public List<Pjk> listplatform(Pjk pjk, PageBean pageBean) {
        List<Pjk> listplatform = pjkMapper.listplatform(pjk);
        return listplatform;
    }
    //利息
    @Override
    public List<Pjk> listjklx(Pjk pjk, PageBean pageBean) {
        List<Pjk> listjkl = pjkMapper.listjklx(pjk);
        return listjkl;
    }
    //逾期
    @Override
    public List<Pjk> listyq(Pjk pjk, PageBean pageBean) {
        List<Pjk> listyqlx = pjkMapper.listyqlx(pjk);
        return listyqlx;
    }


//    @Override
//    public Pjk load(Pjk pjk) {
//        return pjkMapper.selectByPrimaryKey(pjk.getJid());
//    }
}
