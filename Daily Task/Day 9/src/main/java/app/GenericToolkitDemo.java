
package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import toolkit.Box;
import toolkit.GenericUtils;
import toolkit.Pair;
import toolkit.WildcardUtils;

public class GenericToolkitDemo {

    public static void main(String[] args) {

        
        Pair<String, Integer> pair = new Pair<>("Age", 20);
        System.out.println("Pair: " + pair);

        
        Box<Integer> box = new Box<>(100);
        System.out.println("Box value: " + box.getDoubleValue());

        
        System.out.println("Maximum integer: "
                + GenericUtils.max(10, 25));
        System.out.println("Maximum string: "
                + GenericUtils.max("Apple", "Mango"));

        
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        System.out.println("Sum: " + WildcardUtils.sum(numbers));

        List<Number> destination = new ArrayList<>();
        WildcardUtils.addNumbers(destination);
        System.out.println("Added numbers: " + destination);

     
        System.out.println("Printed list:");
        WildcardUtils.printList(Arrays.asList("Java", "Generics", "CSV"));
    }
}
