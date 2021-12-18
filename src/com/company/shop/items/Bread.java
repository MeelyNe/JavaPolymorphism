package com.company.shop.items;

import com.company.shop.Costumer;
import com.company.shop.Item;

import java.util.Date;

public class Bread extends Item {
    public Date expressionTime;
    public String type;

    public Bread(Date expressionTime, String type, String manufactor, String name, double price) {
        this.expressionTime = expressionTime;
        this.type = type;
        this.manufactor = manufactor;
        this.name = name;
        this.price = price;
    }

    public Date getExpressionTime() {
        return expressionTime;
    }

    public void setExpressionTime(Date expressionTime) {
        this.expressionTime = expressionTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "manufactor='" + manufactor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expressionTime=" + expressionTime +
                ", type='" + type + '\'' +
                '}';
    }
    // Seems like discount for one class
    @Override
    public double GetDiscountPrice(Costumer cs) {
        return this.price * 0.5;
    }
}
