package com.zking.p2p.service;

import com.zking.p2p.model.Prole;
import com.zking.p2p.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IProleService {
    int insert(Prole record);
    List<Prole> list(Prole prole, PageBean pageBean);
    int del(Prole prole);
}
