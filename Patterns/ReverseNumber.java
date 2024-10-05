package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
//Note: Pattern for N = 4
/*
1
21
321
4321
  */
public class ReverseNumber {
    public static void reverseNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int p = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        reverseNumber(n);
        sc.close();
    }
}
