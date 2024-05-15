package Resources;

public class Personalnformation {

    private String name;
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
}
