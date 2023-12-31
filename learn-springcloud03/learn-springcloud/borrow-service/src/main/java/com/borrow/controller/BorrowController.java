package com.borrow.controller;

import com.borrow.service.BorrowService;
import com.entity.borrow.entity.UserBorrowDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BorrowController {

    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    public UserBorrowDetail getBorrowByUid(@PathVariable("uid") Long uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }

}
