package TP1;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    int getAccountNumber() {
        return accountNumber;
    }
    String getAccountHolderName() {
        return accountHolderName;
    }
    int getBalance() {
        return balance;
    }
    void deposite(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException("invalid amount");
        }
        balance += amount;
    }
    void withdraw(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException("invalid amount");
        }
        if (amount > balance){
            throw new IllegalArgumentException("insufficient balance");
        }
        balance -= amount;
    }
    
}
