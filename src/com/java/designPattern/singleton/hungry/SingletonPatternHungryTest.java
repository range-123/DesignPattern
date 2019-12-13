package com.java.designPattern.singleton.hungry;

import com.java.designPattern.singleton.utils.ConcurrentExecutor;
import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: DesignPattern
 * @description: 单利模式-饿汉模式
 * @author: fz
 * @create: 2019-12-12 17:44
 */
public class SingletonPatternHungryTest {
    public static void main(String[] args) {
        //饿汉模式 --实例
        SingletonPatternHungry singletonPatternHungry = SingletonPatternHungry.getInstance();
        System.out.println(singletonPatternHungry.hashCode()+" hungry");
        //多线程测试饿汉模式 线程安全
        Thread thread = new Thread( new HungryThread());
        Thread thread2 = new Thread( new HungryThread());
        //thread.start(); thread2.start();
        //发令枪测试
       /* try {
            ConcurrentExecutor.execute(()->{
                SingletonPatternHungry sin = SingletonPatternHungry.getInstance();
                System.out.println(sin.hashCode());
            },10,3);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //破坏懒汉单例模式--序列化 果然破坏
        //SerializableCheckSingletonUtil.serializableCheckSingleton(singletonPatternHungry);
        //破坏懒汉单例模式构造方法进行测试、果然破坏
        //解决方法 在饿汉单例的构造方法里抛出一个runtimeExceptino 异常即可
        try {
            ConstructorCheckSingletonUtil.constructorChekcSingletonUtil("com.java.designPattern.singleton.hungry.SingletonPatternHungry");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}