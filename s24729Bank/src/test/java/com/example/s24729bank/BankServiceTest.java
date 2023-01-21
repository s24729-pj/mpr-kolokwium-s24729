package com.example.s24729bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BankServiceTest {
    @Mock
    private ClientStorage clientStorage;
    @Mock
    private TransactionStorage transactionStorage;
    @InjectMocks
    private BankService bankService;

    @Test
    void registerClient() {
        Client client = bankService.registerClient("c008", 500);
        assertThat(client).isNotNull();
    }
}