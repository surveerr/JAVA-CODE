package Recursion;

import java.util.Scanner;

/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
 */

public class XtoPowerN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}
