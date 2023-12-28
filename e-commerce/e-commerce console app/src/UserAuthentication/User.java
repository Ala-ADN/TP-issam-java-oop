package UserAuthentication;
import java.util.Scanner;

import ProductManagement.Product;
import ProductManagement.Products;

public abstract class User {
    protected String username;
    protected String password;

    public User() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = sc.nextLine();
        System.out.print("Enter password: ");
        this.password = sc.nextLine();
        sc.close();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public boolean isAdmin() { return false; }

    public void viewProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        sc.close();
        String name = sc.nextLine();
        Product p = Products.getProduct(name);
        p.printDetails();
    }

    public void viewInventory(){
        Products.printInventory();
    }
}
