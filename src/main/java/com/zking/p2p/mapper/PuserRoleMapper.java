package com.zking.p2p.mapper;

import com.zking.p2p.model.PuserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface PuserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(PuserRole record);

    int insertSelective(PuserRole record);

    PuserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(PuserRole record);

    int updateByPrimaryKey(PuserRole record);
}