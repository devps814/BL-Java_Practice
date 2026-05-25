import java.util.Scanner;

public class Banking_Application {
    public static void main(String[] args) {
        System.out.println("Enter the withdrawn amount! ");
        Scanner sc = new Scanner(System.in);
        Double amount = sc.nextDouble();

        try{
            double remaining = Withdrawn(amount);
            System.out.println("Withdraw successfully !");
            System.out.println("Remaing balance is : " + remaining);
        }catch(InsufficientBalancedException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Banking  ");
        }
        
    }
    private static double Withdrawn(double amount) throws InsufficientBalancedException {
        double balance = 50000.0;

        if (amount <= balance){
            double remainingbalance = balance - amount;
            return remainingbalance;

            
        } else {
            throw new InsufficientBalancedException("Insufficient Balance ! ", balance);
        }
    }
}
// custom exception 
// create a insufficientbalancedexception by inheriting the exception class (checked exception ) using throws 
// to throw an exception and handled in calling method.
class InsufficientBalancedException extends Exception{
    private double balance;

    public InsufficientBalancedException(String message, double currentbalance){
        super(message);
        this.balance= currentbalance;
    }

}
