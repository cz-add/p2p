package com.zking.p2p.service;

import com.zking.p2p.model.Pjk;
import com.zking.p2p.model.Users;
import com.zking.p2p.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IPjkService {

    int addPjk(Pjk pjk);//增加：借款

    int delPjk(Pjk pjk);//删除借款

    int exit(Pjk pjk);//修改

    @Transactional(readOnly = true)//查询所有带分页
    List<Pjk> list(Pjk pjk, PageBean pageBean);

//    @Transactional(readOnly = true)
//    Pjk load(Pjk pjk);//查询单个

    @Transactional(readOnly = true)//查询利息
    List<Pjk> listlx(Pjk pjk,PageBean pageBean);

    @Transactional(readOnly = true)//查询放款表中的platform平台信息
    List<Pjk> listplatform(Pjk pjk,PageBean pageBean);

    @Transactional(readOnly = true)//查询出利息表中的利息（借款表的金额*利息表的利息=利息）
    List<Pjk> listjklx(Pjk pjk,PageBean pageBean);

    @Transactional(readOnly = true)//查询逾期
    List<Pjk> listyq(Pjk pjk,PageBean pageBean);

}
