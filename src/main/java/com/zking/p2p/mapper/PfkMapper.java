package com.zking.p2p.mapper;

import com.zking.p2p.model.Pfk;
import org.springframework.stereotype.Repository;

@Repository
public interface PfkMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Pfk record);

    int insertSelective(Pfk record);

    Pfk selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Pfk record);

    int updateByPrimaryKey(Pfk record);
}