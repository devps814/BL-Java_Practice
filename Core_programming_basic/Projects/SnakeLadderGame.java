import java.util.*;

class Player {
    String name;
    int position;

    Player(String name){
        this.name = name;
    }
}
public class SnakeLadderGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        int[] snakes = new int[101];
        int[] ladder = new int[101];

        snakes[17] = 7;
        snakes[54] = 34;
        snakes[62] = 19;

        ladder[4] = 14;
        ladder[21] = 42;
        ladder[28] = 84;

        boolean isP1Turn = true;

        while (true) { 
            Player current;

            if (isP1Turn){
                current = p1;
            }else{
                current = p2;
            }

            System.out.println("\n" + current.name + " turn , press Enter to roll dice ! " );
            sc.nextLine();

            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("Dice :" + dice);

            if (current.position + dice <= 100){
                current.position += dice;
            }
            //ladder
            if (ladder[current.position] != 0){
                System.out.println("take a ladder");
                current.position = ladder[current.position];
            }
            //snake
            if (snakes[current.position] != 0){
                System.out.println("bite by snake");
                current.position = snakes[current.position];
            }
            System.out.println(current.name + " is at position : " + current.position );

            if (current.position == 100){
                System.out.println(current.name + "wins!" );
                break;
            }
            isP1Turn = !isP1Turn;
        }
    }
}