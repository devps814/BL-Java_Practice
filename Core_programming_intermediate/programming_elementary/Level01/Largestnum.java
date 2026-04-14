
import java.util.Scanner;

public class Largestnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		boolean isFirstLargest = (num1 >= num2) && (num1 >= num3);
        boolean isSecondLargest = (num2 >= num1) && (num2 >= num3);
        boolean isThirdLargest = (num3 >= num1) && (num3 >= num2);

        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
	}

} 
    
