package com.java.designPattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: DesignPattern
 * @description: cglib-代理类
 * @author: fz
 * @create: 2019-12-16 17:02
 * 不需要实现接口- 体现在 ProxyCglibReal proxyCglib = (ProxyCglibReal) new ProxyCglibPro().getInstance(new ProxyCglibReal());
 * 在运行期间 需要借助ASM框架生成字节码，生成代理类效率低  执行效率高，
 */
public class ProxyCglibPro implements MethodInterceptor {


    public Object getInstance(Object o){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        //即将生成的新类父类
        enhancer.setSuperclass(o.getClass());
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object oo  =null;
        oo = methodProxy.invokeSuper(o,objects);
        return null;

    }
}