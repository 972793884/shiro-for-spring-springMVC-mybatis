package com.star.mapper;

import com.star.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthMapper {
    @Select("select * from permission where id in (select permissionid from role_permission where roleid=#{roleid})")
    List<Permission> findPermissonListByRoleId(Integer roleid);

    @Select("select * from permission")
    List<Permission> findAll();

    @Select("select * from role where id=#{roleid}")
    Role findRoleById(Integer roleid);

    @Select("select * from role_permission")
    List<RolePermission> findAllRolePermission();

    @Select("select * from user_role")
    List<UserRole> findAllUserRoles();

    @Select("select * from permission_permissions")
    List<PermissionPermissions> findAllPermissionPermissions();

    @Select("select * from role")
    List<Role> findAllRoles();
@Select("select * from role where id in (select roleid from user_role where userid=#{id})")
    List<Role> findRolesByUserId(Integer id);
}
