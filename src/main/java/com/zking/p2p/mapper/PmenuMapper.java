package com.zking.p2p.mapper;

import com.zking.p2p.model.Pmenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmenuMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Pmenu record);

    int insertSelective(Pmenu record);

    Pmenu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Pmenu record);

    int updateByPrimaryKey(Pmenu record);

    List<Pmenu> selectPmenuById(Pmenu record);
    List<Pmenu> selectPmenuByAll(Pmenu record);
}