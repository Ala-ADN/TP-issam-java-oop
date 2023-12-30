package Shopping;

public class Order {
    private String username;
    private Cart purchases;
    private Shipping shipping;

    public Order(String username, Cart purchases, Shipping shipping) {
        this.username = username;
        this.purchases = purchases;
        this.shipping = shipping;
    }

    public String getUsername() { return this.username; }
    public Cart getCart() { return this.purchases; }

    public void printDetails(){
        System.out.println("Customer: " + this.username);
        System.out.println("Purchases: ");
        this.purchases.viewCart();
    }

}
