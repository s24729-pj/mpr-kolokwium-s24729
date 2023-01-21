package com.example.s24729bank;

public class TransactionInfo {
    private final TransactionType transactionType;
    private final TransactionState transactionState;
    private final Client client;
    private final double amount;

    public TransactionInfo(TransactionType transactionType, TransactionState transactionState, Client client, double amount) {
        this.transactionType = transactionType;
        this.transactionState = transactionState;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionInfo{" +
                "transactionType=" + transactionType +
                ", transactionState=" + transactionState +
                ", client=" + client +
                ", amount=" + amount +
                '}';
    }
}
