package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Pattern for N = 3
/*
###
###
###
  */

public class BasicPattern {
    private static Scanner sc = new Scanner(System.in);

    public static void basicpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        basicpattern(n);
    }
}
