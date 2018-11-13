package com.star.service.Impl;

import com.star.mapper.RoleMapper;
import com.star.service.RoleService;
import com.star.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getRolesById(Integer id) {

        return roleMapper.getRolesById(id);
    }
}
