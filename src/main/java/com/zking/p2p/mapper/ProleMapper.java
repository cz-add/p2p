package com.zking.p2p.mapper;

import com.zking.p2p.model.Prole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Prole record);

    int insertSelective(Prole record);

    Prole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Prole record);

    int updateByPrimaryKey(Prole record);

    List<Prole> list(Prole prole);
    int del(Prole prole);
}