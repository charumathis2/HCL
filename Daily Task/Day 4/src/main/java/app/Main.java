
package app;

import model.BankAccount;
import service.BankService;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Charu", "ACC101");
        BankAccount account2 = new BankAccount("Priya", "ACC102", 5000.0);

        BankService service = new BankService();

        System.out.println("===== ACCOUNT 1 =====");
        service.displayBalance(account1);

        System.out.println("\n===== DEPOSIT MONEY =====");
        service.depositMoney(account1, 2000.0);
        service.displayBalance(account1);

        System.out.println("\n===== WITHDRAW MONEY =====");
        service.withdrawMoney(account1, 500.0);
        service.displayBalance(account1);

        System.out.println("\n===== ACCOUNT 2 =====");
        service.displayBalance(account2);

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getAccountCounter());
    }
}
