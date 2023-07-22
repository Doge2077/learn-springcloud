package com.user.service;


import com.entity.user.entity.User;

public interface UserService {
    User getUserByUid(Long uid);

    Integer getRemain(Long uid);

    Boolean setRemain(Long uid, Integer count);
}
