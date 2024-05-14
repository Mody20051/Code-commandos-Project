package Resources;
import java.util.Scanner;
public class OnlineBankingSystem {
   public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter username: ");
       String usernameInput = scanner.nextLine();

       System.out.print("Enter password: ");
       String passwordInput = scanner.nextLine();

       // Create User object with input validation
       try {
           User user = new User(usernameInput, passwordInput);
           System.out.println("User created successfully!");
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }
      }

    }
