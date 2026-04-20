import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char [][] board = new char[3][3];
        for (int row =0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }
        //input
        char Player = 'X';
        boolean gameOver = false;
        printboard(board);
        while (!gameOver){
            int row, col;
            if (Player == 'X'){
                 System.out.print(" Player " + Player + " enter : ");
                 row = sc.nextInt();
                 col = sc.nextInt();
            }else{
                System.out.println(" Computer turns ! : ");

                do {
                    row = rand.nextInt(3);
                    col = rand.nextInt(3);
                    System.out.println("Computer choose ..." + row + " " + col );
                } while (board[row][col] != ' ');
            }
            if (board[row][col] == ' '){
                board[row][col] = Player;
                gameOver = Won(board , Player);

                if (gameOver){
                    System.out.println("Player " + Player + " won the game! ");
                }
                else if (isDraw(board)){
                System.out.println(" Game is Draw! ");
                gameOver = true;
                }
                else{
                    if (Player == 'X'){
                        Player = 'O';
                    }else{
                        Player = 'X';
                    }
                }
            }    
            else{
                System.out.println(" Invalid Player entry!, Try Again : ");
            }
            printboard(board);
        }
    }
    // who will win the game!
    public static boolean Won(char[][] board , char Player){
        //row check
        for (int i  = 0; i < board.length; i++){
            if (board[i][0] == Player && board[i][1] == Player && board[i][2] == Player){
                return true;
            }
        }
        //column check
        for (int i  = 0; i < board[0].length; i++){
            if (board[0][i] == Player && board[1][i] == Player && board[2][i] == Player){
                return true;
            }
        }
        //diagonal check
        if (board[0][0] == Player && board[1][1] == Player && board[2][2] == Player){
            return true;
        }
        if (board[0][2] == Player && board[1][1] == Player && board[2][0] == Player){
            return true;
        }
        return  false;
    }
    public static void printboard(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + " |");
            }
            System.out.println();
        }
    }
    public static boolean isDraw(char[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j  =0; j < board[i].length; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}
