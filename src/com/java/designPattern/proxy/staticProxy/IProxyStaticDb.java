package com.java.designPattern.proxy.staticProxy;

import com.java.designPattern.proxy.units.Book;

import java.util.List;

//静态代理 --接口 background: 新增 删除 修改数据的操作
public interface IProxyStaticDb {

    int insertOne(Book b);

    int updateOne(Book book);

    int deleteOne(String id);

    List<Book> getBookList();
}
