package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Pattern for N = 3
/*
123
1 2
123
  */
public class HallowNumSquare {
    public static void hallowNumSq(int n) {
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(j);
                } else if (j == 1 || j == n) {
                    System.out.print(p++);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        hallowNumSq(n);
        sc.close();
    }
}
