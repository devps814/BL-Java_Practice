abstract class Bank{
    private int customerId;
    private String name;
    protected double loan;

    public Bank (int customerId, String name, double loan){
        this.customerId = customerId;
        this.name = name;
        this.loan = loan;
    }
    public abstract double Calculateinterest();

}
class Customer extends Bank{
    public Customer(int customerId, String name, double loan){
        super(customerId, name, loan);
    }
    @Override
    public double Calculateinterest(){
        return loan * 0.25;
    }
}
public class BankApplication{
    public static void main(String[] args) {
        Bank b1 = new Customer(23456, "Ajay", 500000);
    }
}