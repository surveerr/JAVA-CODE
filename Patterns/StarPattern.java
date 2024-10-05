package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
/*
    *
   ***
  *****
 *******
 */
public class StarPattern {
    public static void Star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Star(n);
        sc.close();
    }
}
