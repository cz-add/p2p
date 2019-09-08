package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.PcsMapper;
import com.zking.p2p.model.Pcs;
import com.zking.p2p.service.IPcsService;
import com.zking.p2p.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcsServiceImpl implements IPcsService {

    @Autowired
    private PcsMapper pcsMapper;

    //完成的催款的删除
    @Override
    public int delPcs(Pcs pcs) {
        return pcsMapper.deleteByPrimaryKey(pcs.getCid());
    }
    //修改催款状态
    @Override
    public int editPcs(Pcs pcs) {
        return pcsMapper.updateByPrimaryKey(pcs);
    }
    //查询催款明细
    @Override
    public List<Pcs> list(Pcs pcs, PageBean pageBean) {
        List<Pcs> pcsList = pcsMapper.list(pcs,pageBean);
        return pcsList;
    }
}
