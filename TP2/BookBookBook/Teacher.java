package TP2.BookBookBook;

public class Teacher extends Person implements LibraryUser {
    private String Subject;
    private LibraryCard libraryCard;
    private Library borrowedBooks;
    private Library researchBooks;

    public Teacher(String name, int age, String Subject, int cardNumber, int expirationYear) {
        super(name, age);
        this.Subject = Subject;
        this.libraryCard = new LibraryCard(this, cardNumber, expirationYear);
        this.borrowedBooks = new Library(libraryCard.getMaxBooks());
        this.researchBooks = new Library(libraryCard.getMaxBooks());
    }
    public void borrowBook(Book book, int year, Library library) {
        if(year > libraryCard.getExpirationYear()) {
            throw new IllegalArgumentException("Library card has expired, please renew");
        }
        if(borrowedBooks.getSize() == libraryCard.getMaxBooks()) {
            throw new IllegalArgumentException("You cannot borrow more than " + libraryCard.getMaxBooks() + " books");
        }
        if(library.findBook(book.getTitle()) == -1) {
            throw new IllegalArgumentException("Book not found in library");
        }
        if(book instanceof TextBook && ((TextBook) book).getSubject() == Subject && researchBooks.getSize() == libraryCard.getMaxBooks()) {
            researchBooks.addBook(book);
        }
        borrowedBooks.addBook(book);
        library.removeBook(book.getTitle());
    }
    public void returnBook(Book book, int year, Library library) {
        if(year > libraryCard.getExpirationYear()) {
            throw new IllegalArgumentException("Library card has expired, please renew");
        }
        if (borrowedBooks.getSize() == 0) {
            throw new IllegalArgumentException("No books to return");
        }
        if(borrowedBooks.findBook(book.getTitle()) != -1) {
            borrowedBooks.removeBook(book.getTitle());
            library.addBook(book);
        }else if(researchBooks.findBook(book.getTitle()) != -1) {
            researchBooks.removeBook(book.getTitle());
            library.addBook(book);
        }else {
            throw new IllegalArgumentException("404 not found in borrowed books");
        }
    }
    public void showBorrowedBooks() {
        borrowedBooks.listAllBooks();
    }
}
