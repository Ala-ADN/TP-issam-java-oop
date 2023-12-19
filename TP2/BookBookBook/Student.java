package TP2.BookBookBook;

public class Student extends Person implements LibraryUser {
    private LibraryCard libraryCard;
    private Library borrowedBooks;

    public Student(String name, int age, int cardNumber, int expirationYear) {
        super(name, age);
        this.libraryCard = new LibraryCard(this, cardNumber, expirationYear);
        this.borrowedBooks = new Library(libraryCard.getMaxBooks());
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
        if(borrowedBooks.findBook(book.getTitle()) == -1) {
            throw new IllegalArgumentException("404 not found in borrowed books");
        }
        borrowedBooks.removeBook(book.getTitle());
        library.addBook(book);
    }
    public void showBorrowedBooks() {
        borrowedBooks.listAllBooks();
    }
}
