package TP2.BookBookBook;

public class Library {
    private Book[] books;
    private int size;
    private int maxSize;

    public Library(int maxSize) {
        this.maxSize = maxSize;
        this.books = new Book[maxSize];
        this.size = 0;
    }
    public void addBook(Book book) {
        if (size == maxSize) {
            throw new IllegalArgumentException("Library is full");
        }
        books[size] = book;
        size++;
        System.out.println("Book added successfully");
    }
    public int findBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
    public int getSize() {
        return size;
    }
    public void removeBook(String title) {
        int index = findBook(title);
        if (index == -1) {
            throw new IllegalArgumentException("404 not found");
        }
        for (int i = index; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        size--;
        System.out.println("Book removed successfully");
    }
    public void listAllBooks() {
        for (int i = 0; i < size; i++) {
            books[i].displayInformation();
        }
    }
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Novel("The Hitchhiker\'s Guide to the Galaxy", "Douglas Adams", 1981, "Fantasy", "In the beginning the universe was created, this has made a lot of people very angry and been widely regarded as a bad move"));
        library.addBook(new TextBook("Six easy pieces", "Richard Feynman", 1994, "Physics"));
        library.listAllBooks();
        library.removeBook("The Hitchhiker\'s Guide to the Galaxy");
        library.listAllBooks();
    }
}
