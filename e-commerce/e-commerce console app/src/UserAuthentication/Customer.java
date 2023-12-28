package UserAuthentication;
import java.util.HashMap;
import java.util.Scanner;

import ProductManagement.Products;
import ProductManagement.Product;

public class Customer extends User {
    private double balance = 0.0;
    private HashMap<String,Product> cart = new HashMap<String,Product>();

    public Customer() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        this.balance = sc.nextDouble();
        sc.close();
    }
    
    public Customer(String username, String password, double balance) {
        super(username, password);
        this.balance = balance;
    }
    
    public void addToCart(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Product p = Products.getProduct(name);
        
        sc.close();
        if(p.getQuantity() > 0){
            cart.put(name, p);
        }
        else{
            System.out.println("Product out of stock");
        }
    }

    public void removeFromCart(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        sc.close();
        cart.remove(name);
    }

    public double getBalance() { return this.balance; }
    public void addBalance(double amount) { this.balance += amount; }

}
