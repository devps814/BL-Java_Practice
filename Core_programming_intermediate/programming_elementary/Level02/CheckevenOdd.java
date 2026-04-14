package level_2;
import java.util.Scanner;


public class CheckevenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 1) {
            System.out.println("Please enter a valid natural number (≥1).");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
	}

}
