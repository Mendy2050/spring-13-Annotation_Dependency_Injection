package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mendy
 * @create 2023-06-21 16:35
 */
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private String name;


    public void save() {
        System.out.println("book dao save ..." +name);
    }


}

