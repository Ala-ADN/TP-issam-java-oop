package UserAuthentication;
import java.util.Scanner;

import Shopping.Cart;

public class Customer extends User {
    private double balance = 0.0;
    private Cart cart = new Cart();

    public Customer(Scanner sc) {
        super(sc);
    }
    
    public Customer(String username, String password) {
        super(username, password);
        this.balance = 0.0;
    }
    public double getBalance() { return this.balance; }
    public void addBalance(double amount) { this.balance += amount;} 

    public void viewCart(){
        cart.viewCart();
    }

    public void addToCart(Scanner sc){
        cart.addToCart(sc);
    }

    public void removeFromCart(Scanner sc){
        cart.removeFromCart(sc);
    }

    public void modifyProductQuantity(Scanner sc){
        cart.modifyProductQuantity(sc);
    }

    public void checkout(){
        this.balance = cart.checkout(this.balance, this.username);
        this.cart = new Cart();
    }

    public void dismissCart(){
        cart.dismissCart();
    }

    public void printDetails(){
        System.out.println("Customer: " + this.username);
        System.out.println("Balance: " + this.balance);
    }

    public void UserMenu(Scanner sc){
        int choice = 0;
        while(choice != 9){
            System.out.println("=========================");
            System.out.println("1. View product");
            System.out.println("2. View inventory");
            System.out.println("3. View cart");
            System.out.println("4. Add to cart");
            System.out.println("5. Remove from cart");
            System.out.println("6. Dismiss cart");
            System.out.println("7. Modify product quantity");
            System.out.println("8. Checkout");
            System.out.println("9. Exit");
            System.out.println("=========================");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewProduct(sc);
                    break;
                case 2:
                    viewInventory();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    addToCart(sc);
                    break;
                case 5:
                    removeFromCart(sc);
                    break;
                case 6:
                    dismissCart();
                    break;
                case 7:
                    modifyProductQuantity(sc);
                    break;
                case 8:
                    checkout();
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
