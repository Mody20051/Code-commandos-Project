package Resources;
import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User() {
        this.username = "";
        this.password = "";
    }

    public User(String username, String password) {
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws IllegalArgumentException {
        if (!validateUsername(username)) {
            throw new IllegalArgumentException("Username can only contain letters.");
        }
        this.username = username;
    }

    public boolean validateUsername(String username) {
        return username.matches("[a-zA-Z]+");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (password.length() != 8) {
            throw new IllegalArgumentException("Password must be 8 characters long.");
        }
        this.password = password;
    }
}