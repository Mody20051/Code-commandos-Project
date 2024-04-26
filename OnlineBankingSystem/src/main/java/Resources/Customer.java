package Resources;

 public abstract class Customer extends User {
     protected String name;
     protected int phonenum;
     protected String address;
     protected Gender gender;

     protected double ammount;


     public Customer(String username, String password, String name, int phonenum, String address, Gender gender, double ammount) {
         super(username, password);
         this.name = name;
         this.phonenum = phonenum;
         this.address = address;
         this.gender = gender;
         this.ammount = ammount;
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

     public double getAmmount() {
         return ammount;
     }

     public void setAmmount(double ammount) {
         this.ammount = ammount;
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
     public abstract void applyInterest(double ammount);
 }

