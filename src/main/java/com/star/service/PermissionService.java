package com.star.service;

import com.star.vo.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findPermissonListByRoleId(Integer roleid);

    List<Permission> getAll();

    List<Permission> getPermsById(Integer id);
}
