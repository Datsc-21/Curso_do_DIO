import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var option = -1;

        do{

            System.out.println("====Escolha uma das opçoes===");
            System.out.println("1 - Dar Banho no Pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampo da máquina");
            System.out.println("6 - Verificar se tem pet no banho   ");
            System.out.println("7 - Colocar o Pet na máquina   ");
            System.out.println("8 - Retirar o Pet da máquina   ");
            System.out.println("9 - LImpar a máquina   ");
            System.out.println("0 - Sair   ");
            option = scanner.nextInt();
        }while (option != 0);
    }



    


}