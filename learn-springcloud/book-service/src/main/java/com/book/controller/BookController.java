package com.book.controller;

import com.book.entity.Book;
import com.book.service.BookService;

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
}
