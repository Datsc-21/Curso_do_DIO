import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("James");
        model.setBirthday(LocalDate.now().minusYears(20));

        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Maria");
        dto.setBirthday(LocalDate.now().minusYears(30));
    }
}
