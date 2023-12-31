package PaymentProcessing;

import java.util.Scanner;

public class EDinar implements PaymentStrategy{
    private String cardNumber;
    private String cvv;

    public EDinar(Scanner sc) {
        System.out.print("Enter card number: ");
        cardNumber = sc.nextLine();
        System.out.print("Enter cvv: ");
        cvv = sc.nextLine();
    }

    public boolean pay(double amount) {
        //connect to edinar api (if there is one) to validate trasaction
        System.out.println("Paying " + amount + " using EDinar");
        return true;
    }
}
