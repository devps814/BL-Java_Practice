
import java.util.Scanner;

public class SumOfPositivenums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;
		
		while (true) {
			double input = sc.nextDouble();
			
			if (input <= 0 ) {
				break;
			}
			if (input == 10 ) {
				System.out.println("Maximum limit reached ");
				break;
			}
			arr[index] = input ;
			index++;
		}
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("Total sum : " + total);
	}

}