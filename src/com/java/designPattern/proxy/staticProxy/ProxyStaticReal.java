package com.java.designPattern.proxy.staticProxy;

import com.java.designPattern.proxy.units.Book;

import java.util.List;

/**
 * @program: DesignPattern
 * @description: 被代理类 主要用于方法的具体实现
 * @author: fz
 * @create: 2019-12-16 14:54
 */
public class ProxyStaticReal implements IProxyStaticDb{

    @Override
    public int insertOne(Book b) {
        System.out.println("新增书籍");
        return 0;
    }

    @Override
    public int updateOne(Book book) {
        System.out.println("修改书籍");

        return 0;
    }

    @Override
    public int deleteOne(String id) {
        System.out.println("删除书籍");

        return 0;
    }

    @Override
    public List<Book> getBookList() {
        System.out.println("查询书籍");

        return null;
    }
}