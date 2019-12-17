package com.java.designPattern.proxy.units;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: DesignPattern
 * @description: aop-动态切换数据源
 * @author: fz
 * @create: 2019-12-16 15:03
 */
public class DateSourceAop {
    private final  static  String dateSource = null;

    private final  static ThreadLocal<DateSource> threadLocal = new ThreadLocal<>();

    public  DateSourceAop(){
    }

    //得到数据源信息
    public static DateSource get(){
        return threadLocal.get();
    }

    //设置数据源信息
    public static void set(DateSource db){
        threadLocal.set(db);
    }

    //清空数据源信息
    public static  void clear(DateSource db){
        threadLocal.set(db);
    }




}