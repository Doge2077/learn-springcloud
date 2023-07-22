package com.borrow.controller;

import com.alibaba.fastjson.JSONObject;
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

    @RequestMapping("/blocked")
    JSONObject blocked(){
        JSONObject object = new JSONObject();
        object.put("code", 403);
        object.put("success", false);
        object.put("massage", "您的请求频率过快，请稍后再试！");
        return object;
    }

    @RequestMapping("/borrow/take/{uid}/{bid}")
    JSONObject borrow(@PathVariable("uid") Long uid,
                      @PathVariable("bid") Long bid){
        borrowService.doBorrow(uid, bid);

        JSONObject object = new JSONObject();
        object.put("code", "200");
        object.put("success", false);
        object.put("message", "借阅成功！");
        return object;
    }

}
