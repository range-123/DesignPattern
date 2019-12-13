package com.java.designPattern.singleton.doublecheck;

import com.java.designPattern.singleton.utils.ConstructorCheckSingletonUtil;
import com.java.designPattern.singleton.utils.SerializableCheckSingletonUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: DesignPattern
 * @description: 双重校验--单利模式
 * @author: fz
 * @create: 2019-12-12 19:04
 */
public class SingletonPDoubleCheckTest {
    public static void main(String[] args) {
        SingletonPDoubleCheck singletonPDoubleCheck = SingletonPDoubleCheck.getInstance();
        System.out.println(singletonPDoubleCheck.hashCode() +" doubleCheck" );
        //destroy singleton pattern -serialization   conclusion:success destroy
        SerializableCheckSingletonUtil.serializableCheckSingleton(singletonPDoubleCheck);
        //destroy singleton pattern -constructor     conclusion：success destroy
        try {
            ConstructorCheckSingletonUtil.constructorChekcSingletonUtil("com.java.designPattern.singleton.doublecheck.SingletonPDoubleCheck");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}