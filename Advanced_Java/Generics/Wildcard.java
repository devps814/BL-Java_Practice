import java.util.*;

public class Wildcard {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(4,5,8,9,6));
    System.out.println("Test sum is : " + displaythecontent(list));

    List<Double> list1 = new ArrayList<>(Arrays.asList(2.0,5.2,6.4,3.4));
    System.out.println("Test sum is : " + displaythecontent(list1));


    }
    public static double displaythecontent(List<? extends Number> list){
        double sum = 0.0;
        for (Number i : list){
            sum += i.doubleValue();
        }
        return sum;
    }
    public static String displaythename(List<? >)
}

