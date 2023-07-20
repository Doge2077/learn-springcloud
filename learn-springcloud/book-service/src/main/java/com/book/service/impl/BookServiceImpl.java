package com.book.service.impl;

import com.book.entity.Book;
import com.book.mapper.BookMapper;
import com.book.service.BookService;
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
}
