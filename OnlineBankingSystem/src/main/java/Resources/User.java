package Resources;
import java.util.Scanner;

public class User {
    private String username;
    private String password;
    Personalnformation personalnformation;
    public User() {
        this.username = "";
        this.password = "";
    }

    public User(String username, String password) {
       this.username=username;
       this.password=password;
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
  public boolean login(String Username,String password){
        if(Username.equals(this.username)&&password.equals(this.password)){
            return true;
        }
        return false;
  }
//    public boolean register(String username, String password,Personalnformation personalnformation) throws IllegalArgumentException {
//
//    }

}