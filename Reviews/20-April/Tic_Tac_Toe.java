import java.util.*;

public class Tic_Tac_Toe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char[][] playBoard = new char[3][3];
        for (int row = 0; row < playBoard.length; row++){
            for (int col = 0; col < playBoard[row].length; col++){
                playBoard[row][col] = ' ';
            }
        }
        //input 
        char Player = 'X';
        boolean gameOver = false;
        printBoard(playBoard);
        while (!gameOver){
            int row, col;
            if (Player == 'X'){
                System.out.print("Player "+ Player + " entry :");
                row = sc.nextInt();
                col = sc.nextInt();
            }else{

                System.out.println("Computer Turn! ");

                do {
                    row = rand.nextInt(3);
                    col = rand.nextInt(3); 
                } while (playBoard[row][col] != ' ');

                System.out.println("Computer chose: " + row + " " + col);
            }
            if (playBoard[row][col] == ' '){
                playBoard[row][col] = Player;

                gameOver = HasWon(playBoard,Player);

                if (gameOver){
                    System.out.println("Player " + Player + " Has Won the Game! ");
                }
                else if (isDraw(playBoard)){
                    System.out.println(" Game is Draw! ");
                    gameOver = true;
                }
                else{
                    if  (Player == 'X'){
                        Player = 'O';
                    }else{
                        Player = 'X';
                    }
                }
            }
            else{
                System.out.println("Invalid Entry! Try Again");
            }
            printBoard(playBoard);
        }
    }
    public static boolean HasWon(char[][] board , char Player){
        // row 
        for (int i = 0; i < board.length; i++){
            if (board[i][0] == Player && board[i][1] == Player && board[i][2] == Player ){
                return true;
            }
        }
        // col
        for (int i = 0; i < board[0].length; i++){
            if (board[0][i] == Player && board[1][i] == Player && board[2][i] == Player ){
                return true;
            }
        }
        //diagonal
        if (board[0][0] == Player && board[1][1] == Player && board[2][2] == Player ){
            return true;
        }
        if (board[0][2] == Player && board[1][1] == Player && board[2][0] == Player ){
            return true;
        }
        return false;
    }
    public static boolean isDraw (char[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j =0; j < board[i].length; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + " |");
            }
            System.out.println();
        }
    }
}