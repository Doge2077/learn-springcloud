package com.user.service.impl;


import com.entity.user.entity.User;
import com.user.mapper.UserMapper;
import com.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserByUid(Long uid) {
        return userMapper.getUserByUid(uid);
    }

    @Override
    public Integer getRemain(Long uid) {
        return userMapper.getUserBookRemain(uid);
    }

    @Override
    public Boolean setRemain(Long uid, Integer count) {
        return userMapper.updateBookCount(uid, count) > 0;
    }
}
