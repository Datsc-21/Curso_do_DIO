import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var male = new Person("João");
    male.setAge(12);
    var female = new Person("Maria");
    female.setAge(10);

    System.out.println("Male name: " + male.getName() + ", age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + ", age: " + female.getAge());



    }
}