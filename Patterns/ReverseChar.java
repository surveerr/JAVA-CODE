package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
/*
E
ED
EDC
EDCB
EDCBA
 */

public class ReverseChar {
    public static void reverseChar(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        reverseChar(n);
        sc.close();
    }

}
