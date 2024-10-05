package Loops;

import java.util.Scanner;

// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between 
// computing the sum and computing the product of all integers in the range 1 to N (both inclusive).

public class SumOrProduct {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static int sumorproduct(int n, int c) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            product *= i;
        }
        if (c == 1) {
            return sum;
        } else if (c == 2)
            return product;

        return -1;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        int c = takeInput("Enter choice: ");

        System.out.println(sumorproduct(n, c));
    }

}
