import java.util.*;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Enter a divisor : ");
        int divisor = sc.nextInt();

        if (divisor == 0) System.out.println("Division by 0 is not allowed ");

        int[] result = calculateQuoandRemainder(number, divisor);
        System.out.println("Quotient : " + result[0]);
        System.out.println("Remainder : " + result[1]);
    }
    public static int[] calculateQuoandRemainder(int num, int divisor){
        int quotient = num/divisor;
        int remainder = num % divisor;

        return new int[]{quotient,remainder};
    }
    
}
