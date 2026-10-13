
package app;

import java.util.LinkedHashSet;
import java.util.Set;

public class LibraryDeduplicator {

    // LinkedHashSet removes duplicates while preserving insertion order.
    public Set<String> removeDuplicates(String[] bookTitles) {

        Set<String> uniqueTitles = new LinkedHashSet<>();

        for (String title : bookTitles) {
            uniqueTitles.add(title);
        }

        return uniqueTitles;
    }
}
