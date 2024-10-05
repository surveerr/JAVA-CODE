package Methods;

import java.util.Scanner;

/*
Given two numbers, x, and y, calculate and Return their GCD.

GCD stands for "Greatest Common Divisor." It refers to the largest positive integer that divides two or more numbers without leaving a remainder. 
 */

public class Gcd {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static int gcd(int x, int y) {
        while (x != 0) {
            if (y > x) {
                int temp = x;
                x = y;
                y = temp;
            }
            int oldY = y;
            x = x - y;
            y = oldY;
        }
        return y;

    }

    // gcd Optimised
    public static int gcdBetter(int x, int y) {
        while (y != 0) {
            int oldY = y;
            y = x % y;
            x = oldY;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = takeInput("Enter X: ");
        int y = takeInput("Enter Y: ");
        System.out.println(gcd(x, y));
        System.out.println(gcdBetter(x, y));
    }
}
