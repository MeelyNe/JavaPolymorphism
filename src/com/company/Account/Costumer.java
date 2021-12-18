package com.company.Account;

public class Costumer {
    private int costumerId;
    private String costumerName;
    private String costumerAdders;

    public Costumer(int costumerId, String costumerName, String costumerAdders) {
        this.costumerId = costumerId;
        this.costumerName = costumerName;
        this.costumerAdders = costumerAdders;
    }

    @Override
    public String toString() {
        return "№" + this.costumerId + '\n' + "Name: " + this.costumerName + '\n' + "Address: " + this.costumerAdders;
    }
}
