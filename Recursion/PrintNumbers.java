package Recursion;

import java.util.Scanner;

/*
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
 */

public class PrintNumbers {
    public static void numPrint(int n) {
        if (n == 0) {
            return;
        }

        numPrint(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        numPrint(n);
        sc.close();
    }
}
