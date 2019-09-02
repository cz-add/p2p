package com.zking.p2p.mapper;

import com.zking.p2p.model.Plx;
import org.springframework.stereotype.Repository;

@Repository
public interface PlxMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Plx record);

    int insertSelective(Plx record);

    Plx selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Plx record);

    int updateByPrimaryKey(Plx record);
}