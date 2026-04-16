import java.util.Scanner;

public class CalculateSI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		int ans = calculateSI(principal, rate , time);
		System.out.println("The Simple Interest is " + ans + " for principal " + principal + ", Rate of Interest " + rate + "  and time " + time );
		
		
	}
	public static int calculateSI(int a , int b , int c) {
		int interest = a * b * c/100 ;
		return interest;
	}

}