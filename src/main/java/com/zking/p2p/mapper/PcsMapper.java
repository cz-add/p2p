package com.zking.p2p.mapper;

import com.zking.p2p.model.Pcs;
import com.zking.p2p.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcsMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Pcs record);

    int insertSelective(Pcs record);

    Pcs selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Pcs record);

    int updateByPrimaryKey(Pcs record);

    List<Pcs> list(Pcs pcs, PageBean pageBean);//查询所有，page
}