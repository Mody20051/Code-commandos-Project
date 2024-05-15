package Resources;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBankingSystem {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public OnlineBankingSystem() {
        // Initialize with some hardcoded users
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
    }

    public void registerUser() {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        // Check if the username already exists
        boolean userExists = false;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                userExists = true;
                break;
            }
        }

        if (userExists) {
            System.out.println("Username already exists. Please try a different username.");
        } else {
            users.add(new User(username, password));
            System.out.println("Registration successful. You can now log in.");
        }
    }

    public void loginUser(String username, String password) {
        // Check credentials against the user list
        boolean loggedIn = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedIn = true;
                break;
            }
        }

        if (loggedIn) {
            System.out.println("Login Successfully");
            // Show the next menu after successful login
            showUserTypeMenu();
        } else {
            System.out.println("Invalid Username or Password");
        }
    }

    public void showUserTypeMenu() {
        int choice;
        do {
            System.out.println("\nChoose your account type:");
            System.out.println("1. Customer");
            System.out.println("2. Employee");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                choice = 0;
            }
            switch (choice) {
                case 1:
                    handleCustomerOperations();
                    break;
                case 2:
                    handleEmployeeOperations();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public void handleCustomerOperations() {
        int choice;
        do {
            System.out.println("\nCustomer Operations:");
            System.out.println("1. Transfer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                choice = 0;
            }
            switch (choice) {
                case 1:
                    System.out.println("Transfer operation selected.");

                    break;
                case 2:
                    System.out.println("Deposit operation selected.");
                    // Add deposit operation code here
                    break;
                case 3:
                    System.out.println("Withdraw operation selected.");
                    // Add withdraw operation code here
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    public void handleEmployeeOperations() {
        int choice;
        do {
            System.out.println("\nEmployee Operations:");
            System.out.println("1. Support");
            System.out.println("2. Manager");
            System.out.println("3. Back to main menu");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                choice = 0;
            }
            switch (choice) {
                case 1:
                    System.out.println("Support operation selected.");
                    // Add support operation code here
                    break;
                case 2:
                    System.out.println("Manager operation selected.");
                    // Add manager operation code here
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        OnlineBankingSystem onlineBankingSystem = new OnlineBankingSystem();
        // Main menu
        int mainChoice;
        do {
            System.out.println("\nWelcome to the Online Banking System");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            try {
                mainChoice = Integer.parseInt(onlineBankingSystem.scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                mainChoice = 0;
            }
            switch (mainChoice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = onlineBankingSystem.scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = onlineBankingSystem.scanner.nextLine();
                    onlineBankingSystem.loginUser(username, password);
                    break;
                case 2:
                    onlineBankingSystem.registerUser();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (mainChoice != 3);
    }
}
