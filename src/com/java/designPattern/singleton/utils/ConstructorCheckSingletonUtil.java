package com.java.designPattern.singleton.utils;

import com.java.designPattern.singleton.lazy.SinglePatternLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorCheckSingletonUtil {

    /**
     * @param null
     * @return
     * @describe
     * @author fw
     * @creed: ponder over code
     * @date 2019/12/12
     */
    public static  void constructorChekcSingletonUtil(String name) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clazz = Class.forName(name);
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object ss = (Object) constructor.newInstance();
            System.out.println(ss.hashCode());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
