package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Mendy
 * @create 2023-06-21 16:10
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();

    }
}

