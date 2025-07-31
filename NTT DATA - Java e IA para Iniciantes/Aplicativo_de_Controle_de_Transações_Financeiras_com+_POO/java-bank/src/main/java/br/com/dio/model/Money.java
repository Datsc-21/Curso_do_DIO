package br.com.dio.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
public class Money {

private final List<MoneyAudir> history = new ArrayList<>();

    //Quando for criar o dinheiro, mas com o historico dele
public Money(final MoneyAudir history){ this.history.add(history);}

public void addHistory(final MoneyAudir history){this.history.add(history); }

}
