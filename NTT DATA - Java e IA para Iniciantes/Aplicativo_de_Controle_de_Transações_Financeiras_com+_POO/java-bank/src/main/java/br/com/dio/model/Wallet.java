package br.com.dio.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
public abstract class Wallet {

    @Getter
    private final BankService serviceType;

    protected final List<Money> money;


}
