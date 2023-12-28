package UserAuthentication;

import java.util.Scanner;

import ProductManagement.Desktop;
import ProductManagement.Laptop;
import ProductManagement.Phone;
import ProductManagement.Products;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String username, String password) {
        super(username, password);
    }
    
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category: ");
        sc.close();
        String category = sc.nextLine();
        switch (category) {
            case "Desktop":
                Desktop d = new Desktop();
                Products.addProduct(d);
                break;
            case "Laptop":
                Laptop l = new Laptop();
                Products.addProduct(l);
                break;

            case "Phone":
                Phone p = new Phone();
                Products.addProduct(p);
                break;
        
            default:
                System.out.println("Invalid category");
                break;
        }
    }

    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        sc.close();
        String name = sc.nextLine();
        Products.removeProduct(name);
    }


    @Override
    public boolean isAdmin() { return true; }
}
