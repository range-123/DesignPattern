package com.java.designPattern.singleton.extendSingleton;

/**
 * @program: DesignPattern
 * @description: 单例模式-扩展
 * @author: fz
 * @create: 2019-12-13 10:09
 */
public class SingletonTriple {
    private int id;
    private static SingletonTriple singletonTriple[] = new SingletonTriple[]{
            new SingletonTriple(1),
            new SingletonTriple(2),
            new SingletonTriple(3)
    };
    private SingletonTriple(int id){
        this.id = id;

    }
    public static SingletonTriple getInstance(int id){
        return singletonTriple[id];
    }
}