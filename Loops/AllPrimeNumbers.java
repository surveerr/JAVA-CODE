package Loops;

// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// Print the prime numbers in different lines.

import java.util.Scanner;

public class AllPrimeNumbers {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static boolean isPrime(int n) {
        boolean flag = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = takeInput("Enter n: ");
        printPrimes(n);
    }

}
