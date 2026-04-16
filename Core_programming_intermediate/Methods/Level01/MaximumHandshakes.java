import java.util.*;

public class MaximumHandshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(maximumhandshakes(n));
		
	}
	public static int maximumhandshakes(int n) {
		int combination = (n * (n-1))/2; 
		return combination;
	}
}