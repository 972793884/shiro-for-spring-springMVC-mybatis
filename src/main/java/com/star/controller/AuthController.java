package com.star.controller;

import com.star.Utils.PageUtils;
import com.star.Utils.Ret;
import com.star.service.PermissionService;
import com.star.service.RoleService;
import com.star.vo.Permission;
import com.star.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("auth")
@RestController
public class AuthController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    PageUtils pageUtils;
     //主资源id, 资源ids,角色ids
    String savePermissionAndAuths(Integer pid,String pids,String rids){

        return null;
    }
    @GetMapping("permissionlist")
    PageUtils list(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize){
        List<Permission> list=permissionService.getAll();
        pageUtils.setPageList(list,page==null?1:page,pageSize);
        return pageUtils;

    }
    @GetMapping("getAuthById")
    Ret authList(Integer id){
        List<Role> list= roleService.getRolesById(id);
        List<Permission> permissionList =permissionService.getPermsById(id);
        return Ret.ok();
    }

}
