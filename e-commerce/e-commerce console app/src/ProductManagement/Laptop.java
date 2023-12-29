package ProductManagement;

import java.util.Scanner;

public class Laptop extends Desktop {
    private String resolution;
    private int refreshRate; 

    public Laptop(Scanner sc) {
        super(sc);
        System.out.print("Enter resolution: ");
        this.resolution = sc.nextLine();
        System.out.print("Enter refresh rate: ");
        this.refreshRate = sc.nextInt();
    }

    public Laptop(String name, double price, int quantity, String cpu, String gpu, int ram, String resolution, int refreshRate) {
        super(name, price, quantity, cpu, gpu, ram);
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("CPU: " + this.cpu);
        System.out.println("GPU: " + this.gpu);
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Refresh Rate: " + this.refreshRate);
        System.out.println("Price: " + this.price + "TND");
        System.out.println("Quantity: " + this.quantity);
    }

    @Override
    public String getCategory() { return "Laptop"; }

    @Override
    public Product clone() {
        return new Laptop(this.name, this.price, this.quantity, this.cpu, this.gpu, this.ram, this.resolution, this.refreshRate);
    }

    @Override
    public void update(Scanner sc) {
        System.out.print("Enter new name: ");
        this.name = sc.nextLine();
        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter new quantity: ");
        this.quantity = sc.nextInt();
        System.out.print("Enter new CPU: ");
        sc.nextLine();
        this.cpu = sc.nextLine();
        System.out.print("Enter new GPU: ");
        this.gpu = sc.nextLine();
        System.out.print("Enter new RAM: ");
        this.ram = sc.nextInt();
        System.out.print("Enter new resolution: ");
        sc.nextLine();
        this.resolution = sc.nextLine();
        System.out.print("Enter new refresh rate: ");
        this.refreshRate = sc.nextInt();
        sc.nextLine();
        System.out.println("Product updated successfully");
    }
}
