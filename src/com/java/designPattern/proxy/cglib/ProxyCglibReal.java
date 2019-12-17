package com.java.designPattern.proxy.cglib;

import com.java.designPattern.proxy.units.Customer;

/**
 * @program: DesignPattern
 * @description: 目标类-cglib
 * @author: fz
 * @create: 2019-12-16 17:01
 */
public class ProxyCglibReal implements  IProxyCglib{

    @Override
    public void introduce(Customer c) {
        System.out.println("美少女一枚");

    }
}