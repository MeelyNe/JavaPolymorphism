package com.company.shop;

public class Costumer {
    public String name;
    public String address;
    public double balance;
    public double spent;

    public Costumer(String name, String address, double balance, double spent) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.spent = spent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public boolean ReduceBalance(double price) {
        if (this.balance >= price) {
            this.balance -= price;
            this.spent += price;
            return true;
        } else {
            return false;
        }
    }
}