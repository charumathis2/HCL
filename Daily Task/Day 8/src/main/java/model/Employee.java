
package model;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Comparable sorts employees by ID in ascending order.
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Employees with the same ID are considered equal.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;

        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    // Must use the same ID field as equals().
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id
                + ", Name: " + name
                + ", Department: " + department
                + ", Salary: " + salary;
    }
}
