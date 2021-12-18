package com.company.Account;

import java.util.Scanner;

public class AccTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = sc.next();
        System.out.println("Enter address: ");

        String address = sc.next();
        System.out.println("Enter account type: ");

        String type = sc.next();

        Costumer costumer = new Costumer(1, name, address);
        Account account = new Account(1, type, costumer, 100);

        int amount;
        boolean flag = false;

        do {
            System.out.println("Enter 'q' to exit" + '\n' + "Enter 'w' to withdraw" + '\n' + "Enter 'd' to deposit");
            String command = sc.next();
            switch (command) {
                case ("q"):
                    flag = true;
                    System.out.println(account.toString());
                    break;
                case ("w"):
                    System.out.println("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    account.withdraw(amount);
                    System.out.println(account.toString());
                    break;
                case ("d"):
                    System.out.println("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    account.deposit(amount);
                    System.out.println(account.toString());
                    break;
            }
        } while (!flag);

        sc.close();
    }
}
