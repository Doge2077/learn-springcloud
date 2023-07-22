package com.book.mapper;


import com.entity.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM db_book WHERE bid = #{bid}")
    Book getBookByBid(Long bid);
}
