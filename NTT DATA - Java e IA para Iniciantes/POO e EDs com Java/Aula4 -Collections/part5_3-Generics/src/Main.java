import dao.GenericDAO;
import dao.UserDAO;
import domain.UserDomain;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static GenericDAO<UserDomain> dao = new UserDAO();

    public static void main(String[] args) {

        var user = new UserDomain("Danny", 21);
  System.out.println(dao.count());
 System.out.println(dao.save(new UserDomain("Danny", 21)));
 System.out.println(dao.findAll());
        System.out.println(dao.count());
        dao.delete(new UserDomain("", -1));
dao.delete(user);
System.out.println(dao.findAll());
System.out.println(dao.count());

    }
}