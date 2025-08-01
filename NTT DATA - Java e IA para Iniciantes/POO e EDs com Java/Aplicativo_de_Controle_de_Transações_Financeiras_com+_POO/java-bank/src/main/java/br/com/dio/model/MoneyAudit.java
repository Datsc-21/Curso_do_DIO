package br.com.dio.model;

import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.UUID;


public record MoneyAudit(
        UUID transactionId, //Transação do histórico
        BankService targetService, //Serviço que foi usado nessa transação
        String description, //Descrição dela
        OffsetDateTime createdAt //E data e hora que ocorreu
)
{





}
