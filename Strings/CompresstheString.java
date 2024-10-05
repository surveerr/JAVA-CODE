package Strings;

import java.util.Scanner;

/*
Write a program to do basic string compression. For a character which is consecutively repeated more than
once, replace consecutive duplicate occurrences with the count of repetitions.
 */

public class CompresstheString {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String CompressString(String str) {
        String result = "";
        int count = 1;
        int i;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count != 1)
                    result = result + str.charAt(i) + count;
                else
                    result = result + str.charAt(i);
                count = 1;

            }
        }
        if (count != 1)
            result = result + str.charAt(i) + count;
        else
            result = result + str.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        String ans = CompressString(str);
        System.out.println(ans);
    }
}
