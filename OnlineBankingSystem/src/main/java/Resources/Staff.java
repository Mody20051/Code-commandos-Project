package Resources;

public class Staff extends Employee{
    private String supervisor;

    public Staff() {

    }

    public Staff(String name, int id, int salary, int hours, String supervisor) {
        super(name, id, salary, hours);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
