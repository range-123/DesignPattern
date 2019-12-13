package com.java.designPattern.singleton.containercache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: DesignPattern
 * @description: 利用容器作为缓存--使用map 进行缓存
 * @author: fz
 * @create: 2019-12-13 10:42
 */
public class SingletonContainer {
    private SingletonContainer(){};
    private static Map<String,Object> map = new ConcurrentHashMap<>();

     public static Object getBean(String name) {
         synchronized (map){
             if (!map.containsKey(name)) {
                 Object o = null;
                 try {
                     o = Class.forName(name).newInstance();
                     map.put(name, o);
                     System.out.println(map.get(name).hashCode());
                 } catch (ClassNotFoundException e) {
                     e.printStackTrace();
                 } catch (IllegalAccessException e) {
                     e.printStackTrace();
                 } catch (InstantiationException e) {
                     e.printStackTrace();
                 }
                 return o;
             }else{
                 System.out.println(map.get(name).hashCode());
                 return map.get(name);
             }
         }



     }

}