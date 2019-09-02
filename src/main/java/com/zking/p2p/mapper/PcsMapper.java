package com.zking.p2p.mapper;

import com.zking.p2p.model.Pcs;
import org.springframework.stereotype.Repository;

@Repository
public interface PcsMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Pcs record);

    int insertSelective(Pcs record);

    Pcs selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Pcs record);

    int updateByPrimaryKey(Pcs record);
}