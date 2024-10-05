package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 5
/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
public class HourglassPattern {
    public static void Hourglass(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            int p = i + 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            int p = i;
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Hourglass(n);
        sc.close();
    }
}
