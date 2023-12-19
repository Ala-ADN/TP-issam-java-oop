package TP2.BookBookBook;

public class LibraryCard {
    private int cardNumber;
    private String name;
    private int maxBooks;
    private int expirationYear;

    public LibraryCard(Person person,int cardNumber, int expirationYear) {
        this.cardNumber = cardNumber;
        this.name = person.getName();
        if (person instanceof Student) {
            this.maxBooks = 4;
        } else {
            this.maxBooks = 6;
        }
        this.expirationYear = expirationYear;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public String getName() {
        return name;
    }
    public int getMaxBooks() {
        return maxBooks;
    }
    public int getExpirationYear() {
        return expirationYear;
    }
}
    


