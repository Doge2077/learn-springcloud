package com.book.service;


import com.entity.book.entity.Book;

public interface BookService {
    Book getBookByBid(Long bid);

    Boolean setRemain(Long bid, Integer count);

    Integer getRemain(Long bid);
}
