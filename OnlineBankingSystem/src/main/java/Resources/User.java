package Resources;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private PersonalInformation personalInformation;
    private static ArrayList<User> users = new ArrayList<>();

    public User() {
        this.username = "";
        this.password = "";
        this.personalInformation = null;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.personalInformation = null;
    }

    public User(String username, String password, PersonalInformation personalInformation) {
        this.username = username;
        this.password = password;
        this.personalInformation = personalInformation;
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

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("The user is successfully logged in.");
                return true;
            }
            else{
                System.out.println("error");
            }
        }
        return false;
    }

    public  boolean register(String username, String password, PersonalInformation personalInformation) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("The username is already used.");
                return false;
            }
        }
        User newUser = new User(username, password, personalInformation);
        users.add(newUser);
        System.out.println("User successfully registered.");
        return true;
    }

}