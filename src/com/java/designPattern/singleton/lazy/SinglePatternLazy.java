package com.java.designPattern.singleton.lazy;

import java.io.Serializable;

/*
  单利模式：懒汉模式
  优点：减少开辟的资源浪费
  缺点：线程不安全
  改进一：在getInstance() 方法前 加入synchronized 加入后问题：容易造成大量线程等待
  该进二：使用双重校验 进行实现单利模式 参考包：doublecheck
  关键点：synchronized
 */
//懒汉模式--方式1
public class SinglePatternLazy implements Serializable {
    //静态变量设置
    private static SinglePatternLazy singlePatternLazy;
    //私有构造方法
    public SinglePatternLazy(){
         //抛出异常 解决单例被破坏的问题
        // if(singlePatternLazy!=null) throw new RuntimeException("已存在实例");
    }
    //提供唯一的访问点
    public synchronized static  SinglePatternLazy getInstance(){
        if(singlePatternLazy==null){
            singlePatternLazy = new SinglePatternLazy();
        }
        return singlePatternLazy;
    }

    private Object readResolve() {
        return singlePatternLazy;
    }
}
//懒汉模式 --方式二 synchronized getInstance();