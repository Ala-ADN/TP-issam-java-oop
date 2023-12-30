package ProductManagement;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product {
    String name;
    double price;
    int quantity;
    ArrayList<Rating> ratings = new ArrayList<Rating>();
    double averageRating = 0;

    public Product(Scanner sc) {
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        do {
            System.out.print("Enter price: ");
            this.price = sc.nextDouble();
        } while (this.price < 0);
        do {
            System.out.print("Enter quantity: ");
            this.quantity = sc.nextInt();
        } while (this.quantity < 0);
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public int getQuantity() { return this.quantity; }
    
    public void setPrice(double price) { 
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive");
        }
     } 
    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative");
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }
    public void addQuantity(int quantity) { 
        if(this.quantity + quantity >= 0){
            this.quantity += quantity;
        }else{
            System.out.println("Quantity cannot be negative"+this.quantity+" "+quantity);
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }

    public void addRating(Scanner sc, String username) {
        System.out.print("Enter rating: ");
        int rating = sc.nextInt();
        for(Rating r : ratings) {
            if(r.getUsername().equals(username)) {
                int aux = r.getRating();
                r.setRating(rating);
                averageRating = (averageRating * ratings.size() - aux + rating) / ratings.size();
                return;
            }
        }
        if(rating < 0 || rating > 5) {
            System.out.println("Rating must be between 0 and 5");
            return;
        }
        ratings.add(new Rating(rating, username));
        averageRating = (averageRating * (ratings.size() - 1) + rating) / ratings.size();
    }

    public abstract void printDetails();
    public abstract String getCategory();
    public abstract void update(Scanner sc);
    public abstract Product clone();
}
