package com.java.designPattern.proxy.jdkProxy;

import com.java.designPattern.proxy.units.DateSource;
import com.java.designPattern.proxy.units.DateSourceAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: DesignPattern
 * @description: jdk动态代理-代理类
 * @author: fz
 * @create: 2019-12-16 16:38
 * 实现了被代理对象的接口，生成代理类效率比cglib高，因为直接在运行期生成class字节码 通过接口实现代理类 完成具体类方法
 */
public class ProxyJkdPro  {
    private Object o;

    public Object getInstance(Object o) {

        Class<?>[] clazz = o.getClass().getInterfaces();
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), clazz, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object oo = null;
                DateSourceAop.get();
                System.out.println(DateSourceAop.get());
                oo = method.invoke( o,args);

                return oo;
            }
        });
    }


}