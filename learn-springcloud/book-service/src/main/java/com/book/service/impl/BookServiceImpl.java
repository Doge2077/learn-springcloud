package com.book.service.impl;


import com.book.mapper.BookMapper;
import com.book.service.BookService;
import com.entity.book.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookByBid(Long bid) {
        return bookMapper.getBookByBid(bid);
    }

    @Override
    public Boolean setRemain(Long bid, Integer count) {
        return bookMapper.setRemain(bid, count) > 0;
    }

    @Override
    public Integer getRemain(Long bid) {
        return bookMapper.getRemain(bid);
    }
}
