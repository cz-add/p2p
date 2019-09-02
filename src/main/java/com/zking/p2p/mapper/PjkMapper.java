package com.zking.p2p.mapper;

import com.zking.p2p.model.Pjk;
import org.springframework.stereotype.Repository;

@Repository
public interface PjkMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(Pjk record);

    int insertSelective(Pjk record);

    Pjk selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Pjk record);

    int updateByPrimaryKey(Pjk record);
}