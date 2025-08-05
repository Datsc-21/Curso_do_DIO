import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("====================================");
        System.out.println(persistence.write("Danny;danny@gmail.com;15/01/1990;"));
        System.out.println("====================================");
        System.out.println(persistence.write("Maria;maria@gmail.com;23/10/2002;"));
        System.out.println("====================================");
        System.out.println(persistence.write("João;joao@gmail.com;01/12/1995;"));
        System.out.println("====================================");
        System.out.println(persistence.findAll());
        System.out.println("====================================");
        System.out.println(persistence.remover("/01/19"));
        System.out.println("====================================");
        System.out.println(persistence.remover("/06/202"));
        System.out.println("====================================");
        System.out.println(persistence.findBy("Danny;"));
        System.out.println("====================================");
        System.out.println(persistence.findBy(";maria@;"));
        System.out.println("====================================");
        System.out.println(persistence.findBy("95;"));
        System.out.println("====================================");
        System.out.println(persistence.replace(".com;15/01/", "Deka;deka@gmail.com;23/02/1993"));
        System.out.println("====================================");
        System.out.println(persistence.findAll()); */

        FilePersistence persistence = new NOFilePersistence("user.csv");





    }
}