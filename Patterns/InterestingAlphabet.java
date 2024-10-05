package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 5
/*
E
DE
CDE
BCDE
ABCDE
 */
public class InterestingAlphabet {
    public static void Alphabet(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
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
