package com.zking.p2p.service;

import com.zking.p2p.model.Phk;
import com.zking.p2p.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPhkService{

    int delPhk(Phk phk);//删除:还款

    int edit(Phk phk);//修改：还款金额

    @Transactional(readOnly = true)//查询明细
    List<Phk> list(Phk phk, PageBean pageBean);
}
