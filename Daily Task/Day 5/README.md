# Day 5 – Inheritance, Polymorphism and Git Branching

## Objective
To implement a payment hierarchy using Java inheritance, abstract classes, interfaces, method overriding, and runtime polymorphism.

## Concepts Covered
- Abstract class: `Payment`
- Inheritance: `CardPayment`, `UPIPayment`, and `CashPayment`
- Interface: `Refundable`
- Method overriding using `@Override`
- Runtime polymorphism using a `Payment` array
- Git branching and merging

## Payment Hierarchy
- `Payment` – Base abstract class that stores the payment amount.
- `CardPayment` – Processes card payments.
- `UPIPayment` – Processes UPI payments.
- `CashPayment` – Processes cash payments.
- `Refundable` – Defines the refund operation.
- `RefundableCardPayment` – Extends `CardPayment` and implements `Refundable`.

## Execution
Compile the Java source files and run `app.Main`.

## Expected Result
The program displays payment methods and their amounts, followed by a successful refund message.