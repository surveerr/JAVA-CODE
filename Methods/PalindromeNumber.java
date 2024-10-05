package Methods;

import java.util.Scanner;

/*
Check whether a given number ’n’ is a palindrome number.

Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function. 
 */

public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int lastdigit = temp % 10;
            rev = rev * 10 + lastdigit;
            temp = temp / 10;
        }
        if (n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
