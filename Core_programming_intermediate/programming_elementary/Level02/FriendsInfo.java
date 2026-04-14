package level_2;
import java.util.Scanner;

public class FriendsInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
        int height1 = sc.nextInt();

        System.out.print("Enter age and height of Akbar: ");
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();

        System.out.print("Enter age and height of Anthony: ");
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();

        if (age1 <= age2 && age1 <= age3)
            System.out.println("Youngest: Amar");
        else if (age2 <= age1 && age2 <= age3)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (height1 >= height2 && height1 >= height3)
            System.out.println("Tallest: Amar");
        else if (height2 >= height1 && height2 >= height3)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");

	}

}
