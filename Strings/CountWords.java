package Strings;

import java.util.Scanner;

/*
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading
and trailing spaces in the given input string.
 */

public class CountWords {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        return str;
    }

    public static int countWordsBetter(String str) {
        int countWords = str.split(" ").length;
        return countWords;
    }

    public static int countWords(String str) {
        int words = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }
        return words + 1;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(countWords(str));
        System.out.println(countWordsBetter(str));
    }
}
