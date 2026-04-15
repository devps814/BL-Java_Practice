import java.util.Scanner;


public class OddOrEvennum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("This is not anatural number ");
			return;
		}
		int[] evenArr = new int[num/2 + 1];
		int[] oddArr = new int[num/2 + 1];
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		for (int i = 1 ; i <= num ; i++) {
			if (i % 2 == 0) {
				evenArr[evenIndex++] = i;
			}else {
				oddArr[oddIndex++] = i;
			}
		}
		for (int i = 0; i < evenIndex ; i++) {
			System.out.println("Even Array : " + evenArr[i] + " ");
		}
		for (int i =0; i < oddIndex ; i++) {
			System.out.println("Odd Array : " + oddArr[i] + " ");
		}
	}
}