package Resources;

abstract public class silvercustomer extends Customer{
      //final static int INTERSET=5;

    public silvercustomer(String username, String password, String name, int phonenum, String address, Gender gender,double ammount) {
        super(username, password, name, phonenum, address, gender,ammount);
    }
    final static int INTERSET=5;
    @Override
    public void applyInterest(double ammount) {
        double interest = ammount * INTERSET / 100.0;
        System.out.println("Interest earned: " + interest);
    }


}
