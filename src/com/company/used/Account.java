package com.company.used;

public class Account {
    private int accountNO;
    private String accountType;
    private int accountBalance;

    public Account(int accountNO, String accountType, int accountBalance) {
        this.accountNO = accountNO;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount) {
        if (accountBalance > amount) {
            accountBalance -= amount;
            System.out.println("Success! You withdraw " + amount + " from " + this.accountType);
        } else {
            System.out.println("Not enough money to withdraw!");
        }
    }

    public void deposit(int amount) {
        accountBalance += amount;
        System.out.println("Success! Your deposit " + amount);
    }

    public String displayAccountDetails() {
        return "Account{" +
                "accountNO=" + accountNO +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void transferMoney(Account where, int amount) {
        if (accountBalance > amount) {
            this.accountBalance -= amount;
            where.accountBalance += amount;
            System.out.println("Success transfer to " + where.accountType + " amount " + amount);
        }
        else {
            System.out.println("Not enough money to transfer!");
        }
    }
}
