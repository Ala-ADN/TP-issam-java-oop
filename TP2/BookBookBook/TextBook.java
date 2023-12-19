package TP2.BookBookBook;

public class TextBook extends Book {
    private String subject;

    public TextBook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void displayInformation() {
        System.out.println("{Title: " + getTitle()+", Author: " + getAuthor()+", Year of publication: " + getYearOfPublication()+", Subject: " + getSubject()+"}");
    }
}
