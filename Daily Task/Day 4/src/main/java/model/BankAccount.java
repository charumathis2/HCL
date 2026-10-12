
package model;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    private static int accountCounter = 0;

    // Constructor 1
    public BankAccount(String accountHolder, String accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }

    // Constructor 2
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCounter++;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // BUG: should subtract
        }
    }


    public static int getAccountCounter() {
        return accountCounter;
    }
}
