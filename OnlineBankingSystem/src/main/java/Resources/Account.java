package Resources;

import java.util.ArrayList;

public abstract class Account extends Personalnformation {
     private double balance;
     private String account;
     protected ArrayList<String> transactionsType =new ArrayList<>();


    public Account(String name, int phonenum, String address, Gender gender, int id, double balance, String account) {
        super(name, phonenum, address, gender, id);
        this.balance = balance;
        this.account = account;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    abstract public void applyInterest();
    public String getTransactions(){
         if(transactionsType.size() >= 1){
             String trans="";
         for (int i = 0; i < transactionsType.size(); i++) {
             trans += transactionsType.get(i) + "\n" + " ";
         }
         return trans;
     }
        return "No transactions";
    }
    public abstract void withdraw(double money);
     public abstract void deposit(double money);
}

