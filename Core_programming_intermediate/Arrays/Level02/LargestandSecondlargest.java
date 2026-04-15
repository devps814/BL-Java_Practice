import java.util.Scanner;

public class LargestandSecondlargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int[] digits = new int[10];
	        int index = 0;
	        while (number != 0) {
	            digits[index++] = number % 10;
	            number /= 10;
	        }
	        int max = 0, secondMax = 0;
	        for (int i = 0; i < index; i++) {
	            if (digits[i] > max) {
	                secondMax = max;
	                max = digits[i];
	            } else if (digits[i] > secondMax && digits[i] != max) {
	                secondMax = digits[i];
	            }
	        }
	        System.out.println("Largest: " + max + ", Second Largest: " + secondMax);
	}

}