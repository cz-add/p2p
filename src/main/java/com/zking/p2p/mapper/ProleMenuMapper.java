package com.zking.p2p.mapper;

import com.zking.p2p.model.ProleMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface ProleMenuMapper {
    int deleteByPrimaryKey(Integer rmid);

    int insert(ProleMenu record);

    int insertSelective(ProleMenu record);

    ProleMenu selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(ProleMenu record);

    int updateByPrimaryKey(ProleMenu record);
}