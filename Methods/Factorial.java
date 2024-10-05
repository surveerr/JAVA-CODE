package Methods;

import java.util.Scanner;

// Given an integer n, find and Return the factorial of the given integer.
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
