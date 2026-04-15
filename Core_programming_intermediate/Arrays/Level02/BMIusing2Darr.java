import java.util.*;

public class BMIusing2Darr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        double[][] personData = new double[n][3]; // height, weight, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter height (in meters): ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Height must be positive. Enter again: ");
                height = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg): ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Weight must be positive. Enter again: ");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal weight";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
	}

}