package com.java.designPattern.singleton.doublecheck;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: 双重校验-单利模式
 * @author: fz
 * @create: 2019-12-12 18:52
 */
/*
  单利模式：双重校验
  优点：线程安全
  为什么加类锁 ： 锁加载方法上时，大量线程进行请求 会导致资源浪费 内存开销
 */
public class SingletonPDoubleCheck implements Serializable {
    private volatile static  SingletonPDoubleCheck singletonPDoubleCheck;
    private SingletonPDoubleCheck(){}
    public static SingletonPDoubleCheck getInstance(){
        //  如果已经实例化 就不需要进入等待中
        if(singletonPDoubleCheck == null){
            //多个线程进入时，进行加锁保护
            synchronized (SingletonPDoubleCheck.class){
                //多线程进入时，防止已经被实例化时，其他线程也进入下面代码块进行实例化
                if(singletonPDoubleCheck == null)
                    singletonPDoubleCheck =new SingletonPDoubleCheck();
            }
        }
        return singletonPDoubleCheck;
    }
}
