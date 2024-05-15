package Resources;

import java.util.Date;

public class NormalCustomer extends Account{
    final static int INTERSET=18;
    public NormalCustomer(String name, int phonenum, String address, Gender gender, int id, double balance, String account) {
        super(name,phonenum,address,gender,id,balance, account);
    }

    @Override
    public void applyInterest() {
        try {
            double interest = getBalance() * INTERSET / 100.0;
            System.out.println("Interest earned: " + interest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     @Override
     public void withdraw(double money) {
         try {
             double intlo= getBalance();
             double withdrawAmount = intlo - money;
//             double interest = intlo * INTERSET / 100.0;
             String line = "Withdraw $"+money+" on "+ new Date();
             transactionsType.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         } finally {
             System.out.println("Successful");
         }
     }

     @Override
     public void deposit(double money) {
         try {
             double intlo= getBalance();
              intlo+= money;
             double interest = intlo * INTERSET / 100.0;
             String line = "Deposited $"+(interest+intlo)+" on "+ new Date();
             transactionsType.add(line);
         } catch (Exception e) {
             throw new RuntimeException(e);
         } finally {
             System.out.println("Successful");
         }
     }

 }
