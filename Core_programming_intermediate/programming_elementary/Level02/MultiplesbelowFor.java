package level_2;
import java.util.Scanner;


public class MultiplesbelowFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        }

	}

}
