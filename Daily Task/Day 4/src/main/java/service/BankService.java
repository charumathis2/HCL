
package service;

import model.BankAccount;

public class BankService {

    public void displayBalance(BankAccount account) {
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void depositMoney(BankAccount account, double amount) {
        account.deposit(amount);
        System.out.println("Deposit operation completed.");
    }

    public void withdrawMoney(BankAccount account, double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawal operation completed.");
    }
}
