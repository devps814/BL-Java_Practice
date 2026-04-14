package level_2;
import java.util.Scanner;

public class FactorFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer only!");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
	}
}
