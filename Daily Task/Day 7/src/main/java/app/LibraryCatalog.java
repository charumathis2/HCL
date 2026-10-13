
package app;

import java.util.ArrayList;
import java.util.List;
import model.Book;

public class LibraryCatalog {

    // ArrayList supports efficient index-based access for a catalogue.
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\n--- Library Catalogue ---");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
