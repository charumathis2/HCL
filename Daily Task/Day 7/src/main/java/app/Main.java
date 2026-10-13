
package app;

import java.util.Scanner;
import model.Book;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryCatalog catalog = new LibraryCatalog();
        LibraryDeduplicator deduplicator = new LibraryDeduplicator();
        LibraryWaitlist waitlist = new LibraryWaitlist();
        FacultyPriorityQueue priorityQueue = new FacultyPriorityQueue();

        catalog.addBook(new Book(1, "Java Basics", "James"));
        catalog.addBook(new Book(2, "Python Basics", "Guido"));
        catalog.addBook(new Book(3, "SQL Fundamentals", "Date"));

        while (true) {
            System.out.println("\n=== Library Waitlist ===");
            System.out.println("1. Display catalogue");
            System.out.println("2. Remove duplicate titles");
            System.out.println("3. Add member to waitlist");
            System.out.println("4. Serve next member");
            System.out.println("5. Display waitlist");
            System.out.println("6. Add faculty priority request");
            System.out.println("7. Serve next priority request");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    catalog.displayBooks();
                    break;

                case "2":
                    String[] titles = {
                        "Java", "Python", "Java", "SQL", "Python"
                    };
                    System.out.println(
                        deduplicator.removeDuplicates(titles));
                    break;

                case "3":
                    System.out.print("Enter member name: ");
                    waitlist.addMember(sc.nextLine());
                    break;

                case "4":
                    waitlist.serveNextMember();
                    break;

                case "5":
                    waitlist.displayWaitlist();
                    break;

                case "6":
                    System.out.print("Enter faculty name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter priority (1 = highest): ");
                    try {
                        int priority = Integer.parseInt(sc.nextLine());
                        priorityQueue.addRequest(name, priority);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "7":
                    priorityQueue.serveNextRequest();
                    break;

                case "8":
                    System.out.println("Exiting Library Waitlist.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
