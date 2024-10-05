package Loops;

import java.util.Scanner;

// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W,
// into their corresponding Celsius values and print the table.
public class FarenheitToCelcius {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static void F2C(int s, int e, int w) {
        while (s <= e) {
            int Celsius = ((s - 32) * 5) / 9;
            System.out.println(s + " " + Celsius);
            s += w;
        }
    }

    public static void main(String[] args) {
        int s = takeInput("Enter start value: ");
        int e = takeInput("Enter end value: ");
        int w = takeInput("Enter gap: ");
        F2C(s, e, w);
    }
}
