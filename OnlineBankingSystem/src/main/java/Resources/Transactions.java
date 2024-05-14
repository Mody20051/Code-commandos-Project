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
        this.date = new Date();
        };
    }


