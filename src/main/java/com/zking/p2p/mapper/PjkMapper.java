package com.zking.p2p.mapper;

import com.zking.p2p.model.Pjk;
import com.zking.p2p.model.Plx;
import com.zking.p2p.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PjkMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(Pjk record);

    int insertSelective(Pjk record);

    Pjk selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Pjk record);

    int updateByPrimaryKey(Pjk record);

    List<Pjk> list(Pjk pjk);

    List<Pjk> listlx(Pjk pjk);

    List<Pjk> listplatform(Pjk pjk);//放款平台信息

    List<Pjk> listjklx(Pjk pjk);//借款表中*利息表=利息

    List<Pjk> listyqlx(Pjk pjk);//逾期


}