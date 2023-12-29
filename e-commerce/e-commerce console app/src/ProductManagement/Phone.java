package ProductManagement;

import java.util.Scanner;

public class Phone extends Product{
    private int ram;
    private int storage;
    private int size;

    public Phone(Scanner sc) {
        super(sc);
        System.out.println("Enter RAM: ");
        this.ram = sc.nextInt();
        System.out.println("Enter storage: ");
        this.storage = sc.nextInt();
        System.out.println("Enter size: ");
        this.size = sc.nextInt();
        sc.nextLine();
    }

    public Phone(String name, double price, int quantity, int ram, int storage, int size) {
        super(name, price, quantity);
        this.ram = ram;
        this.storage = storage;
        this.size = size;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Storage: " + this.storage + "GB");
        System.out.println("Size: " + this.size +" inches");
        System.out.println("Price: " + this.price + "TND");
        System.out.println("Quantity: " + this.quantity);
    }

    public String getCategory() { return "Phone"; }

    public Product clone() {
        return new Phone(this.name, this.price, this.quantity, this.ram, this.storage, this.size);
    }

    public void update(Scanner sc) {
        System.out.println("Enter new name: ");
        this.name = sc.nextLine();
        System.out.println("Enter new price: ");
        this.price = sc.nextDouble();
        System.out.println("Enter new quantity: ");
        this.quantity = sc.nextInt();
        System.out.println("Enter new RAM: ");
        this.ram = sc.nextInt();
        System.out.println("Enter new storage: ");
        this.storage = sc.nextInt();
        System.out.println("Enter new size: ");
        this.size = sc.nextInt();
        sc.nextLine();
        System.out.println("Product updated successfully");
    }
}
