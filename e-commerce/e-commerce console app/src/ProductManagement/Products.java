package ProductManagement;

import java.util.HashMap;

public class Products {
    private static HashMap<String, Product> Products = new HashMap<String, Product>();

    public static void addProduct(Product Product) {
        if(Products.containsKey(Product.getName())){
            System.out.println("Product already exists!");
            return;
        }
        Products.put(Product.getName(), Product);
        System.out.println("Product added successfully!");
    }

    public static void removeProduct(String name) {
        if(!Products.containsKey(name)){
            System.out.println("Product does not exist!");
            return;
        }
        Products.remove(name);
        System.out.println("Product removed successfully!");
    }

    public static Product getProduct(String name) {
        if(!Products.containsKey(name)){
            System.out.println("Product does not exist!");
            return null;
        }
        return Products.get(name);
    }

    public static void updateProduct(String name) {
        if(!Products.containsKey(name)){
            System.out.println("Product does not exist!");
            return;
        }
        Product p = Products.get(name);
        p.update();
    }


    public static void printInventory() {
        for (String name : Products.keySet()) {
            Products.get(name).printDetails();
        }
    }
}
