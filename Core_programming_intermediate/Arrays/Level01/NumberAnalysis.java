
import java.util.*;

public class NumberAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] numbers = new int[5];

	        System.out.println("Enter 5 integers:");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = sc.nextInt();
	        }
	        for (int i = 0; i < numbers.length; i++) {
	            int num = numbers[i];
	            System.out.print("Element " + (i + 1) + " (" + num + "): ");
	            if (num > 0) {
	                if (num % 2 == 0) {
	                    System.out.println("Positive and Even");
	                } else {
	                    System.out.println("Positive and Odd");
	                }
	            } else if (num < 0) {
	                System.out.println("Negative");
	            } else {
	                System.out.println("Zero");
	            }
	        }

	        // Step 4: Compare first and last elements
	        int first = numbers[0];
	        int last = numbers[numbers.length - 1];

	        System.out.print("First element (" + first + ") is ");
	        if (first > last) {
	            System.out.println("greater than Last element (" + last + ")");
	        } else if (first < last) {
	            System.out.println("less than Last element (" + last + ")");
	        } else {
	            System.out.println("equal to Last element (" + last + ")");
	        }
	}

}
