import java.time.OffsetDateTime;

public class Person {

    private String name;

    private int age;

    public Person(){}


    private int lastYearAgeInc = OffsetDateTime.now().getYear() -1;
    
    //Construtor
    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    
    //Esses são os métodos GETs que protegerar de Vulnerabilidades
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();

    }
}


