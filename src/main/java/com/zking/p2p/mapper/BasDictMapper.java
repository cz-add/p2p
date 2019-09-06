package com.zking.p2p.mapper;

import com.zking.p2p.model.BasDict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasDictMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    BasDict selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);

    List<BasDict> list(BasDict record);
    int del(BasDict record);
    int update(BasDict basDict);
}