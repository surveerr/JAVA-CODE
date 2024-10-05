package Loops;

import java.util.Scanner;

// Given an integer n, find and print the sum of numbers from 1 to n.

public class SumOfNnumbers {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    // through Recursion
    public static int recSum(int n) {
        if (n == 0) {
            return 0;
        }
        return recSum(n - 1) + n;
    }

    // through loop
    public static int nSum(int n) {
        int sum = n;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        System.out.println(recSum(n));
        System.out.println(nSum(n));
    }
}
