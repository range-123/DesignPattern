package com.java.designPattern.singleton.threadLocal;

import com.java.designPattern.singleton.utils.ConcurrentExecutor;

/**
 * @program: DesignPattern
 * @description: threadLocal- test  线程中设置ThreadLocal 将value 设置在ThreadLocal   线程之间的数据分离  单线程之间的共享
 * @author: fz
 * @create: 2019-12-12 22:22
 */
public class SingletonThreadLocalTest {
    public static void main(String[] args) {
        SingletonThreadLocal singletonThreadLocal = SingletonThreadLocal.getInstance();
        System.out.println(singletonThreadLocal.hashCode());
        SingletonThreadLocal singletonThreadLocal1 = SingletonThreadLocal.getInstance();
        System.out.println(singletonThreadLocal1.hashCode());
        //多线程 thredlocal 不安全
        Thread t1 = new Thread(new LocalThreads());
        Thread t2 = new Thread(new LocalThreads());
        Thread t3 = new Thread(new LocalThreads());
        t1.start();t2.start();t3.start();

        //发令枪 多线程中不安全
        /*try {
            ConcurrentExecutor.execute(()->{
                SingletonThreadLocal singletonThreadLocal2 = SingletonThreadLocal.getInstance();
                System.out.println(singletonThreadLocal2.hashCode() );
            },100,10);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}