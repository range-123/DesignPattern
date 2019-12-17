package com.java.designPattern.proxy.cglib;

import com.java.designPattern.proxy.jdkProxy.ProxyJdkReal;
import com.java.designPattern.proxy.staticProxy.IProxyStaticDb;
import com.java.designPattern.proxy.staticProxy.ProxyStaticPro;
import com.java.designPattern.proxy.staticProxy.ProxyStaticReal;
import com.java.designPattern.proxy.units.Book;
import com.java.designPattern.proxy.units.Customer;

/**
 * @program: DesignPattern
 * @description: 测试-静态代理
 * @author: fz
 * @create: 2019-12-16 14:59
 */
public class ProxyJdkTest {

    public static void main(String[] args) {

        ProxyCglibReal proxyCglib = (ProxyCglibReal) new ProxyCglibPro().getInstance(new ProxyCglibReal());
        proxyCglib.introduce(new Customer());
    }

}