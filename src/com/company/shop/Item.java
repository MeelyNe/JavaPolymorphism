package com.company.shop;

public class Item {
    public String manufactor;
    public String name;
    public double price;

    public double GetDiscountPrice(Costumer cs) {
        if (cs.spent < 300) {
            return this.price;
        }
        else if (cs.spent < 1000){
            return this.price * 0.8;
        }
        else {
            return this.price * 0.75;
        }
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
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
}
