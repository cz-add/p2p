package com.zking.p2p.mapper;

import com.zking.p2p.model.PpermissionRole;
import org.springframework.stereotype.Repository;

@Repository
public interface PpermissionRoleMapper {
    int deleteByPrimaryKey(Integer rrid);

    int insert(PpermissionRole record);

    int insertSelective(PpermissionRole record);

    PpermissionRole selectByPrimaryKey(Integer rrid);

    int updateByPrimaryKeySelective(PpermissionRole record);

    int updateByPrimaryKey(PpermissionRole record);
}