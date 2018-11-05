package com.star.service.Impl;

import com.star.mapper.AuthMapper;
import com.star.service.PermissionService;
import com.star.vo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private AuthMapper authMapper;

    @Override
    public List<Permission> findPermissonListByRoleId(Integer roleid) {
        return authMapper.findPermissonListByRoleId(roleid);

    }
}
