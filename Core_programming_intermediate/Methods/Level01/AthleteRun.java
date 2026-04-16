import java.util.Scanner;

public class AthleteRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        // Calling method
        double result = calculateRounds(a, b, c);

        // Output
        System.out.println("Number of rounds required: " + result);

    }
}