package com.java.designPattern.singleton.staticclass;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: 静态内部类--懒加载 --饿汉模式的改版
 * @author: fz
 * @create: 2019-12-12 18:04
 */
/*
  单利模式：静态内部类
  优点：线程安全 不需要借助 synchronized
  当类不被调用的时候，类的静态内部类是不会进行初始化的，这就避免了内存浪费问题；
 */
public class SingletonStatic implements Serializable {
    private static SingletonStatic singletonStatic;
    private SingletonStatic(){
        //if(singletonStatic!=null) throw new RuntimeException("静态单利实例只能有一个");

    }
    //final 多线程下保证方法不被修改 重写
    public final static  SingletonStatic getInstance(){
        singletonStatic = StaticHelp.s;
        return singletonStatic;
    }
    public static class StaticHelp{
        private static final SingletonStatic s = new SingletonStatic();
    }
    private Object readResolve(){
        return singletonStatic;
    }
}