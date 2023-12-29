package Shopping;

import java.util.HashMap;
import java.util.Scanner;

import ProductManagement.Product;
import ProductManagement.Products;

public class Cart {
    private HashMap<String,Product> cart = new HashMap<String,Product>();
    private double total = 0.0;

    public void addToCart(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        if(!Products.exists(name)) {
            System.out.println("Product does not exist!");
            return;
        }
        Product p = Products.getProduct(name).clone();
        if(p.getQuantity() == 0){
            System.out.println("Product out of stock");
            return;
        }
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        while(quantity > p.getQuantity()) {
            System.out.println("Quantity not available");
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
        }
        p.setQuantity(quantity);
        Products.modifyQuantity(name, -quantity);
        total += p.getPrice() * quantity;
        if(cart.containsKey(name)){
            Product p1 = cart.get(name);
            p1.addQuantity(quantity);
            cart.put(name, p1);
        }
        else
            cart.put(name, p);
    }

    public void removeFromCart(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Product p = cart.get(name);
        Products.modifyQuantity(name, p.getQuantity());
        total -= p.getPrice() * p.getQuantity();
        cart.remove(name);
    }

    public void modifyProductQuantity(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Product p = cart.get(name);
        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        while(quantity > p.getQuantity()) {
            System.out.println("Quantity not available");
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();
        }
        Products.modifyQuantity(name, quantity - p.getQuantity());
        p.setQuantity(quantity);
        total += p.getPrice() * quantity;

    }

    public void viewCart(){
        for (String name : cart.keySet()) {
            Product p = cart.get(name);
            p.printDetails();
        }
    }

    public double getTotal() { return this.total; }

    public double checkout(double balance,String username){
        if(balance < total){
            System.out.println("Insufficient balance!");
            return balance;
        }
        for (String name : cart.keySet()) {
            Product p = cart.get(name);
            Products.modifyQuantity(name, -p.getQuantity());
        }
        balance -= total;
        Order o = new Order(username, this);
        Orders.addOrder(o);
        System.out.println("Checkout successful!");
        return balance;
    }

    public void dismissCart(){
        for (String name : cart.keySet()) {
            Product p = cart.get(name);
            Products.modifyQuantity(name, p.getQuantity());
        }
        cart.clear();
    }
}
