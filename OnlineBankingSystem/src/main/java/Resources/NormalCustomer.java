package Resources;

import java.util.Date;

public class NormalCustomer extends Account{
      //final static int INTERSET=5;
    final static int INTERSET=18;
    public NormalCustomer(String username, String password, String name, int phonenum, String address, Gender gender, double wallet, String account) {
        super(username, password, name, phonenum, address, gender, wallet, account);
    }

    @Override
    public void applyInterest() {
        try {
            double interest = wallet * INTERSET / 100.0;
            System.out.println("Interest earned: " + interest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     @Override
     public void withdraw(double money) {
         try {
             wallet -= money;
             double interest = wallet * INTERSET / 100.0;
             String line = "Withdrew $"+interest+" on "+ new Date();
             transactions.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         } finally {
             System.out.println("Successful");
         }
     }

     @Override
     public void deposit(double money) {
         try {
             wallet += money;
             double interest = wallet * INTERSET / 100.0;
             String line = "Deposited $"+interest+" on "+ new Date();
             transactions.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         } finally {
             System.out.println("Successful");
         }
     }

 }
