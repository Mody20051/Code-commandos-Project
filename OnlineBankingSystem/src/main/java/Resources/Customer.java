package Resources;

import java.util.ArrayList;

public abstract class Customer extends User {
     protected String name;
     protected int phonenum;
     protected String address;
     protected Gender gender;
     protected double wallet;
     protected String account;

     protected ArrayList<String> transactions =new ArrayList<>();

     public Customer(String username, String password, String name, int phonenum, String address, Gender gender, double wallet,String account) {
         super(username, password);
         this.name = name;
         this.phonenum = phonenum;
         this.address = address;
         this.gender = gender;
         this.wallet = wallet;
         this.account=account;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPhonenum() {
         return phonenum;
     }

     public void setPhonenum(int phonenum) {
         this.phonenum = phonenum;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public Gender getGender() {
         return gender;
     }

     public void setGender(Gender gender) {
         this.gender = gender;
     }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        wallet = wallet;
    }

    @Override
     public String toString() {
         return "Customer{" +
                 "name='" + name + '\'' +
                 ", phonenum=" + phonenum +
                 ", address='" + address + '\'' +
                 ", gender=" + gender +
                 '}';
     }

    abstract public void applyInterest();
    public String transactions(){
         if(transactions.size() >= 1){
             String trans="";
         for (int i = 0; i < transactions.size(); i++) {
             trans += transactions.get(i) + "\n" + " ";
         }
         return trans;
     }
        return "No transactions";
    }
    public abstract void withdraw(double money);
     public abstract void deposit(double money);
 }

