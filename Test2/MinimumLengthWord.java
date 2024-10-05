package Test2;

import java.util.Scanner;

/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
 */

public class MinimumLengthWord {
    private static Scanner sc = new Scanner(System.in);

    public static String takeInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String minimumWord(String str) {
        int start = 0;
        int end = str.length() - 1;
        String ans = "";
        int wordCount = Integer.MAX_VALUE;

        int crrCount = 0;
        String crrString = "";
        for (int i = start; i < str.length(); i++) {
            crrCount = 0;
            crrString = "";
            if (str.charAt(i) == ' ' || str.charAt(i) == ('\n')) {
                end = i;
                for (int j = start; j < end; j++) {
                    crrString += str.charAt(j);
                    crrCount++;
                }
                if (crrCount < wordCount) {
                    wordCount = crrCount;
                    ans = crrString;
                }
                start = i + 1;
            }
        }

        crrCount = 0;
        crrString = "";

        for (int i = start; i < str.length(); i++) {
            crrString += str.charAt(i);
            crrCount++;
        }
        if (crrCount < wordCount) {
            ans = crrString;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = takeInput();
        System.out.println(minimumWord(str));
    }
}
