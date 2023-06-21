package com.itheima.service.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Mendy
 * @create 2023-06-21 16:49
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;


    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}

