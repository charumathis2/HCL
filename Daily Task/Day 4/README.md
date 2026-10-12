# Day 4 — OOP Concepts and IDE Debugging

## Objective
Practice Java OOP concepts and debug a logical error using Visual Studio Code.

## Concepts Covered
- Classes, fields, methods, and constructors
- Constructor chaining using `this()`
- Encapsulation and private fields
- Static variables and methods
- Packages and access modifiers
- Breakpoints and Step Over
- Variables, Watch expressions, and Call Stack
- Hot code replacement

## Project: Bank Account Simulator
Created a banking application using three classes:
- `BankAccount.java` — stores account details and manages balances.
- `BankService.java` — handles banking operations.
- `Main.java` — runs the application.

## Debugging Exercise
Identified a withdrawal bug where the balance was increased instead of decreased.

Incorrect statement:
`balance += amount;`

Corrected statement:
`balance -= amount;`

## Validation
- Initial balance: 0.0
- After deposit: 2000.0
- After withdrawing 500.0: 1500.0
- Second account balance: 5000.0
- Total accounts created: 2

## Result
Successfully corrected the withdrawal logic, tested the application, and practised debugging with VS Code.