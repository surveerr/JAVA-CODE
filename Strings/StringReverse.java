package Strings;

import java.util.Scanner;

/*
you are given an String and you need to reverse the String.
 */

public class StringReverse {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static String reverse(String str) {
        StringBuffer sf = new StringBuffer(str);
        sf.reverse();
        return sf.toString();
    }

    public static String reveString(String str) {
       
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[str.length() - 1 - i];
            ch[str.length() - 1 - i] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(reverse(str));
        System.out.println(reveString(str));
    }
}
