package tictac;

public class TicTacToeGame {
    public void board() {
        char[] board = new char[11]; // create board of char[] of size 11
        Arrays.fill(board, 1, board.length, ' '); // assign empty space to each element starting from index 1
        // print the board to verify
        System.out.println(Arrays.toString(board));
        char[][] gameBoard = {{' ', ' ', ' ', ' ', ' '}, //ignoring 0th index as
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};
        public static void printgameboard (char[][] gameboard){

            for (char[] row : gameBoard) {
                for (char column : row) {
                    System.out.print("  " + column);
                }
                System.out.println("  ");
            }
        }

        public static void main(String[]args)
        {
            System.out.println("Welcome to TIC TAC TOE Game ");
            TicTacToeGame game = new TicTacToeGame();
            game.board();
            printgameboard(gameBoard);

        }
    }

    private void printgameboard(char[][] gameBoard) {
    }
}

