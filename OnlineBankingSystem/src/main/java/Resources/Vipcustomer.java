package Resources;

import java.util.Date;

public class Vipcustomer extends Customer {

    public Vipcustomer(String username, String password, String name, int phonenum, String address, Gender gender, double wallet,String account) {
        super(username, password, name, phonenum, address, gender, wallet,account);
    }

    final static int INTERSET=25;
    @Override
    public void applyInterest() {
        double interest = wallet * INTERSET / 100.0;
        System.out.println("Interest earned: " + interest);
    }

     @Override
     public void withdraw(double money) {
             wallet -= money;
             double interest = wallet * INTERSET / 100.0;
             String line = "Withdrew $"+interest+" on "+ new Date();
             transactions.add(line);
     }

     @Override
     public void deposit(double money) {
             wallet += money;
             double interest = wallet * INTERSET / 100.0;
             String line = "Deposited $"+interest+" on "+ new Date();
             transactions.add(line);
     }
 }
