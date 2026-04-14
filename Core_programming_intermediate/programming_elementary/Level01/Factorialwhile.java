import java .util.Scanner;

public class Factorialwhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   if (n < 0) {
			   System.out.println("Please enter a non-negative integer.");
	        }
		   else {
			   int factorial = 1;
			   int i = 1;
			   while (i <= n) {
				   factorial *= i;
				   i++;
				   }
			   System.out.println("Factorial of " + n + " is: " + factorial);
	        }
	}

}