package com.zking.p2p.mapper;

import com.zking.p2p.model.Prz;
import org.springframework.stereotype.Repository;

@Repository
public interface PrzMapper {
    int deleteByPrimaryKey(Integer rz);

    int insert(Prz record);

    int insertSelective(Prz record);

    Prz selectByPrimaryKey(Integer rz);

    int updateByPrimaryKeySelective(Prz record);

    int updateByPrimaryKey(Prz record);
}