package TP2.BookBookBook;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        Teacher teacher = new Teacher("Kaabi", 30, "Electro", 123, 2027);
        Student student = new Student("Ala", 20, 456, 2022);
        TextBook textbook1 = new TextBook("ElectroMagnetics", "Kaabi", 1988, "Electro");
        TextBook textbook2 = new TextBook("Six easy pieces", "Richard Feynman", 1994, "Physics");
        Novel novel1 = new Novel("1984","George Orwell", 1949, "Dystopian", "Big Brother is watching");
        Novel novel2 = new Novel("The Hitchhiker\'s Guide to the Galaxy", "Douglas Adams", 1981, "Fantasy", "In the beginning the universe was created, this has made a lot of people very angry and been widely regarded as a bad move");
        library.addBook(textbook1);
        library.addBook(textbook2);
        library.addBook(novel1);
        library.addBook(novel2);
        System.out.println("Library books: ");
        library.listAllBooks();
        System.out.println("Teacher borrowing a book");
        teacher.borrowBook(textbook1, 2021, library);
        teacher.borrowBook(novel1, 2021, library);
        teacher.showBorrowedBooks();
        System.out.println("Library books: ");
        library.listAllBooks();
        System.out.println("Teacher returning a book");
        teacher.returnBook(textbook1, 2021, library);

        System.out.println("Student borrowing a book");
        student.borrowBook(textbook2, 2021, library);
        try {
            student.borrowBook(novel1, 2021, library);
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }

    }
}
