package Test1;

import java.util.Scanner;

// Write a program to input an integer N and print the sum of all its even digits and all its odd digits separately.
// Digits mean numbers, not the places! If the given integer is "13245", the even digits are 2 and 4, and the odd digits are 1, 3, and 5.

public class SumOf_OddEven {
    public static void OddEven(int n) {
        int EvenSum = 0, OddSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                EvenSum += lastDigit;
            } else
                OddSum += lastDigit;

            n = n / 10;
        }
        System.out.print(EvenSum + " " + OddSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        OddEven(n);
        sc.close();
    }
}
