package com.star.controller;

import com.star.Utils.Ret;
import com.star.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegisterController {
    @Autowired
    UserService userService;
    @PostMapping("doRegister")
    Ret doRegister(User user){
       Integer result =  userService.save(user);
       return result>0?Ret.ok().set("msg","ok"):Ret.fail().set("msg","failed");
    }
}
