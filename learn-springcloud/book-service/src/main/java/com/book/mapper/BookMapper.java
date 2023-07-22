package com.book.mapper;


import com.entity.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM db_book WHERE bid = #{bid}")
    Book getBookByBid(Long bid);

    @Select("SELECT count FROM db_book WHERE bid = #{bid}")
    Integer getRemain(Long bid);

    @Update("UPDATE db_bool SET count = #{count} WHERE bid = #{bid}")
    Integer setRemain(Long bid, Integer count);

}
