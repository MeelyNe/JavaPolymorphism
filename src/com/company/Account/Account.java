package com.company.Account;

public class Account {
    private int accountID;
    private String accountType;
    private Costumer costumer;
    private double accountBalance;

    public Account(int accountID, String accountType, Costumer costumer, double accountBalance) {
        this.accountID = accountID;
        this.accountType = accountType;
        this.costumer = costumer;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountID: " + this.accountID + '\n' + "Account type: " + this.accountType + '\n' + this.costumer + '\n' + "Account Balance: " + this.accountBalance;
    }

    public void transferMoney(Account where, double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            where.accountBalance += amount;
            System.out.println("Success! Transfer " + amount + " to " + where.accountType);
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(int amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println("Success! You withdraw " + amount);
        }
    }

    public void deposit(int amount) {
        this.accountBalance += amount;
        System.out.println("Success! You deposit " + amount);
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
