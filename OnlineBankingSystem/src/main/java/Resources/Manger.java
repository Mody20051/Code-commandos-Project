package Resources;

public class Manger extends Employee  {
    private String department;

    public Manger() {
    }
    public Manger(String name, int id, int salary, int hours, String department) {
        super(name, id, salary, hours);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

