package com.java.designPattern.singleton.enums;

import com.java.designPattern.singleton.utils.ConcurrentExecutor;
import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: DesignPattern
 * @description: 枚举测试
 * @author: fz
 * @create: 2019-12-13 09:29
 */
public class SingletonEnumsTest {
    public static void main(String[] args) {
        SingletonEnums singletonEnums = SingletonEnums.SINGLETON_ENUMS;
        System.out.println(singletonEnums.hashCode());
        //发射枪 检测枚举的线程安全问题
        /*try {
            ConcurrentExecutor.execute(()->{
                SingletonEnums singletonEnums1 = SingletonEnums.SINGLETON_ENUMS;
                System.out.println(singletonEnums1.hashCode());
            },10,10);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //破坏单例-序列化  结果：没有被破坏
      // SerializableCheckSingletonUtil.serializableCheckSingleton(singletonEnums);

        //破坏单例 --反射  结果：报错信息 NoSuchMethodException 个人总结：枚举不支持构造反射
        //源码：反射在通过newInstance创建对象时，会检查该类是否ENUM修饰，如果是则抛出异常，反射失败
        try {
            ConstructorCheckSingletonUtil.constructorChekcSingletonUtil("com.java.designPattern.singleton.enums.SingletonEnums");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}