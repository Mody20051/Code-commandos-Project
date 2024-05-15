package Resources;

public class Personalnformation {

    private String name;
    private String password;
    private String email;
    private int phonenum;
    private String address;
    private Gender gender;
    private int id;

    public Personalnformation(String name, int phonenum, String address, Gender gender, int id) {
        this.name = name;
        this.phonenum = phonenum;
        this.address = address;
        this.gender = gender;
        this.id = id;
    }

    public Personalnformation(String name, String password, String email, int phonenum, String address, Gender gender, int id) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
        this.address = address;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getPhonenum() {
        return phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
        try {
            this.address = address;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws ArithmeticException {
        if (phonenum < 0) {
            throw new IllegalArgumentException("Phone number cannot be negative.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personalnformation{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenum=" + phonenum +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
