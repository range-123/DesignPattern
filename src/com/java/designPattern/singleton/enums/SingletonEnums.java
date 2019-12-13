package com.java.designPattern.singleton.enums;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: 枚举
 * @author: fz
 * @create: 2019-12-13 09:27
 * 有点：线程安全 序列化与反射不会破坏单例
 */
public enum  SingletonEnums implements Serializable {
    SINGLETON_ENUMS;

    //其他方法

    @Override
    public String toString() {
        return super.toString();
    }
}