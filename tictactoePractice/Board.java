package tictactoePractice;

public class Board {
    private char board[][];
    private char p1symbol;
    private char p2symbol;
    private int boardsize = 3;
    private int count;
    private static final char isEMPTY = ' ';

    public static final int PLAYER1WINS = 1;
    public static final int PLAYER2WINS = 2;
    public static final int DRAW = 3;
    public static final int INCOMPLETE = 4;
    public static final int INVALIDMOVE = 5;

    Board(char p1symbol, char p2symbol) {
        board = new char[boardsize][boardsize];
        for (int i = 0; i < boardsize; i++) {
            for (int j = 0; j < boardsize; j++) {
                board[i][j] = isEMPTY;
            }
        }
        this.p1symbol = p1symbol;
        this.p2symbol = p2symbol;
    }

    public int move(char symbol, int x, int y) {
        if (x < 0 || x >= boardsize || y < 0 || y >= boardsize || board[x][y] != isEMPTY) {
            return INVALIDMOVE;
        }
        board[x][y] = symbol;
        count++;

        // row
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
            return symbol == p1symbol ? PLAYER1WINS : PLAYER2WINS;
        }
        // column
        if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
            return symbol == p2symbol ? PLAYER2WINS : PLAYER1WINS;
        }

        // left diagonal
        if (board[0][0] != isEMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return symbol == p1symbol ? PLAYER1WINS : PLAYER2WINS;
        }

        // right diagonal
        if (board[0][2] != isEMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return symbol == p2symbol ? PLAYER2WINS : PLAYER1WINS;
        }
        if (count == boardsize * boardsize) {
            return DRAW;
        }
        return INCOMPLETE;
    }

    public void Print() {
        System.out.println("---------------");
        for (int i = 0; i < boardsize; i++) {
            for (int j = 0; j < boardsize; j++) {
                System.out.print("| " + board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
