package com.java.designPattern.proxy.units;

/**
 * @program: DesignPattern
 * @description:
 * @author: fz
 * @create: 2019-12-16 16:33
 */
public class Order {
    String id;

    String orderName;

    String createTime;

    public Order(String id, String orderName, String createTime) {
        this.id = id;
        this.orderName = orderName;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}