package ProductManagement;

import java.util.Scanner;

public class TestProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Desktop d = new Desktop("Dell", 1000, 10, "i7", "GTX 1050", 16);
        Laptop l = new Laptop("Asus", 1500, 5, "i7", "GTX 1050", 16, "1080p", 144);
        Phone p = new Phone("iPhone 3",100,5,6,64,17);
        Products.addProduct(d);
        Products.addProduct(l);
        Products.addProduct(p);
        Products.printInventory();
        Products.removeProduct("iPhone 3");
        Products.printInventory();
        Products.updateProduct("Dell",sc);
        Products.updateProduct("Asus",sc);
        Products.printInventory();
        Products.modifyQuantity("Dell", 5);
        Products.printInventory();
        Products.modifyQuantity("Asus", 5);
        Products.printInventory();
    }
}
