import java.util.*;

public class Checknumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Checknum(num));
	}
	public static int Checknum(int num) {
		if (num > 0) {
			return 1 ;
		}
		else if (num == 0) {
			return 0;
		}
		else {
			return -1;
		}
		
	}

}