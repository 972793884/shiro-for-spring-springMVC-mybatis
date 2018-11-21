package com.star.controller;

import com.star.Utils.PageUtils;
import com.star.Utils.Record;
import com.star.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("menu")
@RestController
public class MenuController {
    @Autowired
    PageUtils pageUtils;
    @Autowired
    MenuService menuService;
    @GetMapping("list")
    PageUtils list (){
        List<Record> list =menuService.getAll();
        pageUtils.setPageList(list,1,10);
        return pageUtils;
    }
}
