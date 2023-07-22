package com.user.service;


import com.entity.user.entity.User;

public interface UserService {
    User getUserByUid(Long uid);
}
