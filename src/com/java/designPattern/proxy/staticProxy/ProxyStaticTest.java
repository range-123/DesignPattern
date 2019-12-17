package com.java.designPattern.proxy.staticProxy;

import com.java.designPattern.proxy.units.Book;

/**
 * @program: DesignPattern
 * @description: 测试-静态代理
 * @author: fz
 * @create: 2019-12-16 14:59
 */
public class ProxyStaticTest {

    public static void main(String[] args) {

    IProxyStaticDb  proxyStaticDb = new ProxyStaticPro(new ProxyStaticReal());
    proxyStaticDb.insertOne(new Book());
    }

}