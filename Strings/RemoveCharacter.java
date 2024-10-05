package Strings;

import java.util.Scanner;

/*
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
 */

public class RemoveCharacter {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String removeCharacter(String str, char x) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != x) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.print("Enter character to remove: ");
        char x = sc.next().charAt(0);
        System.out.println(removeCharacter(str, x));
    }
}
