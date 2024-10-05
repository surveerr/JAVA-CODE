package Loops;

import java.util.Scanner;

// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

public class PowerOfnumber {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static int powerofnum(int x, int n) {
        return (int) Math.pow(x, n);
    }

    public static void main(String[] args) {
        int x = takeInput("Enter x: ");
        int n = takeInput("Enter n: ");
        System.out.println(powerofnum(x, n));
    }
}
