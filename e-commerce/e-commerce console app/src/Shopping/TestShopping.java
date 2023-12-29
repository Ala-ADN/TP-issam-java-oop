package Shopping;

import java.util.Scanner;

import ProductManagement.Desktop;
import ProductManagement.Laptop;
import ProductManagement.Phone;
import ProductManagement.Products;

public class TestShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Desktop d = new Desktop("Dell", 1, 1000000, "i7", "GTX 1050", 16);
        Laptop l = new Laptop("Asus", 1, 5, "i7", "GTX 1050", 16, "1080p", 144);
        Phone p = new Phone("iPhone 3",1,5,6,64,17);
        Products.addProduct(d);
        Products.addProduct(l);
        Products.addProduct(p);
        Cart c = new Cart();
        System.out.println("adding");
        c.addToCart(sc);
        Products.printInventory();
        c.viewCart();
        // System.out.println("adding");
        // c.addToCart(sc);
        // c.viewCart();
        // Products.printInventory();
        // System.out.println("adding");
        // c.addToCart(sc);
        
        System.out.println("Cart");
        System.out.println(c.getTotal());
        c.viewCart();
        c.removeFromCart(sc);
        System.out.println(c.getTotal());

        System.out.println("Inventory");
        Products.printInventory();
        // c.modifyProductQuantity(sc);

        // c.viewCart();

        // c.checkout(999999999, "ala");

        // Orders.printOrders();
    }
}
