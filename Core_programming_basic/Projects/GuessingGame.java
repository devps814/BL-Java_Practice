
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess;
        int attempt =0;

        System.out.println("Welcome to the Guessing Game ! ");
        System.out.println("Guess a number between 1 to 100! ");

        while (true) { 
            System.out.println("Guess a number : ");
            guess = sc.nextInt();
            attempt++;

            if (guess < target ){
                System.out.println("Low ");
            }else if (guess > target) {
                System.out.println("high");
            }else{
                System.out.println("Correct! you winn ! ");
                System.out.println("You guessed in "+ attempt + "attempts ");
                break;
            }
        }
    }
}