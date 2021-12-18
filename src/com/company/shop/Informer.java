package com.company.shop;

import com.company.shop.Costumer;
import com.company.shop.Item;

public class Informer
{
    public void Buy(Costumer cs, Item item)
    {
        double price = item.price;
        if(cs.ReduceBalance(price)) {
            System.out.printf("Success! %s buyed %s. Product in angar", cs.name, item.name);
        }
    }
}