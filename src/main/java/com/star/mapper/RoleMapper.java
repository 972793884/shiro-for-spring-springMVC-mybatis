package com.star.mapper;

import com.star.vo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select * from role where id in(select id from role_permission where permissionid=#{id})")
    List<Role> getRolesById(Integer id);
}
