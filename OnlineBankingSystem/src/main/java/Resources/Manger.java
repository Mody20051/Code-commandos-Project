package Resources;

public class Manger extends Employee  {
    private String branchID;
    private String email;





    public Manger(String name, int phonenum, String address, Gender gender, int id, User user, String EID, int salary, int hours) {
        super(name, phonenum, address, gender, id, user, EID, salary, hours);
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manger{" +
                "branchID='" + branchID + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

