package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.PmenuMapper;
import com.zking.p2p.model.Pmenu;
import com.zking.p2p.service.IpmenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PmenuServiceImpl implements IpmenuService {
    @Autowired
    private PmenuMapper pmenuMapper;
    @Override
    public void selectPmenuById(Pmenu record) {
       record.setPmenus(pmenuMapper.selectPmenuById(record));
    }
    @Override
    public List<Pmenu> selectPmenuByAll(Pmenu record) {
        List<Pmenu> pmenus = pmenuMapper.selectPmenuByAll(record);
        for (Pmenu p:pmenus){
            this.selectPmenuById(p);
        }
        return pmenus;
    }
}
