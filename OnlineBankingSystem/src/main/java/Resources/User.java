package Resources;
import java.util.*;
public class User {
    String Username;
    String password;

    User() {

    }

    public User(String username, String password) {
        Username = username;
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) throws IllegalArgumentException {
        try {
            this.Username = Username;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (!validateUsername(Username)) {
            throw new IllegalArgumentException("Username can only contain letters.");
        }
    }
    public boolean validateUsername(String username) {
        return username.matches("[a-zA-Z]+");
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            this.password = password;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
