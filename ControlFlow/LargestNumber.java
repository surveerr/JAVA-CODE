package ControlFlow;

import java.util.Scanner;

// Write a program that takes three integers as input and prints the largest of the three numbers.

public class LargestNumber {
    public static void Largest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        }

        else if (b > a && b > c) {
            System.out.println(b);
        } else
            System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        Largest(a, b, c);
        sc.close();
    }
}
