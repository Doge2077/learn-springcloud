package com.borrow.mapper;


import com.entity.borrow.entity.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BorrowMapper {
    @Select("SELECT * FROM db_borrow WHERE uid = #{uid}")
    List<Borrow> getBorrowByUid(Long uid);

    @Select("SELECT * FROM db_borrow WHERE bid = #{bid}")
    List<Borrow> getBorrowByBid(Long bid);

    @Select("SELECT * FROM db_borrow WHERE uid = #{uid} AND bid = #{bid}")
    Borrow getBorrowByUidAndBid(Long uid, Long bid);

    @Insert("Insert INTO db_borrow(uid, bid) VALUES(#{uid}, #{bid})")
    Integer addBorrow(Integer uid, Integer bid);
}
