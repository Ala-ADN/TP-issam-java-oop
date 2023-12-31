package PaymentProcessing;

public class Credit implements PaymentStrategy {
    private double balance;

    public Credit(double balance) {
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paying " + amount + " using Credit");
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }

}
