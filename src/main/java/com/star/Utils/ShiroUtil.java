package com.star.Utils;

import com.star.mapper.AuthMapper;
import com.star.vo.*;
import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShiroUtil {
    @Autowired
    AuthMapper authMapper;

    public Map<String, String> getPermissionMap() {
        Map<String, String> map = new HashMap<>();
        map.put("/logout", "logout");
        //对所有用户认证anon
        map.put("/doLogin", "anon");
        map.put("/soft/**","anon");
        map.put("/**/*.js", "anon");
        map.put("/student/package", "anon");
        List<Permission> list = authMapper.findAll();
        //List<UserRole> userRoles=authMapper.findAllUserRoles();
        List<Role> roles = authMapper.findAllRoles();
        List<PermissionPermissions> permissionPremissions = authMapper.findAllPermissionPermissions();
        List<RolePermission> rolePermissions = authMapper.findAllRolePermission();
        System.out.println("------加载资源拦截------");
        for (Permission permission : list) {

            String role = "";
            String prem = "";
            //角色权限
            for (RolePermission rolePermission : rolePermissions) {
                if (rolePermission.getPermissionid() == permission.getId()) {
                    for (Role ro : roles) {
                        if (rolePermission.getRoleid() == ro.getId()) {
                                role +=  ro.getName()+",";
                        }
                    }
                }
            }
            if (permission.getNeedallroles() == 0&&!role.equals("")) {
                role += "or";
            }else if (permission.getNeedallroles() == 1&&!role.equals("")){
                role=role.substring(0,role.length()-1);
            }
            //资源权限

            for (PermissionPermissions permissionPremission : permissionPremissions) {
                if (permissionPremission.getPermMain() == permission.getId()) {
                    for (Permission p : list) {
                        if (permissionPremission.getPerm() == p.getId()) {
                                prem += permission.getName()+",";
                        }
                    }
                }
            }
            if (permission.getNeedallprems() == 0&&!prem.equals("")) {
                prem += "or";
            }else if (permission.getNeedallprems() == 1&&!prem.equals("")){
                prem=prem.substring(0,prem.length()-1);
            }
            System.out.println("资源:" + "perms[" + prem + "],roles[" + role + "]" + "    资源路径:" + "/**/" + permission.getUrl());
            map.put("/**/" + permission.getUrl(), "perms[" + prem + "],roles[" + role + "]");
        }
        map.put("/**", "authc");
        map.put("/*/*.html", "authc");
        return map;
    }
}
