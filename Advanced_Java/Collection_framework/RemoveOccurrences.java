import java.util.LinkedList;
import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to remove all the occurence : ");
        int valueToRemove = sc.nextInt();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(40);

        System.out.println("Before Removal: " + list);

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == valueToRemove) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("After Removal: " + list);
    }
}
