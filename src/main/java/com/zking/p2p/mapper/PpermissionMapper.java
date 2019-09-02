package com.zking.p2p.mapper;

import com.zking.p2p.model.Ppermission;
import org.springframework.stereotype.Repository;

@Repository
public interface PpermissionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Ppermission record);

    int insertSelective(Ppermission record);

    Ppermission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Ppermission record);

    int updateByPrimaryKey(Ppermission record);
}