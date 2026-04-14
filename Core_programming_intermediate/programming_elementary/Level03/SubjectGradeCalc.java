package level_3;
import java.util.Scanner;

public class SubjectGradeCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Very Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (average >= 40) {
            System.out.println("Grade: D (Needs Improvement)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
	}

}
