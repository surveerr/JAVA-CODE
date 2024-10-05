package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Pattern for N = 3
/*
1 2 3
2 3 1
3 1 2
  */
public class RotatePattern {
    public static void rotate(int n) {
        for (int i = 1; i <= n; i++) {
            int p = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(p++ + " ");
                if (p > n) {
                    p = 1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        rotate(n);
        sc.close();
    }
}
