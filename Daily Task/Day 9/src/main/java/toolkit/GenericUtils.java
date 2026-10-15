
package toolkit;

public class GenericUtils {

    public static <T extends Comparable<T>> T max(T first, T second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
