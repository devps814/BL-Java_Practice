package level_2;
import java.util.Scanner;

public class PowerWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to power " + power + " is: " + result);
		
	}
}
