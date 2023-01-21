package com.example.s24729bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private final List<Client> clientList = new ArrayList<>();

    public ClientStorage() {
        clientList.add(new Client("c001", 10000));
        clientList.add(new Client("c002", 15000));
        clientList.add(new Client("c003", 30000));
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void addClientToList(Client client) {
        clientList.add(client);
    }
}
