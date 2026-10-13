
package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIteratorDemo {

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        books.add("Java");
        books.add("Python");
        books.add("SQL");

        // Iterator traverses the collection in the forward direction.
        System.out.println("Using Iterator:");
        Iterator<String> iterator = books.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ListIterator supports both forward and backward traversal.
        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = books.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
