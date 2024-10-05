package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Pattern for N = 3
/*
***
 **
  *
  */
public class DownWardTriangle {
    public static void downwardTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        downwardTriangle(n);
        sc.close();
    }
}
