import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
var scanner = new Scanner(System.in);

        var option = -1;
        while (option != 5){
            System.out.println("Escolha uma opção");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            option = scanner.nextInt();

            if(option > 5 || option < 1){
                System.out.println("Selecione uma opção válida");
                continue;
            }

           if(option == 5) break;
        }

    }
}