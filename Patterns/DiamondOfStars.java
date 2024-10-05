package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 5
/*
  *
 ***
*****
 ***
  *
 */
public class DiamondOfStars {
    public static void DiamondStar(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n / 2; i > 0; i--) {
            for (int j = 0; j < n / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        DiamondStar(n);
        sc.close();
    }
}
