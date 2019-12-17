package com.java.designPattern.proxy.units;

/**
 * @program: DesignPattern
 * @description:
 * @author: fz
 * @create: 2019-12-16 14:50
 */
public class Book {
    String id;
    String name;
    double price;
    String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}