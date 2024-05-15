package Resources;

import java.util.Date;

public class NormalCustomer extends Account {
    final static int INTERSET = 5;
    double amount;

    public NormalCustomer(String name, String email, int phonenum, String address, Gender gender, int id, double balance, String account, double amount) {
        super(name, email, phonenum, address, gender, id, balance, account);
        this.amount = amount;
    }

    @Override
    public void applyInterest() {
            double BalanceInterset = getBalance() * INTERSET / 100.0;
            System.out.println("Interest earned: " + BalanceInterset);
    }

    @Override
    public void deposit(double money) {
        double getInterset = INTERSET / 100.0;
        if (money > 0) {
           double balance =getBalance()+(getBalance()*getInterset);
           balance+=money;
           TransactionsType.add(new Transactions(Type.Deposit,Status.SuccessfullyCompleted,money,new Date()));
            System.out.println("Deposited: " + money + ", Remaining Balance: " + getBalance());
        }else{
            TransactionsType.add(new Transactions(Type.Deposit,Status.Failed,money,new Date()));
        }
    }

    @Override
    public void transfer(double money, Account targetAccount) {
        double balance =getBalance();
        if (money > 0 && balance >= money) {
            balance -= money;
            targetAccount.deposit(money);
            TransactionsType.add(new Transactions(Type.Transfer,Status.SuccessfullyCompleted,money,new Date()));
            System.out.println("Transfer: " + money + ", Remaining Balance: " + getBalance());
        } else {
            TransactionsType.add(new Transactions(Type.Transfer,Status.SuccessfullyCompleted,money,new Date()));
        }
    }

    @Override
    public void withdraw(double money) {
        double balance =getBalance();
        if (money > 0 && balance >= money) {
            balance -= money;
            TransactionsType.add(new Transactions(Type.Withdraw,Status.SuccessfullyCompleted,money,new Date()));
            System.out.println("Withdraw: " + money + ", Remaining Balance: " + getBalance());
        } else {
            TransactionsType.add(new Transactions(Type.Withdraw,Status.SuccessfullyCompleted,money,new Date()));
        }
    }
    public double getBalance() {
        return getBalance();
    }
    @Override
    public String toString() {
        return "NormalCustomer{" +
                "TransactionsType=" + TransactionsType +
                '}';
    }
}
