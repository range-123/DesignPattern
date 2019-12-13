package com.java.designPattern.singleton.staticclass;

import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: DesignPattern
 * @description: 静态内部类-测试单利被破坏
 * @author: fz
 * @create: 2019-12-12 18:41
 */
public class SingletonStaticTest {
    public static void main(String[] args) {
        SingletonStatic singletonStatic = SingletonStatic.getInstance();
        System.out.println(singletonStatic.hashCode() +" 静态内部类");
        //因为线程安全 便不使用多线程与发令枪进行测试了
        //破坏静态内部类-单利  序列话、 果然被破坏 改进方式： 加入 private Object readResolve(){ return xx;}
       SerializableCheckSingletonUtil.serializableCheckSingleton(singletonStatic);
        //破坏静态内部类-单利  反射破坏 改进方式：在类中抛出异常 如：if(singletonStatic!=null) throw new RuntimeException("静态单利实例只能有一个");
       /* try {
            ConstructorCheckSingletonUtil.constructorChekcSingletonUtil("com.java.designPattern.singleton.staticclass.SingletonStatic");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/
    }
}