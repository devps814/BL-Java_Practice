import java.util.*;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digit = new int[4];
        int index = 0;
        int temp = num;
        while (temp != 0){
            int remainder = temp % 10;
            digit[index] = remainder;
            index++;
            temp /= 10;
        }
        
        for (int i = 0; i < digit.length; i++){
            if (digit[i] == 9){
                digit[i] = 6;
                int newNum = 
                if (digit)
            }
        }
    }
}
