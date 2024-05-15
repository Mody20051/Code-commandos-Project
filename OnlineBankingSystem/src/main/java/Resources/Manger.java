package Resources;

public class Manger extends Employee  {
    private String branchID;
    private String email;


    public Manger(String name, String email, int phoneNum, String address, Gender gender, int id, String EID, int salary, int hours, String branchID, String email1) {
        super(name, email, phoneNum, address, gender, id, EID, salary, hours);
        this.branchID = branchID;
        this.email = email1;
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
    public int getSalary() {
        return super.getSalary()*(getHours()*2);
    }

    @Override
    public int getHours() {
        return super.getHours();
    }

    @Override
    public String toString() {
        return "Manger{" +
                "branchID='" + branchID + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

