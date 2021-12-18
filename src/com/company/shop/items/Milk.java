package com.company.shop.items;

import com.company.shop.Item;

import java.util.Date;

public class Milk extends Item {
    public double fat;
    public Date expressionTime;

    public Milk(String name, String manufactor, double price, double fat, Date expressionTime) {
        this.name = name;
        this.manufactor = manufactor;
        this.price = price;
        this.fat = fat;
        this.expressionTime = expressionTime;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public Date getExpressionTime() {
        return expressionTime;
    }

    public void setExpressionTime(Date expressionTime) {
        this.expressionTime = expressionTime;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "manufactor='" + manufactor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", fat=" + fat +
                ", expressionTime=" + expressionTime +
                '}';
    }
}
