import java.util.Scanner;


public class FactorsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 0)return ;
		
		int maxFactor = 10;
		int[] Factor = new int[maxFactor];
		int index =0;
		
		for (int i= 1 ; i < num ; i++) {
			if (num % i == 0) {
				if (index == maxFactor) {
					maxFactor *= 2;
					int[] temp = new int[maxFactor];
					for (int j =0 ; j < index; j++) {
						temp[j] = Factor[j]; 
					}
					Factor = temp;
				}
				Factor[index++] = i;
			}
		}
		System.out.println("The Factors of " + num + " are : ");
		for (int i = 0 ; i < index ; i++) {
			System.out.println(Factor[i] + " ");
		}
	}

}