package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Print spaces between the numbers. Pattern for N = 5
/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
  */
public class DescendingOrder {
    public static void descendingOrder(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        descendingOrder(n);
        sc.close();
    }
}
