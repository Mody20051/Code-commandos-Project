package Resources;
public class OnlineBankingSystem {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void login(String username,String password){
        this.username=username;
        this.password=password;

    }

    void register(){

       }
    }
