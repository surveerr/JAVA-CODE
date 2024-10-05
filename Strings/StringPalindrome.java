package Strings;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome

A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
 */

import java.util.Scanner;

public class StringPalindrome {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        return str;
    }

    public static boolean Palindrome(String str) {
        StringBuilder sf = new StringBuilder(str);
        sf.reverse();
        return str.equals(sf.toString());
    }

    // public static boolean isPalindromeBetter(String str, int l, int r) {
    // if (l >= r) {
    // return true;
    // }
    // if (str.charAt(l) != str.charAt(r)) {
    // return false;
    // }

    // return isPalindromeBetter(str, l++, r--);
    // }

    // public static boolean isPalindromeBetter(String str) {
    // return isPalindromeBetter(str, 0, str.length() - 1);
    // }

    public static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(isPalindrome(str));
        // System.out.println(isPalindromeBetter(str));
        System.out.println(Palindrome(str));
    }
}
