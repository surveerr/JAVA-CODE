package Strings;

import java.util.Scanner;

/*
For a given string(str), remove all the consecutive duplicate characters.
 */

public class RemoveConsecutiveDuplicates {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String consecutiveDuplicates(String str) {
        String result = "";
        char ch = str.charAt(0);
        result += ch;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(consecutiveDuplicates(str));
    }
}
