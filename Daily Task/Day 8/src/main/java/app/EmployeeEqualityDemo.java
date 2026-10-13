
package app;

import java.util.HashSet;
import java.util.Set;
import model.Employee;

public class EmployeeEqualityDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Anu", "IT", 70000);
        Employee e2 = new Employee(101, "Anu Updated", "HR", 80000);
        Employee e3 = new Employee(102, "Bala", "Finance", 60000);

        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("e1 equals e3: " + e1.equals(e3));

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Number of unique employees: " + employees.size());
        System.out.println("Employees: " + employees);
    }
}
