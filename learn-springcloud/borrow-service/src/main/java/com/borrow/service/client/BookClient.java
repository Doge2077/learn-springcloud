package com.borrow.service.client;

import com.entity.book.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("bookservice")
public interface BookClient {

    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") Integer bid);

    @RequestMapping("/book/borrow/{bid}")
    Boolean bookBorrow(@PathVariable("bid") Long bid);

    @RequestMapping("/book/remain/{bid}")
    Integer bookRemain(@PathVariable("bid") Long bid);
}
