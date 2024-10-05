package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
/*
4444
333
22
1
 */
public class InvertedNumberPattern {
    public static void invertedNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        invertedNumber(n);
        sc.close();
    }
}
