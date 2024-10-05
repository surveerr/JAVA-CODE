package Recursion;

import java.util.Scanner;

/*
You are given a number 'n'.

Return number of digits in ‘n’.
 */
public class NumberOfDigits {
    public static int numDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = 1;
        int smallInput = numDigit(n / 10);
        return ans + smallInput;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numDigit(n));
        sc.close();
    }
}
