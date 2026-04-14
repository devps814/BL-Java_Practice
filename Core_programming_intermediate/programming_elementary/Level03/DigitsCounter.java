package level_3;
import java.util.Scanner;


public class DigitsCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Number of digits: " + count);
	}

}
