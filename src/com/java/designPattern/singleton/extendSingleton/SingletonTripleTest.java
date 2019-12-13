package com.java.designPattern.singleton.extendSingleton;

/**
 * @program: DesignPattern
 * @description: SingletonTriple 校验
 * @author: fz
 * @create: 2019-12-13 10:12
 */
public class SingletonTripleTest {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            SingletonTriple singletonTriple = SingletonTriple.getInstance(i%3);
            System.out.println(singletonTriple.hashCode());
        }
    }
}