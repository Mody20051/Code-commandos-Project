package Resources;

public class Employee extends Personalnformation{

    private String  EID;
    private int salary;
    private int hours;

    public Employee(String EID, int salary, int hours) {
        this.EID = EID;
        this.salary = salary;
        this.hours = hours;
    }

    public Employee(String name, int phonenum, String address, Gender gender, int id, User user, String EID, int salary, int hours) {
        super(name, phonenum, address, gender, id, user);
        this.EID = EID;
        this.salary = salary;
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
