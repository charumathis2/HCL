
package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Employee;

public class EmployeeDirectory {

    // HashMap provides fast lookup using employee ID as the key.
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        System.out.println("Employee added: " + employee.getName());
    }

    // Finds an employee using their ID.
    public Employee findEmployee(int id) {
        return employees.get(id);
    }

    // Displays all employees stored in the directory.
    public void displayAllEmployees() {
        System.out.println("\n--- Employee Directory ---");

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    // Counts employees in each department using Map.merge().
    public Map<String, Integer> countByDepartment() {
        Map<String, Integer> counts = new HashMap<>();

        for (Employee employee : employees.values()) {
            counts.merge(employee.getDepartment(), 1, Integer::sum);
        }

        return counts;
    }

    // Returns all employees for sorting and salary reports.
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
}
