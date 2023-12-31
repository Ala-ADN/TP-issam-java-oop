package UserAuthentication;

import java.util.Scanner;

import ProductManagement.*;
import Shopping.Orders;

public class Admin extends User {
    private static boolean exists = false;
    public Admin(Scanner sc) {
        super(sc);
    }

    public Admin(String username, String password) {
        super(username, password);
    }
    
    public void addProduct(Scanner sc){
        System.out.print("Enter category[Desktop/Laptop/Phone]: ");
        String category = sc.nextLine();
        switch (category) {
            case "Desktop":
                Desktop d = new Desktop(sc);
                Products.addProduct(d);
                break;
            case "Laptop":
                Laptop l = new Laptop(sc);
                Products.addProduct(l);
                break;

            case "Phone":
                Phone p = new Phone(sc);
                Products.addProduct(p);
                break;
        
            default:
                System.out.println("Invalid category");
                break;
        }
    }

    public void removeProduct(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Products.removeProduct(name);
    }

    public void updateProduct(Scanner sc){
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        Product p = Products.getProduct(name);
        p.update(sc);
    }

    public void banUser(Scanner sc){
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        User u = Users.getUser(username);
        if(u == null){
            System.out.println("User does not exist!");
            return;
        }
        Users.removeUser(username);
        System.out.println("User banned successfully!");
    }

    public void printDetails(){
        System.out.println("Admin: " + this.username);
    }


    @Override
    public boolean isAdmin() { return true; }

    public static void setexists() { exists = true; }
    public static boolean exists() { return exists; }

    @Override
    public void UserMenu(Scanner sc) {
        boolean exit = false;
        while (!exit) {
            System.out.println("================================");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product");
            System.out.println("4. View product");
            System.out.println("5. View inventory");
            System.out.println("6. Search product");
            System.out.println("7. Ban user");
            System.out.println("8. View orders");
            System.out.println("9. Logout");
            System.out.println("================================");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    removeProduct(sc);
                    break;
                case 3:
                    updateProduct(sc);
                    break;
                case 4:
                    viewProduct(sc);
                    break;
                case 5:
                    viewInventory();
                    break;
                case 6:
                    dynamicSearch(sc);
                    break;
                case 7:
                    banUser(sc);
                    break;
                case 8:
                    Orders.printOrders();
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin(sc);
        a.UserMenu(sc);
    }
}
