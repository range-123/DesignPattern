package com.java.designPattern.singleton.utils;

import com.java.designPattern.singleton.lazy.SinglePatternLazy;

import java.io.*;

public class SerializableCheckSingletonUtil {


   /**
    * @param null
    * @return
    * @describe
    * @author fw
    * @creed: ponder over code
    * @date 2019/12/12
    */
    public static  void serializableCheckSingleton(Object o){
        try {
            // 单例对象 先读入磁盘
            ByteArrayOutputStream bos  = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(o);
            oos.flush(); //将所有的缓存数据强制冲刷入目的地
            //读入内存
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object sa = (Object) ois.readObject();
            ois.close();
            System.out.println("重新读出");
            System.out.println(sa.hashCode());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
