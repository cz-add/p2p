package com.zking.p2p.service;

import com.zking.p2p.model.Pcs;
import com.zking.p2p.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPcsService {
    int delPcs(Pcs pcs);//已经不用催款的

    int editPcs(Pcs pcs);//修改催款方式

    @Transactional(readOnly = true)//查询所有,分页
    List<Pcs> list(Pcs pcs, PageBean pageBean);

}
