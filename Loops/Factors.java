package Loops;

import java.util.Scanner;

// Write a program that takes a number as input and prints all its factors except 1 and the number itself..
// If the number has only two factors (1 and the number itself), then the program should print -1.

public class Factors {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static void factor(int n) {
        boolean isfactor = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                isfactor = true;
            }
        }
        if (!isfactor) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        factor(n);
    }
}
