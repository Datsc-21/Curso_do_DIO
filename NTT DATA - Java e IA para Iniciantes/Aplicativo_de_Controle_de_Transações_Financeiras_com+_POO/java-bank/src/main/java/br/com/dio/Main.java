package br.com.dio;

import br.com.dio.repository.AccountRepository;
import br.com.dio.repository.InvestmentRespository;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {

    private final static AccountRepository accountRepository = new AccountRepository();
    private final static InvestmentRespository investmentRepository = new InvestmentRespository();

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Ola seja vem vindo ao DIO bank");
        while(true){
            System.out.println("Selecione a operação desejada");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Criar um investimento");
            System.out.println("3 - fazer um investimento");
            System.out.println("4 - Depositar na conta");
            System.out.println("5 - Sacar da conta");
            System.out.println("6 - Tranferencia entre contas");
            System.out.println("7 - Investir");
            System.out.println("8 - Sacar investiento");
            System.out.println("9 - Listar contas");
            System.out.println("10 - Liatar Investimentos");
            System.out.println("11 - Listar carteiras de investimento");
            System.out.println("12 - Listar contas de investimento");
            System.out.println("13 - Atualizar investimentos");
            System.out.println("14 - Historico de Conta");
            System.out.println("15 - ");
            var option = scanner.nextInt();
            switch (option){
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                case 10:
                case 11 :
                case 12 :
                case 13 :
                case 14 :
                case 15 : System.exit(0);
                default: System.out.println("Opção Inválida");
            }
        }
    }
}
