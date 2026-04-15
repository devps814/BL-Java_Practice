import java.util.*;

public class PercentageandGrade2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + " of student " + (i + 1) + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Enter positive marks");
                    j--;
                } else {
                    total += marks[i][j];
                }
            }
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 50)
                grade[i] = "C";
            else
                grade[i] = "D";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + Arrays.toString(marks[i]) + ", Percentage: " + percentage[i] + ", Grade: " + grade[i]);
        }
	}
}