package assignment;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void isTheSame(Book book) {
        System.out.println("----------BOOK ANALYSIS----------\n");
        System.out.println("BOOK 1: " + this.title + " By " + this.author);
        System.out.println("BOOK 2: " + book.title + " By " + book.author);

        if (this.title.equals(book.title) && this.author.equals(book.author)) {
            System.out.println("\nRESULT: These are indeed the same book.");
        } else if (this.author.equals(book.author)) {
            System.out.println("\nRESULT: These books where written by the same author.");
        } else if (this.title.equals(book.title)) {
            System.out.println("\nRESULT: These books have the same title.");
        } else {
            System.out.println("\nRESULT: There seems to be no similarities between both books.");
        }

        System.out.println("\n----------END OF ANALYSIS----------\n\n");
    }
}
