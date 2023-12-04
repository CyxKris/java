package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Library extends HashSet<Book> {

    void addToLibrary(Book book) {
        if (!this.contains(book)) {
            this.add(book);
        } else {
            System.out.println(book.title + " already exists in library!\n");
        }
    }

    void removeFromLibrary(Book book) {
        if (this.contains(book)) {
            this.remove(book);
        } else {
            System.out.println(book.title + " does not exist in library!\n");
        }
    }

    void displayBooks() {
        Iterator<Book> iterator = this.iterator();
        // String books;

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("----------BOOK----------\nTITLE: " + book.title + "\nAUTHOR: " + book.author + "\n\n");
        }

        // return "Books";
    }
}
