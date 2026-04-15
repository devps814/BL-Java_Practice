import java.util.*;

public class BMIusingSingleArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();
            while (height[i] <= 0) {
                System.out.print("Height must be positive. Enter again: ");
                height[i] = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
            while (weight[i] <= 0) {
                System.out.print("Weight must be positive. Enter again: ");
                weight[i] = sc.nextDouble();
            }

            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) weightStatus[i] = "Underweight";
            else if (bmi[i] < 25) weightStatus[i] = "Normal weight";
            else if (bmi[i] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], weightStatus[i]);
        }
	}

}