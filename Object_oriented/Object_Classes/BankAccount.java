import java.util.*;


public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String name, int number , double initialbalance) {
        accountHolder = name;
        accountNumber = number;
        balance = initialbalance;
    }
    void Deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(" Rs. "+ amount +" deposited successfully! ");
        }else{
            System.out.println("Invalid deposit amount. ");
        }
    }
    void Withdraw(double amount){
        if (amount <= 0){
            System.out.println("Invalid withdrawl amount! ");
        }else if (amount <= balance) {
            balance -= amount ;
            System.out.println(" Rs. " + amount + " withdraw successfully ! ");
        }else{
            System.out.println("Insufficient amount! ");
        }
    }
    void Accountdetails(){
        System.out.println("Account Holder name : " + accountHolder);
        System.out.println("Account Holder number : " + accountNumber);
    }
    void Balancedetails(){
        System.out.print("Current Balance " + balance);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account holder name : ");
        String name = sc.nextLine();
        System.out.println("Enter the account number ; ");
        int number = sc.nextInt();
        System.out.println("Enter the balacne : ");
        double initialbalance = sc.nextDouble();

        BankAccount info = new BankAccount(name, number , initialbalance);
        int choice ;
        do {
            System.out.println("ATM Menu ! ...");
            System.out.println("1. deposit money ");
            System.out.println("2. Withdrawn money ");
            System.out.println("3. Display account details ");
            System.out.println("4. Display current balance ");
            System.out.println("5. Exit ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the amount to deposit : ");
                    double depositAmount = sc.nextDouble();
                    info.Deposit(depositAmount);
                    break;
                case 2 :
                    System.out.print("Enter amount to withdrawn : ");
                    double withdrawnamt = sc.nextDouble();
                    info.Withdraw(withdrawnamt);
                    break;
                case 3 :
                    info.Accountdetails();
                    break;
                case 4 :
                    info.Balancedetails();
                    break;
                case 5 :
                    System.out.println("Thanku for using the ATM ! ");
                    break;
                default :
                    System.out.println("Invalid choice . Try Again ! ");
            }


        }while (choice != 5);

    }
}

