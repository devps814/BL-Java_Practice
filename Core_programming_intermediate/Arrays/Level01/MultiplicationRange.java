
import java.util.Scanner;

public class MultiplicationRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index =0;
		
		int[] arr = new int[num];
		for (int i = 6 ; i <=9 ;i++) {
			arr[index] = num * i ;
			System.out.println(num + " * " + i + " = "+ arr[index] );
			index++;
		}
		
	}

}