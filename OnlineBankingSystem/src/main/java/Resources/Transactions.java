package Resources;
import java.util.Date;
public class Transactions {
    Type type;
    Status status;
    Date date;
    Account account;

    Transactions() {

    }

    Transactions(Type type, Status status, Date date, String username, String password, String name, int phonenum, String address, Gender gender, double wallet, String account) {
        this.type = type;
        this.status = status;
        this.date = new Date();
        this.account = new Account(username, password, name, phonenum, account, gender, wallet, account) {
            @Override
            public void applyInterest() {

            }

            @Override
            public void withdraw(double money) {

            }

            @Override
            public void deposit(double money) {

            }
        };
    }

}
