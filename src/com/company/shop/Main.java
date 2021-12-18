package com.company.shop;

import com.company.shop.items.Bread;
import com.company.shop.items.Candy;
import com.company.shop.items.Milk;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Costumer costumer = new Costumer(
                "Artem",
                "Dom kolotyshkino",
                120,
                10
                );
        // Best practice get info from db
        System.out.println("Items list: ");

        long timespamp = 1532516390;
        Date date = new Date(timespamp);

        Bread white = new Bread(
                date,
                "White",
                "Baikonur bread fabrica",
                "Qyzylzhar",
                12
        );

        System.out.println(white.toString());

        Candy candy = new Candy(
                "Irishka",
                "Molokozavod Irkutsk",
                144,
                "Normal"
        );

        System.out.println(candy.toString());

        Milk milk = new Milk(
                "Prostokvashino",
                "Prostokvashino",
                130,
                3.2,
                date
        );

        System.out.println(milk.toString());

        Item[] items = new Item[] {
                milk,
                white,
                candy
        };
        // upcast

        Informer informer = new Informer();

        while(true) {
            System.out.println();
            System.out.printf("Hello, %s. Your balance %f", costumer.name, costumer.balance);
            for (int i = 0; i < items.length; i++) {
                System.out.printf("item number %d with price %f", i, items[i].price);
            }
            System.out.println("Enter number of item to buy:");
            int n = sc.nextInt();
            if (0 <= n && n < items.length) {
                if(items[n].price <= costumer.balance){
                    informer.Buy(costumer, items[n]);
                }
            }
            else {
                System.out.println("You entered invalid number!");
            }
        }
    }
}