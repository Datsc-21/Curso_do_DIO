//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    printEmployee(new Manager());
        printEmployee(new Salesman());

  }

    //Método
    public static void printEmployee(Employee employee) {
        System.out.printf("=======%s===========\n", employee.getClass().getCanonicalName());

        switch (employee){
            case Manager manager ->{
                manager.setCode("123");
                manager.setName("Maria");
                manager.setSalary(5000);
                manager.setLogin("Maria");
                manager.setPassword("1234");
                manager.getCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getName());
                System.out.println(manager.getCommission());
            }

            case Salesman salesman -> {
               salesman.setCode("456");
                salesman.setName("Maria");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);


                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
            }
        }
        System.out.println("====================");
    }

}