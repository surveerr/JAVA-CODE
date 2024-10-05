package tictactoePractice;

import java.util.Scanner;

public class TicTacToe {
    private Player player1, player2;
    private Board board;
    private int numplayer;

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        // player input
        player1 = takePlayerInput(++numplayer);
        player2 = takePlayerInput(++numplayer);
        while (player1.getsymbol() == player2.getsymbol()) {
            System.out.println("INVALID SYMBOL!! this symbol is already choosen");
            player2.setsymbol(sc.nextLine().charAt(0));
        }

        // boardgame
        board = new Board(player1.getsymbol(), player2.getsymbol());
        boolean player1Turn = true;
        int status = Board.INCOMPLETE;
        while (status == Board.INCOMPLETE || status == Board.INVALIDMOVE) {
            if (player1Turn == true) {
                System.out.println("player1- " + player1.getname() + "'s turn");
                System.out.println("enter x");
                int x = sc.nextInt();
                System.out.println("enter y");
                int y = sc.nextInt();
                status = board.move(player1.getsymbol(), x, y);
                if (status == Board.INVALIDMOVE) {
                    System.out.println("INVALID MOVE!! " + player1.getname());
                    continue;
                }
            } else {
                System.out.println("player 2- " + player2.getname() + "'s turn");
                System.out.println("enter x");
                int x = sc.nextInt();
                System.out.println("enter y");
                int y = sc.nextInt();

                status = board.move(player2.getsymbol(), x, y);
                if (status == Board.INVALIDMOVE) {
                    System.out.println("INVALID MOVE " + player2.getname());
                    continue;
                }
            }
            player1Turn = !player1Turn;
            board.Print();

        }
        if (status == Board.PLAYER1WINS) {
            System.out.println(player1.getname() + " won");
        } else if (status == Board.PLAYER2WINS) {
            System.out.println(player2.getname() + " won");
        } else
            System.out.println("DRAW");
    }

    public Player takePlayerInput(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter player " + num + " name");
        String name = sc.nextLine();
        System.out.println("enter player " + num + " symbol");
        char symbol = sc.nextLine().charAt(0);
        Player p = new Player(name, symbol);

        return p;

    }

}
