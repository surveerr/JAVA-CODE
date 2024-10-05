package Strings;

import java.util.Scanner;

/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function
so as to change the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.
 */

public class ReverseEachWord {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String reverse(String str) {
        String result = "", reverseWord = "";
        int start = 0, end;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                end = i;
                reverseWord = "";
                for (int j = start; j < end; j++) {
                    reverseWord = str.charAt(j) + reverseWord;
                }
                start = i + 1;
                result += reverseWord + " ";
            }
        }
        reverseWord = "";
        for (int i = start; i < str.length(); i++) {
            reverseWord = str.charAt(i) + reverseWord;
        }
        result += reverseWord;
        return result;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(reverse(str));
    }
}
