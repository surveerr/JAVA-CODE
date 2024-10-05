package Test1;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 3
/*
A
A B
A B C
 */
public class GameOfAlphabet {
    public static void Alphabet(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Alphabet(n);
        sc.close();
    }
}
