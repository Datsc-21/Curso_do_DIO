import br.com.dio.expcetion.AccountNotFoundException;
import br.com.dio.expcetion.NotFoundsEnoughException;
import br.com.dio.expcetion.WalletNotFoundException;
import br.com.dio.repository.AccountRepository;
import br.com.dio.repository.InvestmentRepository;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static AccountRepository accountRepository = new AccountRepository();
    private final static InvestmentRepository investmentRepository = new InvestmentRepository();

    static Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    public static void main(String[] args){
        System.out.println("Olá, seja bem-vindo ao DIO bank");
        while(true){
            System.out.println("Selecione a operação desejada");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Criar um investimento");
            System.out.println("3 - Criar uma carteira de investimento");
            System.out.println("4 - Depositar na conta");
            System.out.println("5 - Sacar da conta");
            System.out.println("6 - Transferência entre contas");
            System.out.println("7 - Investir");
            System.out.println("8 - Sacar investimento");
            System.out.println("9 - Listar contas");
            System.out.println("10 - Listar Investimentos");
            System.out.println("11 - Listar carteiras de investimento");
            System.out.println("12 - Atualizar investimentos");
            System.out.println("13 - Histórico de Conta");
            System.out.println("14 - Sair");
            var option = scanner.nextInt();
            switch (option){
                case 1 -> createAccount();
                case 2 -> createInvestment();
                case 3 -> createWalletInvestment();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> transferToAccount();
                case 7 -> incInvestment();
                case 8 -> rescueInvestment();
                case 9 ->  accountRepository.list().forEach(System.out::println);
                case 10 ->  investmentRepository.list().forEach(System.out::println);
                case 11 -> investmentRepository.listWallets().forEach(System.out::println);
                case 12 -> {
                    investmentRepository.updateAmount();
                    System.out.println("Investimento reajustado");
                }
                case 13 -> checkHistory();
                case 14 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }
        }
    }

    private static void createAccount(){
        System.out.println("Informe as chaves pix (separadas por ';')");
        var pix = Arrays.stream(scanner.next().split(";")).toList();
        System.out.println("Informe o valor inicial de depósito");
        var amount = scanner.nextLong();
        var wallet = accountRepository.create(pix, amount);
        System.out.println("Conta criada: " + wallet);
    }

    private static void createInvestment(){
        System.out.println("Informe a taxa do investimento");
        var tax = scanner.nextInt();
        System.out.println("Informe o valor inicial de depósito");
        var initialFunds = scanner.nextLong();
        var investment = investmentRepository.create(tax, initialFunds);
        System.out.println("Investimento criado: " + investment);
    }

    private static void withdraw(){
        System.out.println("Informe a chave pix da conta para saque");
        var pix = scanner.next();
        System.out.println("Informe o valor que será sacado: ");
        var amount = scanner.nextLong();
        try{
            accountRepository.withdraw(pix, amount);
        }catch ( NotFoundsEnoughException | AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void deposit(){
        System.out.println("Informe a chave pix da conta para depósito");
        var pix = scanner.next();
        System.out.println("Informe o valor que será depositado: ");
        var amount = scanner.nextLong();
        try{
            accountRepository.deposit(pix, amount);
        }catch (AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void transferToAccount(){
        System.out.println("Informe a chave pix da conta de origem:");
        var source = scanner.next();
        System.out.println("Informe a chave pix da conta de destino: ");
        var target = scanner.next();
        System.out.println("Informe o valor que será depositado: ");
        var amount = scanner.nextLong();
        try{
            accountRepository.transferMoney(source, target, amount);
        }catch (AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void createWalletInvestment(){
        System.out.println("Informe a chave pix da conta:");
        var pix = scanner.next();
        var account = accountRepository.findByPix(pix);
        System.out.println("Informe o identificador do investimento");
        var investmentId = scanner.nextInt();
        var investmentWallet = investmentRepository.initInvestment(account, investmentId);
        System.out.println("Conta de investimento criada: " + investmentWallet);
    }

    private static void incInvestment(){
        System.out.println("Informe a chave pix da conta para investimento");
        var pix = scanner.next();
        System.out.println("Informe o valor que será investido: ");
        var amount = scanner.nextLong();
        try{
            accountRepository.deposit(pix, amount);
        }catch (WalletNotFoundException | AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void rescueInvestment(){
        System.out.println("Informe a chave pix da conta para resgate do investimento:");
        var pix = scanner.next();
        System.out.println("Informe o valor que será sacado: ");
        var amount = scanner.nextLong();
        try{
            investmentRepository.withdraw(pix, amount);
        }catch ( NotFoundsEnoughException | AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void checkHistory(){
        System.out.println("Informe a chave pix da conta para verificar extrato:");
        var pix = scanner.next();
        try{
            // Supondo que getHistory retorna Map<LocalDateTime, List<MoneyAudit>>
            var sortedHistory = accountRepository.getHistory(pix);
            for (Map.Entry<java.time.LocalDateTime, List<br.com.dio.model.MoneyAudit>>
                    entry : sortedHistory.entrySet()) {
                java.time.LocalDateTime data = entry.getKey();
                List<br.com.dio.model.MoneyAudit> lista = entry.getValue();
                if (!lista.isEmpty()) {
                    var primeiraTransacao = lista.get(0);
                    System.out.println(data.format(FORMATTER));
                    System.out.println(primeiraTransacao.transactionId());
                    System.out.println(primeiraTransacao.description());
                    System.out.println("R$" + (lista.size() / 100) + "," + (lista.size() % 100));
                }
            }
        } catch (AccountNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}