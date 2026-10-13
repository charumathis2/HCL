
package app;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.Employee;

public class TopSalaryReport {

    // Sort by salary descending, then name alphabetically.
    public void displayTopFive(List<Employee> employees) {

        List<Employee> topFive = employees.stream()
                .sorted(
                    Comparator.comparingDouble(Employee::getSalary)
                            .reversed()
                            .thenComparing(Employee::getName)
                )
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("\n--- Top 5 Salaries ---");

        for (Employee employee : topFive) {
            System.out.println(employee);
        }
    }
}
