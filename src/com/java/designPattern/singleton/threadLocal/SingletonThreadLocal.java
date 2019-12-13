package com.java.designPattern.singleton.threadLocal;

import java.util.function.Supplier;

/**
 * @program: DesignPattern
 * @description: threadLocal-singleton
 * @author: fz
 * @create: 2019-12-12 19:28
 * 总结：单线程中ThreadLocal 可以达到线程安全的效果 在多线程下进行校验 不能保证单利唯一
 * ThreadLocal 总结：用于线程之间的数据隔离  用发：初始化一个ThreadLocal<?> 然后将当前值 通过重写InitialValue() 方法 将value 放入Thredlocal中  放入在当前的线程里
 * Threadlocal 初始化的value Thread.currentThread 之间关系   currentThread 相当于一个map 将Threadlocal 作为key 初始化value 作为值进行设置
 * 注意：单个线程可以有若干个ThreadLocal 对应的可以有若干个value
 * 缺点：现场中的value值 没有被删除或者替换  ThreadLocal的生命周期将于当前线程保持一致
 * 场景：通过不同的线程对象设置Bean属性，保证各个线程Bean对象的独立性。
 * synchronized :多线程下进行数据共享
 */
public class SingletonThreadLocal {

    private SingletonThreadLocal(){}
    private static ThreadLocal<SingletonThreadLocal> singletonThreadLocalThreadLocal = new ThreadLocal<SingletonThreadLocal>() {

        @Override
        protected SingletonThreadLocal initialValue() {
            return new SingletonThreadLocal();
        }
    };

    public static SingletonThreadLocal getInstance(){
        return singletonThreadLocalThreadLocal.get();
    }
}