package Resources;

import java.util.ArrayList;

public abstract class Account extends PersonalInformation {
     private double balance;
     private String account;
      ArrayList<Transactions> TransactionsType =new ArrayList<>();


    public Account(String name,String email,int phonenum, String address, Gender gender, int id, double balance, String account) {
        super(name,email,phonenum, address, gender, id);
        this.balance = balance;
        this.account = account;
    }

    public Account(int id, String username, String password, String name) {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public void addTransaction(Transactions transaction) {
        TransactionsType.add(transaction);
    }
    abstract public void applyInterest();
    public abstract void withdraw(double money);
     public abstract void deposit(double money);

    public abstract void transfer(double money, Account targetAccount);
}

