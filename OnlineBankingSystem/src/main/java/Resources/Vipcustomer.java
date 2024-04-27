package Resources;

import java.util.Date;

public class Vipcustomer extends Account {

    public Vipcustomer(String username, String password, String name, int phonenum, String address, Gender gender, double wallet,String account) {
        super(username, password, name, phonenum, address, gender, wallet,account);
    }

    final static int INTERSET=25;
    @Override
    public void applyInterest() {
        try {
            double interest = wallet * INTERSET / 100.0;
            System.out.println("Interest earned: " + interest);
        } catch (ArithmeticException e) {
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
         }finally{
             System.out.println("Successfully");
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
         }finally {
             System.out.println("Successfully");
         }
     }
 }
