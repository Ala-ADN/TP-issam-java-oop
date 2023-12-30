package PaymentProcessing;

import java.util.Scanner;

public class MasterCard implements PaymentStartegy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public MasterCard(Scanner sc) {
        System.out.print("Enter card number: ");
        cardNumber = sc.nextLine();
        System.out.print("Enter cvv: ");
        cvv = sc.nextLine();
        System.out.print("Enter expiry date: ");
        expiryDate = sc.nextLine();
    }
    
    public boolean pay(double amount) {
        //connect to mastercard api to validate trasaction
        System.out.println("Paying " + amount + " using MasterCard");
        return true;
    }

}
