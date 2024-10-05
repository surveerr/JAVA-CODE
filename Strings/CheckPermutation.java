package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
 */

public class CheckPermutation {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = takeStringInput();
        String str2 = takeStringInput();
        System.out.println(checkPermutation(str1, str2));
    }
}
