package com.java.designPattern.proxy.units;

/**
 * @program: DesignPattern
 * @description:
 * @author: fz
 * @create: 2019-12-16 16:59
 */
public class Customer {
    String id;
    String name;
    int age;
    String addr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}