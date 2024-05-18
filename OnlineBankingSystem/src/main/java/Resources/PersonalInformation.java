package Resources;

import java.util.ArrayList;

public class PersonalInformation {
    private String name;
    private String email;
    private int phoneNum;
    private String address;
    private Gender gender;
    private int id;

    ArrayList<PersonalInformation> personalInformations=new ArrayList<>();

    public PersonalInformation() {

    }

    public PersonalInformation(String name, String email, int phoneNum, String address, Gender gender, int id) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.gender = gender;
        this.id = id;
    }

    public PersonalInformation(int id, String username, String password, String name) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) throws IllegalArgumentException {
        if (phoneNum < 0) {
            throw new IllegalArgumentException("Phone number cannot be negative.");
        }
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalArgumentException {
        if (id < 0) {
            throw new IllegalArgumentException("ID cannot be negative.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }

    public Object getUsername() {
        return null;
    }

    public Object getPassword() {
        return null;
    }
}
