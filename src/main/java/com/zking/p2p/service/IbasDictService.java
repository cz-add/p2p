package com.zking.p2p.service;

import com.zking.p2p.model.BasDict;
import com.zking.p2p.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IbasDictService {
    //增加
    int insert(BasDict record);
    //查询所有
    @Transactional(readOnly = true)
    List<BasDict> list(BasDict record, PageBean pageBean);
    //删除
    int del(BasDict dictId);

    /**
     * @param basDict
     * @return
     */
    int update(BasDict basDict);
}
