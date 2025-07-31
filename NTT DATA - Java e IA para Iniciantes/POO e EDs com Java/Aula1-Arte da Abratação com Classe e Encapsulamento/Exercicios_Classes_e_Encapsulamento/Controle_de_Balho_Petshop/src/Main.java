import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
private final static Scanner scanner = new Scanner(System.in);

private final static PetMachine petMachine = new PetMachine();

public class Main {
    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
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

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfhasPetInMachine();
                case 7 ->  setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }

        }while (true);
    }
    private static void setWater(){
        System.out.println("Tentando colocar agua na máquina");
        petMachine.addWater();
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar Shampoo na máquina");
        petMachine.addShampoo();
    }



    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquna está no momento com" + amount + "litro(s) de água ");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquna está no momento com" + amount + "litro(s) de shcampoo ");
    }

    private static void checkIfhasPetInMachine() {
       var hasPet = petMachine.hasPet();
       System.out.println(hasPet ? "Tem pet na máquina" : "Não tem Pet na máquina");
    }


    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
             name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
}



}