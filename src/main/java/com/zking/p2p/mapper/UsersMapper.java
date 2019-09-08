package com.zking.p2p.mapper;

import com.zking.p2p.model.Users;
import com.zking.p2p.util.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    Users selectByUsername(String username);

    List<String> listPermissionsByUserName(Users user);//查询指定用户拥有的权限

    List<String> listRolesByUserName(Users user);//查询指定用户拥有的角色
    List<Users> list(Users users);//查询所有
    int upjy(Users users);//禁用用户

    Users Yan(String tel);
}