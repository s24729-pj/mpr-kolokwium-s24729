package com.example.s24729bank;

public class Client {
    private double balance;
    private final String id;

    public Client(String id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    public void removeFromBalance(double amount) {
        this.balance = balance - amount;
    }

    public void addToBalance(double amount) {
        this.balance = balance + amount;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "balance=" + balance +
                ", id='" + id + '\'' +
                '}';
    }
}
