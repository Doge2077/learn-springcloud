package com.borrow.service.client;

import com.entity.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("userservice")
public interface UserClient {

    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") Long uid);
}