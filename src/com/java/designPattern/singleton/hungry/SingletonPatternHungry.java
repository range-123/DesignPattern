package com.java.designPattern.singleton.hungry;

import com.java.designPattern.singleton.lazy.SinglePatternLazy;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: singletonPatton-hungry
 * @author: fz
 * @create: 2019-12-12 17:11
 */
/*
  单利模式：饿汉模式
  优点：线程安全
  缺点：消耗资源 总会实例化加载一次
  另一种写法 ：加入静态方法 static{ hungrys =  new SingletonPatternHungry(); }
  改进二：静态内部类进行加载 但是其属于懒加载
 */
public class SingletonPatternHungry implements Serializable {
    private static SingletonPatternHungry hungrys =  new SingletonPatternHungry();
    private SingletonPatternHungry(){}
    public static SingletonPatternHungry getInstance(){
        if(hungrys == null){
            hungrys = new SingletonPatternHungry();
        }
            return hungrys;
    }
}