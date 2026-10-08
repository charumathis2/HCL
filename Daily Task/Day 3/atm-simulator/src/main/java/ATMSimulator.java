import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;
        boolean authenticated = false;

        // 3 PIN attempts
        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (pin == correctPin) {
                authenticated = true;
                System.out.println("PIN verified successfully!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                }
            }
        }

        if (!authenticated) {
            System.out.println("Too many incorrect attempts. Account blocked.");
            scanner.close();
            return;
        }

        double balance = 10000.0;
        boolean running = true;

        // ATM menu
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount.");
                        continue;
                    }

                    balance += deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("New balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid amount.");
                        continue;
                    }

                    if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                        continue;
                    }

                    balance -= withdrawal;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Remaining balance: ₹" + balance);
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (running);

        scanner.close();
    }
}