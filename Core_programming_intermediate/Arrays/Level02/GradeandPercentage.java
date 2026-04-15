import java.util.*;

public class GradeandPercentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 80) grade[i] = 'B';
            else if (percent[i] >= 70) grade[i] = 'C';
            else if (percent[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": % = " + percent[i] + ", Grade = " + grade[i]);
        }
	}

}