package Loops;

import java.util.Scanner;

// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

public class TermsOfAp {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static void Ap(int n) {
        int i = 1;
        while (n > 0) {
            int term = 3 * i + 2;
            if (term % 4 != 0) {
                System.out.println(term);
                n--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        Ap(n);
    }

}
