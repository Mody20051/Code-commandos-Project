package Resources;
import java.util.Date;
public class Transactions {
    Type type;
    Status status;
    Date date;

    Transactions() {

    }
    Transactions(Type type, Status status, Date date) {
        this.type = type;
        this.status = status;
        this.date = new Date(date.getTime());
        }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


