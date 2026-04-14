import java.util.Scanner;

public class Sumofnumfor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println(" Both results match!");
            } else {
                System.out.println(" Both results didn't match");
            }
	}

}
	}