package com.example;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcTestApplicationTests {

    @Resource
    UserMapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.getUserById(0));
        System.out.println(mapper.getUserById(1));
    }

}
