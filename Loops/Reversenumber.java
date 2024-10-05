package Loops;

import java.util.Scanner;

// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

public class Reversenumber {
    public static int takeInput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        System.out.println(reverse(n));
    }

}
