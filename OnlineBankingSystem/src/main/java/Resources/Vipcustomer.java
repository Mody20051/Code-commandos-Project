package Resources;

abstract public class Vipcustomer extends Customer {

    public Vipcustomer(String username, String password, String name, int phonenum, String address, Gender gender, double ammount) {
        super(username, password, name, phonenum, address, gender, ammount);
    }

    final static int INTERSET=10;
    @Override
    public void applyInterest(double ammount) {
        double interest = ammount * INTERSET / 100.0;
        System.out.println("Interest earned: " + interest);
    }
}
