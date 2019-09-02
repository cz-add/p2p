package com.zking.p2p.service;

import com.zking.p2p.model.Pmenu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IpmenuService {
    @Transactional(readOnly = true)
   void selectPmenuById(Pmenu record);
    @Transactional(readOnly = true)
    List<Pmenu> selectPmenuByAll(Pmenu record);
}
