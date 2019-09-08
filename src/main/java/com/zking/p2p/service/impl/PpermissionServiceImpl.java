package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.PpermissionMapper;
import com.zking.p2p.mapper.PpermissionRoleMapper;
import com.zking.p2p.model.Ppermission;
import com.zking.p2p.service.IppermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PpermissionServiceImpl implements IppermissionService {
    @Autowired
    private PpermissionMapper ppermissionMapper;
    @Override
    public int insert(Ppermission record) {
        return ppermissionMapper.insert(record);
    }
}
