
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import app.TopSalaryReport;
import model.Employee;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeDirectory directory = new EmployeeDirectory();
        EmployeeReports reports = new EmployeeReports();
        TopSalaryReport salaryReport = new TopSalaryReport();

        // Sample employees for testing the directory and reports.
        directory.addEmployee(new Employee(101, "Anu", "IT", 70000));
        directory.addEmployee(new Employee(102, "Bala", "HR", 50000));
        directory.addEmployee(new Employee(103, "Charan", "IT", 85000));
        directory.addEmployee(new Employee(104, "Divya", "Finance", 60000));
        directory.addEmployee(new Employee(105, "Ethan", "IT", 90000));
        directory.addEmployee(new Employee(106, "Farah", "HR", 75000));

        while (true) {
            System.out.println("\n=== Employee Directory ===");
            System.out.println("1. Display all employees");
            System.out.println("2. Search employee by ID");
            System.out.println("3. Show department counts");
            System.out.println("4. Show sorted department report");
            System.out.println("5. Show top 5 salaries");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    directory.displayAllEmployees();
                    break;

                case "2":
                    System.out.print("Enter employee ID: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine());
                        Employee employee = directory.findEmployee(id);

                        if (employee == null) {
                            System.out.println("Employee not found.");
                        } else {
                            System.out.println(employee);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid numeric ID.");
                    }
                    break;

                case "3":
                    Map<String, Integer> counts =
                            directory.countByDepartment();
                    System.out.println(counts);
                    break;

                case "4":
                    reports.displayDepartmentReport(
                            directory.countByDepartment());
                    break;

                
                case "5":
                    List<Employee> employees = directory.getAllEmployees();
                    salaryReport.displayTopFive(employees);
                    break;


                case "6":
                    System.out.println("Exiting Employee Directory.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
