package Resources;

import java.util.Date;

public class Vipcustomer extends Account {

    public Vipcustomer(String name, int phonenum, String address, Gender gender, int id, User user, double balance, String account) {
        super(name, phonenum, address, gender, id, user, balance, account);
    }

    final static int INTERSET=18;
    @Override
    public void applyInterest() {
        try {
            double interest = getBalance() * INTERSET / 100.0;
            System.out.println("Interest earned: " + interest);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }

     @Override
     public void withdraw(double money) {
         try {
             double pop=getBalance();
             pop -= money;
             //double interest = pop * INTERSET / 100.0;
             String line = "Withdrew $"+money+" on "+ new Date();
             transactionsType.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }finally{
             System.out.println("Successfully");
         }
     }

     @Override
     public void deposit(double money) {
         try {
             double pop =getBalance();
             pop += money;
             double interest = getBalance() * INTERSET / 100.0;
             String line = "Deposited $"+(interest+pop)+" on "+ new Date();
             transactionsType.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }finally {
             System.out.println("Successfully");
         }
     }
 }
