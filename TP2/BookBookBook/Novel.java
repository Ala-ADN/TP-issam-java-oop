package TP2.BookBookBook;

public class Novel extends Book {
    private String genre;
    private String summary;

    public Novel(String title, String author, int yearOfPublication, String genre, String summary) {
        super(title, author, yearOfPublication);
        this.genre = genre;
        this.summary = summary;
    }
    public String getGenre() {
        return genre;
    }
    public String getSummary() {
        return summary;
    }
    public void displayInformation() {
        System.out.println("{Title: " + getTitle()+", Author: " + getAuthor()+", Year of publication: " + getYearOfPublication()+", Genre: " + getGenre()+", Summary: " + getSummary()+"}");
    }
}
