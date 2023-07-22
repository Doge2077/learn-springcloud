package com.user.controller;


import com.entity.user.entity.User;
import com.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getUserByUid(@PathVariable("uid") Long uid) {
        return userService.getUserByUid(uid);
    }

    @RequestMapping("/user/remain/{uid}")
    public Integer userRemain(@PathVariable("uid") Long uid){
        return userService.getRemain(uid);
    }

    @RequestMapping("/user/borrow/{uid}")
    public Boolean userBorrow(@PathVariable("uid") Long uid){
        int remain = userService.getRemain(uid);
        return userService.setRemain(uid, remain - 1);
    }

}
