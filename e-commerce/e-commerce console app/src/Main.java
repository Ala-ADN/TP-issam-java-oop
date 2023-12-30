import ProductManagement.*;
import UserAuthentication.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This a sample main method to test the functionality of the app
        Scanner sc = new Scanner(System.in);

        //Initialize some products
        Desktop d = new Desktop("Dell", 1000, 10, "i7", "RTX 4080", 64);
        Laptop l = new Laptop("Asus", 1500, 5, "i7", "GTX 1050", 16, "1080p", 144);
        Phone p = new Phone("iPhone 3",100,5,6,64,17);
        Products.addProduct(d);
        Products.addProduct(l);
        Products.addProduct(p);

        //Initialize an admin, this is required for the system to be functional
        Signup.addAdmin("Admin", "Admin");

        //Initialize customers
        Signup.addCustomer("Customer1", "Password1");
        Signup.addCustomer("Customer2", "Password2");

        //Print all users
        System.out.println("All users in system:");
        Users.printUsers();

        //Sign in
        while(true){
            System.out.println("1.Sign up\n2.Sign in\n3.Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                Signup.addCustomer(sc);
            }
            else if(choice == 2){
                Signin.signin(sc);
                User u = Signin.getCurrentUser();
                u.UserMenu(sc);
                break;
            }
            else if(choice == 3){
                return;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}
