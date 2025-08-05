import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println(persistence.write("Danny;danny@gmail.com;12/02/2002"));
        System.out.println(persistence.write("Maria;maria@gmail.com;29/05/2002"));
        System.out.println(persistence.write("Luis;luis@gmail.com;19/02/2002"));
        System.out.println(persistence.findAll());


    }
}