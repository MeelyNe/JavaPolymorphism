package com.company.shop.items;

import com.company.shop.Item;

public class Candy extends Item {
    public String taste;

    public Candy(String name, String manufactor, double price, String taste) {
        this.name = name;
        this.manufactor = manufactor;
        this.price = price;
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "manufactor='" + manufactor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
