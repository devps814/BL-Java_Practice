
abstract class Subscription {
    private int SubscriberId ;
    private String name;

    public Subscription(int SubscriberId, String name){
        this.SubscriberId = SubscriberId;
        this.name = name;
    }
    public int getSubscriberId(){
        return SubscriberId;
    }
    public String getname(){
        return name;
    }

    public abstract int getBorrowLimit();

    public void displayPlan(){
        System.out.println("ID : " + SubscriberId);
        System.out.println("name : " + name);
    }
}
interface Discountable{
    double applyDiscount(double amount);

}
interface Renewable{
    double renewPlan(int months);
}

class BasicPlan extends Subscription implements Discountable, Renewable{
    public BasicPlan(int SubscriberId, String name){
        super(SubscriberId, name);
    }

    @Override
    public int getBorrowLimit(){
        return 3;
    }

    @Override
    public double applyDiscount(double amount){
        return amount * 0.9;
    }
    @Override
    public double renewPlan(int months){
        return months * 100;
    }
}
class PremiumPlan extends Subscription implements Discountable, Renewable{
    public PremiumPlan(int SubscriberId, String name){
        super(SubscriberId,name);
    }

    @Override
    public int getBorrowLimit(){
        return 10;
    }
    @Override
    public double renewPlan(int months){
        return months * 200;
    }

    public double applyDiscount(double amount){
        return amount *  0.8 ;
    }
    public double applyDiscount(){
        return 1000* 0.9;
    }
    public double applyDiscount(String coupon , double amount){
        return amount * 0.7;
    }
}

public class DigitalLibrarySubscription {
    public static void main(String[] args){

        Subscription s1 = new BasicPlan(1, "Dev");
        Subscription s2 = new PremiumPlan(2, "Rahul");

        Subscription[] arr = {s1, s2};      // 

        for (Subscription s : arr) {
            s.displayPlan();
            System.out.println("Borrow Limit: " + s.getBorrowLimit());
            System.out.println("----------------");
        }

        PremiumPlan p = (PremiumPlan) s2;   //  ---->   

        System.out.println(p.applyDiscount());
        System.out.println(p.applyDiscount(1000)); 
        System.out.println(p.applyDiscount("PREMIUM", 1000));  

        Subscription s3 = new BasicPlan(1, "Another");

    }
}
