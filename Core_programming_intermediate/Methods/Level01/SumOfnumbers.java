
import java.util.Scanner;


public class SumOfnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int result = calculateSum(number);
        System.out.println("Sum of n numbers is : " + result);

    }

    public static int calculateSum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }
}