package com.java.designPattern.singleton.containercache;

import com.java.designPattern.singleton.utils.ConcurrentExecutor;
import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

/**
 * @program: DesignPattern
 * @description: 容器缓存校验
 * @author: fz
 * @create: 2019-12-13 11:04
 */
public class SingletonContainerTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(()->{
            SingletonContainer singletonContainer = (SingletonContainer) SingletonContainer.getBean("com.java.designPattern.singleton.containercache.SingletonContainer");
            },10,10);
        } catch (Exception e) {
            e.printStackTrace();
        }

       /* SingletonContainer singletonContainer = (SingletonContainer) SingletonContainer.getBean("com.java.designPattern.singleton.containercache.SingletonContainer");
        System.out.println(singletonContainer.hashCode());
        SerializableCheckSingletonUtil.serializableCheckSingleton("com.java.designPattern.singleton.containercache.SingletonContainer");*/
     }

}