package com.user.mapper;


import com.entity.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM db_user WHERE uid = #{uid}")
    User getUserByUid(Long uid);

    @Select("SELECT have FROM db_user WHERE uid = #{uid}")
    Integer getUserBookRemain(Long uid);

    @Update("UPEDATE db_user SET have = #{count} WHERE uid = #{uid}")
    Integer updateBookCount(Long uid, Integer count);

}
