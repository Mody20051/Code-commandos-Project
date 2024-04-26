package Resources;

public class Employee extends User{
    private String name;
    private int id;
    private int salary;
    private int hours;

    public Employee(String name, int id, int salary, int hours,String username, String password) {
        super(username,password);
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
