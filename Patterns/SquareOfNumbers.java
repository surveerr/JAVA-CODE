package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Pattern for N = 3
/*
321
321
321
  */

public class SquareOfNumbers {
    public static void squareofnumbers(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n - j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        squareofnumbers(n);
        sc.close();
    }
}
