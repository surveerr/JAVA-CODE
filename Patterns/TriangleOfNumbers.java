package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 5
/*
           1
          232
         34543
        4567654
       567898765
 */
public class TriangleOfNumbers {
    public static void NumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int p = i;
            int q = (2 * i) - 2;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                if (p <= (2 * i) - 1) {
                    System.out.print(p++);
                } else {
                    System.out.print(q--);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        NumberTriangle(n);
        sc.close();
    }
}
