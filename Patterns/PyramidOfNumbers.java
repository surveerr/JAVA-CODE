package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Pattern for N = 4
/*
   1
  2 2
 3 3 3
4 4 4 4
  */
public class PyramidOfNumbers {
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        pyramid(n);
        sc.close();
    }
}
