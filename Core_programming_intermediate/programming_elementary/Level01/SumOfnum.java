package level_1;
import java.util.Scanner;

public class SumOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        if (num > 0) {
            for (int j = 1; j <= num; j++) {
                sum += j; 
            }
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        } 
        else {
            System.out.println("The number " + num + " is not a natural number");
        }

    }
}