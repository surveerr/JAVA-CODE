package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Pattern for N = 3
/*
1
22
333
  */

public class Triangle {
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        triangle(n);
        sc.close();
    }
}
