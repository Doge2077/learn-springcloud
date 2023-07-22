package com.borrow.service.impl;

import com.borrow.mapper.BorrowMapper;
import com.borrow.service.BorrowService;
import com.entity.book.entity.Book;
import com.entity.borrow.entity.Borrow;
import com.entity.borrow.entity.UserBorrowDetail;
import com.entity.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper borrowMapper;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(Long uid) {
        List<Borrow> borrowList = borrowMapper.getBorrowByUid(uid);
        RestTemplate template = new RestTemplate();
        //这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取User信息
        User user = template.getForObject("http://localhost:8801/user/"+uid, User.class);
        //获取每一本书的详细信息
        List<Book> bookList = borrowList
                .stream()
                .map(b -> template.getForObject("http://localhost:8802/book/"+b.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
