package Resources;

public class Employee extends PersonalInformation{

    private String  EID;
    private int salary;
    private int hours;

    public Employee(String name, String email, int phoneNum, String address, Gender gender, int id, String EID, int salary, int hours) {
        super(name, email, phoneNum, address, gender, id);
        this.EID = EID;
        this.salary = salary;
        this.hours = hours;
    }

    public Employee(int id, String username, String password, String name) {

        super();
    }

    public int getSalary() {
        return salary*hours;
    }

    public void setSalary(int salary) {
        try {
            this.salary = salary;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        try {
            this.hours = hours;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EID='" + EID + '\'' +
                ", salary=" + salary +
                ", hours=" + hours +
                '}';
    }
}
