
package toolkit;

import java.util.ArrayList;
import java.util.List;

public class WildcardUtils {

    public static double sum(List<? extends Number> numbers) {
        double total = 0;

        for (Number number : numbers) {
            total += number.doubleValue();
        }

        return total;
    }

    public static void addNumbers(List<? super Integer> destination) {
        destination.add(10);
        destination.add(20);
        destination.add(30);
    }

    public static void printList(List<?> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
