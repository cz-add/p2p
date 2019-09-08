package com.zking.p2p.mapper;

import com.zking.p2p.model.Phk;
import com.zking.p2p.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhkMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Phk record);

    int insertSelective(Phk record);

    Phk selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Phk record);

    int updateByPrimaryKey(Phk record);

    List<Phk> list(Phk phk, PageBean pageBean);


}