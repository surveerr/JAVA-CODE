package Loops;

import java.util.Scanner;

// Given a number N, print sum of all even numbers from 1 to N.

public class SumOfEven {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static int EvenSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        System.out.println(EvenSum(n));

    }
}
