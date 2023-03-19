package tictac;
import java.util.Arrays;
import java.util.Scanner;
public class TicTacToeGame {


    public class TicTacToeGame {

    }
            {' ', '|', ' ', '|', ' '};
            {'_', '+', '_', '+', '_'};
            {' ', '|', ' ', '|', ' '};
        public static void printgameboard(char[][] gameboard) {
            void printgameboard(char[][] gameboard) {

                for (char[] row : gameBoard) {
                    for (char column : row){
                        @@ -19,11 +19,23 @@ public static void printgameboard(char[][] gameboard) {
                            System.out.println("  ");
                        }
                    }
                    void selectLetter(){
                        Scanner input = new Scanner(System.in);
                        System.out.println("Select any letter in between X or O: ");
                        String letter = input.nextLine();
                        System.out.println("selected letter is :  "+letter);
                        if(letter.toLowerCase().equals("x")){
                            System.out.println("and Computer will choose: O");
                        } else if (letter.toLowerCase().equals("o")) {
                            System.out.println("and Computer will choose: X");
                        }
                    }

                    public static void main(String[] args) {
                        System.out.println("Welcome to TIC TAC TOE Game ");
                        TicTacToeGame game = new TicTacToeGame();
                        printgameboard(gameBoard);
                        game.printgameboard(gameBoard);
                        game.selectLetter();

                    }
}

