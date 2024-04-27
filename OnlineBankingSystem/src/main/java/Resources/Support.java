package Resources;

public class Support extends  Personalnformation {
    private String email;





    public Support(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Support{" +
                "email='" + email + '\'' +
                '}';
    }

}
