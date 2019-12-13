package com.java.designPattern.singleton.threadLocal;

/**
 * @program: DesignPattern
 * @description: 多线程下进行测试ThreadLocal
 * @author: fz
 * @create: 2019-12-12 22:28
 */
public class LocalThreads implements  Runnable {
    @Override
    public void run() {
        SingletonThreadLocal singletonThreadLocal = SingletonThreadLocal.getInstance();
        System.out.println(singletonThreadLocal.hashCode() +"  "+ Thread.currentThread().getName());
    }
}