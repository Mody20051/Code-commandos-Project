
        package Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineBankingSystem {
    Scanner scanner = new Scanner(System.in);
    List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        OnlineBankingSystem onlineBankingSystem = new OnlineBankingSystem();
        onlineBankingSystem.start();
    }

    public void start() {
        int choice;
        do {
            System.out.println("\nWelcome!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                choice = 0;
            }

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter name (optional): ");
        String name = scanner.nextLine();

        User newUser = new User(username, password, name);
        users.add(newUser);

        System.out.println("Registration successful!");
    }

    public void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = findUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            postLoginMenu(user);
        } else {
            System.out.println("Login failed. Please check username and password.");
        }
    }

    private void postLoginMenu(User user) {
        char roleIndicator = user.getUsername().charAt(0);
        if (roleIndicator == '3') {
            employeeMenu();
        } else if (roleIndicator == '2') {
            customerMenu();
        } else {
            System.out.println("Invalid user role.");
        }
    }

    private void employeeMenu() {
        int choice;
        do {
            System.out.println("\nEmployee Menu");
            System.out.println("1. View Tasks");
            System.out.println("2. Approve Loans");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Viewing tasks...");
                    break;
                case 2:
                    System.out.println("Approving loans...");
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    private void customerMenu() {
        int choice;
        do {
            System.out.println("\nCustomer Menu");
            System.out.println("1. View Account");
            System.out.println("2. Transfer Funds");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    System.out.println("Viewing account...");
                    break;
                case 2:
                    System.out.println("Transferring funds...");
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    private User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

