package Resources;
import java.util.Date;

public class Support extends Employee {
    private int supportID;
    private String supportType;
    private String description;
    private String status;
    private Date timestamp;
    private String priority;
    private Employee assignedTo;

    public Support(String name, String email, int phoneNum, String address, Gender gender, int id, String EID, int salary, int hours, int supportID, String supportType, String description, String status, Date timestamp, String priority, Employee assignedTo) {
        super(name, email, phoneNum, address, gender, id, EID, salary, hours);
        this.supportID = supportID;
        this.supportType = supportType;
        this.description = description;
        this.status = status;
        this.timestamp = timestamp;
        this.priority = priority;
        this.assignedTo = assignedTo;
    }

    // Getters and Setters
    public int getSupportID() {
        return supportID;
    }

    public void setSupportID(int supportID) {
        this.supportID = supportID;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Employee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "Support{" +
                "supportID=" + supportID +
                ", supportType='" + supportType + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                ", priority='" + priority + '\'' +
                ", assignedTo=" + assignedTo +
                "} " + super.toString();
    }
}