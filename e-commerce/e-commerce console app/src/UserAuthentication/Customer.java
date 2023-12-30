package UserAuthentication;
import java.util.Scanner;

import PaymentProcessing.*;
import ProductManagement.Product;
import ProductManagement.Products;
import Shopping.Cart;

public class Customer extends User {
    private Credit credit;
    private Cart cart = new Cart();

    public Customer(Scanner sc) {
        super(sc);
    }
    
    public Customer(String username, String password) {
        super(username, password);
        this.credit = new Credit(0.0);
    }
    public double getBalance() { return this.credit.getBalance(); }
    public void addBalance(double amount) { this.credit.addBalance(amount); }

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

    public void addRating(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        if(!Products.exists(name)){
            System.out.println("Product does not exist!");
            return;
        }
        Product p = Products.getProduct(name);
        p.addRating(sc,this.username);
    }

    public void checkout(Scanner sc){
        System.out.print("Enter payment method[MasterCard/Edinar/Credits]: ");
        PayMethod payMethod = PayMethod.valueOf(sc.nextLine());
        switch (payMethod) {
            case Credit:
                if(!this.credit.pay(this.cart.getTotal())){
                    return;
                }
                break;
            case MasterCard:
                MasterCard masterCard = new MasterCard(sc);
                if(!masterCard.pay(this.cart.getTotal())){
                    return;
                }
                break;
            case EDinar:
                EDinar edinar = new EDinar(sc);
                if(!edinar.pay(this.cart.getTotal())){
                    return;
                }
                break;
            default:
                System.out.println("Invalid payment method");
                return;
        }
        this.cart.checkout(this.username,sc);
    }

    public void dismissCart(){
        cart.dismissCart();
    }

    public void printDetails(){
        System.out.println("Customer: " + this.username);
        System.out.println("Balance: " + this.credit.getBalance());
    }


    public void UserMenu(Scanner sc){
        int choice = 0;
        while(choice != 10){
            System.out.println("=========================");
            System.out.println("1. View product");
            System.out.println("2. View inventory");
            System.out.println("3. View cart");
            System.out.println("4. Add to cart");
            System.out.println("5. Remove from cart");
            System.out.println("6. Dismiss cart");
            System.out.println("7. Modify product quantity");
            System.out.println("8. Checkout");
            System.out.println("9. Search product");
            System.out.println("10. Logout");
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
                    checkout(sc);
                    break;
                case 9:
                    System.out.println("Searching");
                    dynamicSearch(sc);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
