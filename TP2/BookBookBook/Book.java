package TP2.BookBookBook;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void displayInformation() {
        System.out.println("{Title: " + getTitle()+", Author: " + getAuthor()+", Year of publication: " + getYearOfPublication()+"}");
    }
}

