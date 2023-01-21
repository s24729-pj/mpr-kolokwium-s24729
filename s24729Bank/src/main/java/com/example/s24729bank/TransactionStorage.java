package com.example.s24729bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionStorage {
    private List<TransactionInfo> transactionInfoList = new ArrayList<>();

    public TransactionStorage() {
        transactionInfoList.add(new TransactionInfo(TransactionType.OUTGOING, TransactionState.ACCEPTED, new Client("c005", 5000), 1000));
        transactionInfoList.add(new TransactionInfo(TransactionType.INCOMING, TransactionState.DECLINED, new Client("c006", 6000), 100000));
        transactionInfoList.add(new TransactionInfo(TransactionType.INCOMING, TransactionState.ACCEPTED, new Client("c007", 7000),50000));
    }

    public void addEntry(TransactionInfo transactionInfo) {
        transactionInfoList.add(transactionInfo);
    }
}
