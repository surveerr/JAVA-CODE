package Loops;

// Write a program that generates a multiplication table for a given integer.

import java.util.Scanner;

public class MultiplicationTable {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static void Table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        Table(n);
    }
}
