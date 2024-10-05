package Strings;

import java.util.Scanner;

/*
For a given input string(str), write a function to print all the possible substrings.

A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous.
 */

public class AllSubstrings {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static void AllsubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        AllsubStrings(str);
    }
}
