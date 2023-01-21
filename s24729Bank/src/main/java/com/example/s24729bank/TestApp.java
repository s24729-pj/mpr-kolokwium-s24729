package com.example.s24729bank;

import org.springframework.stereotype.Component;

@Component
public class TestApp {
    private BankService bankService;

    public TestApp(BankService bankService) {
        // Rejestracja klienta
        System.out.println("Klienci przed dodaniem nowego: " + bankService.getAllClients());
        bankService.registerClient("c004", 20000);
        System.out.println("Klienci po dodaniu nowego: " + bankService.getAllClients());

        // Zlecenie przelewu
        bankService.outgoingTransfer("c004", 3000);
        System.out.println("Klienci po przelewie wychodzącym od c004 (3000): " + bankService.getAllClients());

        // Wpłacenie pieniędzy na rachunek
        bankService.incomingTransfer("c004", 7000);
        System.out.println("Klienci po przelewie przychodzącym do c004 (7000): " + bankService.getAllClients());

        // Odczytanie danych klienta
        System.out.println("Wyświetlenie informacji o kliencie o id c001:");
        bankService.showClientInfo("c001");
    }
}
