package com.java.designPattern.proxy.jdkProxy;

import com.java.designPattern.proxy.units.Order;

/**
 * @program: DesignPattern
 * @description: 目标类-具体实现
 * @author: fz
 * @create: 2019-12-16 16:35
 */
public class ProxyJdkReal implements  IProxyJdk{


    @Override
    public Order create() {
        System.out.println("嘿嘿 又来一单");
        return null;
    }
}