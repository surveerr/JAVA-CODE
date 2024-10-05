package Strings;

import java.util.Scanner;

/*
For a given a string(str), find and return the highest occurring character.
 */

public class HighestOccuringCharacter {
    private static Scanner sc = new Scanner(System.in);

    public static String takeStringInput() {
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        return str;
    }

    public static char highestOccuringBetter(String str) {
        int n = str.length();
        int frequency[] = new int[256];
        int maxFrequency = 0;
        for (int i = 0; i < n; i++) {
            frequency[str.charAt(i)]++;
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
        }

        char answer = ' ';

        for (int i = 0; i < n; i++) {
            if (frequency[str.charAt(i)] == maxFrequency) {
                answer = str.charAt(i);
                break;
            }
        }
        return answer;
    }

    public static char highestOccuring(String str) {
        char ch = ' ';
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ch = str.charAt(i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = takeStringInput();
        System.out.println(highestOccuring(str));
        System.out.println(highestOccuringBetter(str));
    }
}
