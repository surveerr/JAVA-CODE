package Patterns;

import java.util.Scanner;

// You are given an integer N. Your task is to print the pascal’s triangle till the row N.
// A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows.
// Pascal's triangle contains the values of the binomial coefficient.
// Pattern for N = 6
/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
 */
public class PascalsTriangle {
    public static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            int p = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(p + " ");
                p = p * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        pascalsTriangle(n);
        sc.close();
    }
}
