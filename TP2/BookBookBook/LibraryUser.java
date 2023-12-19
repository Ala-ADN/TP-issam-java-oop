package TP2.BookBookBook;

public interface LibraryUser {
    void borrowBook(Book book, int year, Library library);
    void returnBook(Book book, int year, Library library);
}

