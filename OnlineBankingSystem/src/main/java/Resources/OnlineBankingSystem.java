package Resources;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBankingSystem {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Account> customers = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    private static int customerIdCounter = 1;
    private static int employeeIdCounter = 1001;

    public static void main(String[] args) {
        OnlineBankingSystem onlineBankingSystem = new OnlineBankingSystem();
        onlineBankingSystem.start();
    }

    public void start() {
        int choice;
        do {
            System.out.println("\nWelcome to Online Banking System!");
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
        System.out.println("Registering a new user...");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Are you a customer or an employee? (Enter 'customer' or 'employee'): ");
        String userType = scanner.nextLine().toLowerCase();
        if (userType.equals("customer")) {
            int id = customerIdCounter++;
            customers.add(new Account(id, username, password, name) {
                @Override
                public void applyInterest() {

                }

                @Override
                public void withdraw(double money) {

                }

                @Override
                public void deposit(double money) {

                }

                @Override
                public void transfer(double money, Account targetAccount) {

                }
            });
            System.out.println("Customer registration successful! Your ID is: " + id);
        } else if (userType.equals("employee")) {
            int id = employeeIdCounter++;
            employees.add(new Employee(id, username, password, name));
            System.out.println("Employee registration successful! Your ID is: " + id);
        } else {
            System.out.println("Invalid user type.");
        }
    }

    public void loginUser() {
        System.out.println("Logging in...");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check customers
        for (Account customer : customers) {
            if (customer.getUsername() != null && customer.getUsername().equals(username) && customer.getPassword() != null && customer.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, Customer " + customer.getName() + ". Your ID is: " + customer.getId());
                showCustomerMenu();
                return;
            }
        }

        // Check employees
        for (Employee employee : employees) {
            if (employee.getUsername() != null && employee.getUsername().equals(username) && employee.getPassword() != null && employee.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, Employee " + employee.getName() + ". Your ID is: " + employee.getId());
                showEmployeeMenu();
                return;
            }
        }

        System.out.println("Invalid username or password.");
    }

    public void showCustomerMenu() {
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
                    // Add transfer operation code here
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

    public void showEmployeeMenu() {
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
}
