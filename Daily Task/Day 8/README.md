# Day 8 – Collections Framework Part 2

## Project: Employee Directory

A Java console application demonstrating the Collections Framework through employee lookup, department reports, salary ranking, and employee equality.

## Features
1. Store and search employees using `HashMap`.
2. Count employees by department using `Map.merge()`.
3. Generate alphabetically sorted department reports using `TreeMap`.
4. Sort employees by ID using `Comparable`.
5. Display the top five salaries using a `Comparator` chain.
6. Demonstrate the `equals()` and `hashCode()` contract with `HashSet`.

## Technologies
- Java
- Java Collections Framework
- VS Code

## Compile and Run

Open the terminal in the Day 8 project folder.

Compile the application:

```powershell
javac -d out src\main\java\model\Employee.java src\main\java\app\EmployeeDirectory.java src\main\java\app\EmployeeReports.java src\main\java\app\TopSalaryReport.java src\main\java\app\Main.java
```

Run the application:

```powershell
java -cp out app.Main
```

## Equality Demo

Compile and run the equality demonstration:

```powershell
javac -cp out -d out src\main\java\app\EmployeeEqualityDemo.java
java -cp out app.EmployeeEqualityDemo
```

## Learning Outcomes
Practiced hash-based lookup, frequency counting, sorted maps, employee comparison, salary ranking, and correct equality and hashing behavior.
