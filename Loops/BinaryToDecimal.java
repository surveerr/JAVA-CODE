package Loops;

import java.util.Scanner;

// Given a binary number as an integer N, convert it into decimal and print.

public class BinaryToDecimal {

    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static int B2D(int n) {
        int decimal = 0;
        int i = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            decimal += (int) Math.pow(2, i) * lastdigit;
            i++;
            n = n / 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int n = takeInput("Enter number: ");
        System.out.println(B2D(n));
    }
}
