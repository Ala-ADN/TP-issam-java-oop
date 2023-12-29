package UserAuthentication;
import java.util.Scanner;

public class Signup {
    public static void addAdmin(Scanner sc){
        if(Admin.exists()){
            System.out.println("Admin already exists!");
            return;
        }
        Admin admin = new Admin(sc);
        Users.addUser(admin);
        Admin.setexists();
    }

    public static void addAdmin(String username, String password){
        if(Admin.exists()){
            System.out.println("Admin already exists!");
            return;
        }
        Admin admin = new Admin(username, password);
        Users.addUser(admin);
        Admin.setexists();
    }

    public static void addCustomer(Scanner sc){
        if(!Admin.exists()){
            System.out.println("Must add admin first!");
            return;
        }
        Customer customer = new Customer(sc);
        Users.addUser(customer);
    }

    public static void addCustomer(String username, String password){
        if(!Admin.exists()){
            System.out.println("Must add admin first!");
            return;
        }
        Customer customer = new Customer(username, password);
        Users.addUser(customer);
    }
}
