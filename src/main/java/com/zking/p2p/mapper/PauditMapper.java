package com.zking.p2p.mapper;

import com.zking.p2p.model.Paudit;
import org.springframework.stereotype.Repository;

@Repository
public interface PauditMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Paudit record);

    int insertSelective(Paudit record);

    Paudit selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Paudit record);

    int updateByPrimaryKey(Paudit record);
}