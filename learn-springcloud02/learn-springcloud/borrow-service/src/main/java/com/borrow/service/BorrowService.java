package com.borrow.service;

import com.entity.borrow.entity.UserBorrowDetail;

import java.util.List;

public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(Long uid);
}
