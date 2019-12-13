package com.java.designPattern.singleton.lazy;

import com.java.designPattern.singleton.utils.ConcurrentExecutor;
import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SinglePatternLazyTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //单例的基本使用
        SinglePatternLazy singlePatternLazy = SinglePatternLazy.getInstance();
        System.out.println(singlePatternLazy.hashCode());

        //测试单例的线程是否安全
        //方法1：使用lazyThread 进行多线程检验 懒汉单利模式        在idea中使用Thread断点 可以导致线程不安全问题
       /* Thread thread  = new Thread(new LazyThread());
        thread.start();
        Thread thread2  = new Thread(new LazyThread());
        thread2.start();*/
        //方法2 使用发令枪 校验 线程是否安全问题
        /*try {
            ConcurrentExecutor.execute(()->{
                SinglePatternLazy singlePatternLazy1 = SinglePatternLazy.getInstance();
                System.out.println(singlePatternLazy1.hashCode());
            },1000,100 );
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //破坏单例
        //方法一  序列化与反序列化(已经封装成公共方法)  singlePatternLazy.hashCode()：1163157884  sa.hashCode():1452126962  结论：序列化与反序列化可以破坏单例
        //注意 SinglePatternLazy 需要实现Serializable 接口
        SerializableCheckSingletonUtil.serializableCheckSingleton(singlePatternLazy);

        //方法二 构造反射破坏单例  即使在懒汉单例中加入synchronized 也会被破坏
        //ConstructorCheckSingletonUtil.constructorChekcSingletonUtil("com.java.designPattern.singleton.lazy.SinglePatternLazy");

    }
}
