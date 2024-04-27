package Resources;

import java.util.Date;

public class NormalCustomer extends Customer{
      //final static int INTERSET=5;
    final static int INTERSET=18;
    public NormalCustomer(String username, String password, String name, int phonenum, String address, Gender gender, double wallet, String account) {
        super(username, password, name, phonenum, address, gender, wallet, account);
    }

    @Override
    public void applyInterest() {
        double interest = wallet * INTERSET / 100.0;
        System.out.println("Interest earned: " + interest);
    }

     @Override
     public void withdraw(double money) {
         wallet -= money;
         double interest = wallet * INTERSET / 100.0;
         String line = "money of value "+interest+" is withdraw "+ new Date();
         transactions.add(line);
     }

     @Override
     public void deposit(double money) {
         wallet += money;
         double interest = wallet * INTERSET / 100.0;
         String line = "money of value "+interest+" is withdraw "+ new Date();
         transactions.add(line);
     }

 }
