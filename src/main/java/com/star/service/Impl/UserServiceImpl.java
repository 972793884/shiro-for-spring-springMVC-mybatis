package com.star.service.Impl;

import com.star.controller.UserService;
import com.star.mapper.UserMapper;
import com.star.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Integer save(User user) {
        if (user.getId()==null){
            user.setSignInTime(new Date());
            return userMapper.save(user);
        } else
            return userMapper.update(user);
    }
}
