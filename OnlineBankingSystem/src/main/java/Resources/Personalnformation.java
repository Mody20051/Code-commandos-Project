package Resources;

public class Personalnformation  {

    private String name;
    private int phonenum;
    private String address;
    private Gender gender;
    private int id;
    private User user;

    public Personalnformation() {
    }

    public Personalnformation(String name, int phonenum, String address, Gender gender, int id, User user) {
        this.name = name;
        this.phonenum = phonenum;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.user = user;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(int phonenum) throws IllegalArgumentException {
        if (phonenum < 0) {
            throw new IllegalArgumentException("Phone number cannot be negative.");
        }
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) throws ArithmeticException{
        if (phonenum < 0) {
            throw new IllegalArgumentException("Phone number cannot be negative.");
        }
        this.id = id;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
