package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from test where id = #{id}")
    User getUserById(int id);

    @Insert("insert into test(id, name, passwd) values(#{id}, #{name}, #{passwd})")
    int addUser(User user);

    @Select("select * from test where id between #{start} and #{end}")
    List<User> getUsersByIdRange(int start, int end);
}