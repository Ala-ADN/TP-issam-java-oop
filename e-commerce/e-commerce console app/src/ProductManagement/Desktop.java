package ProductManagement;

import java.util.Scanner;

public class Desktop extends Product {
    protected String cpu;
    protected String gpu;
    protected int ram;

    public Desktop() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CPU: ");
        this.cpu = sc.nextLine();
        System.out.print("Enter GPU: ");
        this.gpu = sc.nextLine();
        System.out.print("Enter RAM: ");
        this.ram = sc.nextInt();
        sc.close();
    }

    public Desktop(String name, double price, int quantity, String cpu, String gpu, int ram) {
        super(name, price, quantity);
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("CPU: " + this.cpu);
        System.out.println("GPU: " + this.gpu);
        System.out.println("RAM: " + this.ram + "GB");
        System.out.println("Price: " + this.price + "TND");
        System.out.println("Quantity: " + this.quantity);
    }

    public String getCategory() { return "Desktop"; }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new name: ");
        this.name = sc.nextLine();
        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter new quantity: ");
        this.quantity = sc.nextInt();
        System.out.print("Enter new CPU: ");
        this.cpu = sc.nextLine();
        System.out.print("Enter new GPU: ");
        this.gpu = sc.nextLine();
        System.out.print("Enter new RAM: ");
        this.ram = sc.nextInt();
        sc.close();
    }
}
