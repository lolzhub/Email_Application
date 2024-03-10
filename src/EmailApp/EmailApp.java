package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their first name
        String firstName = "";
        while (firstName.isEmpty()) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                System.out.println("First name cannot be empty. Please try again.");
            }
        }

        // Prompt the user to enter their last name
        String lastName = "";
        while (lastName.isEmpty()) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.println("Last name cannot be empty. Please try again.");
            }
        }

        // Create an instance of Email using the provided information
        Email email = new Email(firstName, lastName);

        // Loop for actions until the user exits
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Set Mailbox Capacity");
            System.out.println("2. Set Alternate Email");
            System.out.println("3. Change Password");
            System.out.println("4. View Info");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new mailbox capacity (in MB): ");
                    int newCapacity = scanner.nextInt();
                    email.setMailboxCapacity(newCapacity);
                    break;
                case 2:
                    scanner.nextLine(); // Consume newline left by nextInt()
                    System.out.print("Enter new alternate email: ");
                    String newAlternateEmail = scanner.nextLine().trim();
                    email.setAlternateEmail(newAlternateEmail);
                    break;
                case 3:
                    scanner.nextLine(); // Consume newline left by nextInt()
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine().trim();
                    email.changePassword(newPassword);
                    break;
                case 4:
                    System.out.println(email.showInfo());
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
