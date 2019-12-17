package com.java.designPattern.proxy.units;

import java.util.Date;

/**
 * @program: DesignPattern
 * @description:
 * @author: fz
 * @create: 2019-12-16 15:08
 */
public class DateSource {
    String name;
    Date createDate;

    public DateSource(String name, Date createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}