
package app;

import java.util.Scanner;
import exception.InsufficientStockException;
import exception.InvalidQuantityException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrderProcessor processor = new OrderProcessor();

        while (true) {
            System.out.println("\n=== Order Processor ===");
            System.out.println("1. Place Order");
            System.out.println("2. View Stock");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();
                        processor.processOrder(quantity);
                        break;

                    case 2:
                        System.out.println(
                            "Available stock: " + processor.getStock());
                        break;

                    case 3:
                        System.out.println("Exiting Order Processor.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid menu choice.");
                }

            } catch (InsufficientStockException |
                     InvalidQuantityException e) {
                System.out.println("Order failed: " + e.getMessage());

            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();

            } finally {
                System.out.println("Order attempt completed.");
            }
        }
    }
}
