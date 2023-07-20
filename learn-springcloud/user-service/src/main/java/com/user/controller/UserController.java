package com.user.controller;

import com.user.entity.User;
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

}
