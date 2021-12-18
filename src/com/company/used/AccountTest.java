package com.company.used;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account(1,"Carder", 100);
        Account ac1 = new Account(2,"Homebank", 120);

        ac.transferMoney(ac1, 10);
        ac1.withdraw(26);

        System.out.println(ac.displayAccountDetails());
        System.out.println(ac1.displayAccountDetails());
    }
}
