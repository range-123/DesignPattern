package com.java.designPattern.proxy.staticProxy;

import com.java.designPattern.proxy.units.Book;
import com.java.designPattern.proxy.units.DateSource;
import com.java.designPattern.proxy.units.DateSourceAop;

import java.util.Date;
import java.util.List;

/**
 * @program: DesignPattern
 * @description: 代理类
 * @author: fz
 * @create: 2019-12-16 14:56
 * 缺点：每次代理类都要进行实现一次接口，耦合度较高
 */
public class ProxyStaticPro implements IProxyStaticDb {
    private ProxyStaticReal target;


    public ProxyStaticPro(ProxyStaticReal target) {
        this.target = target;

    }

    private void after() {
        System.out.println("execution after");
    }


    private void before() {
        System.out.println("execution before");
    }


    @Override
    public int insertOne(Book b) {
        before();
        DateSourceAop.set(new DateSource("2019",new Date()));
        target.insertOne(new Book());
        System.out.println(DateSourceAop.get());

        after();
        return 0;
    }

    @Override
    public int updateOne(Book book) {
        target.updateOne(new Book());
        return 0;
    }

    @Override
    public int deleteOne(String id) {
        target.deleteOne("");
        return 0;
    }

    @Override
    public List<Book> getBookList() {

        return target.getBookList();
    }
}