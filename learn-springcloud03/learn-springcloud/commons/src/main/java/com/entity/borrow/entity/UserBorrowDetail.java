package com.entity.borrow.entity;

import com.entity.book.entity.Book;
import com.entity.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
