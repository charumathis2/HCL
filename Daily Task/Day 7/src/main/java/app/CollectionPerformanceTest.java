
package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPerformanceTest {

    public static void main(String[] args) {
        int count = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Compare adding elements at the end.
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }
        long arrayAddTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        long linkedAddTime = System.nanoTime() - start;

        // Compare accessing elements by index.
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        long arrayAccessTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long linkedAccessTime = System.nanoTime() - start;

        System.out.println("Performance Comparison (nanoseconds)");
        System.out.println("------------------------------------");
        System.out.printf("%-25s %15s %15s%n",
                "Operation", "ArrayList", "LinkedList");
        System.out.printf("%-25s %15d %15d%n",
                "Add at end", arrayAddTime, linkedAddTime);
        System.out.printf("%-25s %15d %15d%n",
                "Access by index", arrayAccessTime, linkedAccessTime);
    }
}
