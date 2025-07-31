package br.com.dio.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public abstract class Wallet {

    @Getter
    private final BankService serviceType;

    protected final List<Money> money;

    public Wallet(BankService serviceType) {
        this.serviceType = serviceType;
        this.money = new ArrayList<>();
    }

    //Gerar o nosso dinheiro
    protected List<Money> generateMoney(final long amount, final String description){



    }


    //É a propriedade para ver quantos de dinheiros temos na nossa conta
    public long getFunds(){
        return money.size();
    }



}
