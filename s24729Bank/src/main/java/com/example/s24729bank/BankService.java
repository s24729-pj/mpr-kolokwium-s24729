package com.example.s24729bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {
    private final TransactionStorage transactionStorage;
    private final ClientStorage clientStorage;

    public BankService(TransactionStorage transactionStorage, ClientStorage clientStorage) {
        this.transactionStorage = transactionStorage;
        this.clientStorage = clientStorage;
    }

    public Client registerClient(String id, double balance) {
        Client client = new Client(id, balance);
        clientStorage.addClientToList(client);
        return client;
    }

    public TransactionInfo outgoingTransfer(String clientId, double amount) {
        if(findClientById(clientId) != null) {
            Client client = findClientById(clientId);
            client.removeFromBalance(amount);
            TransactionInfo transactionInfo = new TransactionInfo(TransactionType.OUTGOING, TransactionState.ACCEPTED, client, amount);
            transactionStorage.addEntry(transactionInfo);
            return transactionInfo;
        }
        return null;
    }

    public TransactionInfo incomingTransfer(String clientId, double amount) {
        if(findClientById(clientId) != null) {
            Client client = findClientById(clientId);
            client.addToBalance(amount);
            TransactionInfo transactionInfo = new TransactionInfo(TransactionType.OUTGOING, TransactionState.ACCEPTED, client, amount);
            transactionStorage.addEntry(transactionInfo);
            return transactionInfo;
        }
        return null;
    }

    private Client findClientById(String clientId) {
        for (Client client : clientStorage.getClientList()) {
            if(client.getId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }

    public void showClientInfo(String clientId) {
        Client client = findClientById(clientId);
        System.out.println(client);
    }

    public List<Client> getAllClients() {
        return clientStorage.getClientList();
    }
}
