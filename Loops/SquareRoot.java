package Loops;

import java.util.Scanner;

// Given a number N, find its square root. You need to find and print only the integral part of square root of N.

public class SquareRoot {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static int squareRoot(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (Math.sqrt(n) == i) {
                    return i;
                } else if (Math.sqrt(n) < i) {
                    return i - 1;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        System.out.println(squareRoot(n));
    }
}
