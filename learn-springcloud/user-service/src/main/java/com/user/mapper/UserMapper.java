package com.user.mapper;

import com.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM db_user WHERE uid = #{uid}")
    User getUserByUid(Long uid);
}
