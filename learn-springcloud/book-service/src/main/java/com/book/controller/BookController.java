package com.book.controller;


import com.book.service.BookService;

import com.entity.book.entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book getBookByBid(@PathVariable("bid") Long bid) {
        System.out.println(bookService.getBookByBid(bid));
        return bookService.getBookByBid(bid);
    }

    @RequestMapping("/book/remain/{bid}")
    public Integer bookRemain(@PathVariable("bid") Long uid){
        return bookService.getRemain(uid);
    }

    @RequestMapping("/book/borrow/{bid}")
    public Boolean bookBorrow(@PathVariable("bid") Long uid){
        int remain = bookService.getRemain(uid);
        return bookService.setRemain(uid, remain - 1);
    }
}
