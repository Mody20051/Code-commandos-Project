package Resources;

public class Employee extends User{
    private String name;
    private int id;
    private int salary;
    private int hours;


    Employee(){

    }

    public Employee(String name, int id, int salary, int hours) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", hours=" + hours +
                '}';
    }
}
