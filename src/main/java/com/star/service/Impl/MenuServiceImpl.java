package com.star.service.Impl;

import com.star.Utils.Record;
import com.star.mapper.MenuMapper;
import com.star.service.MenuService;
import com.star.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<Record> getAll() {
        return menuMapper.getAll();
    }
}
