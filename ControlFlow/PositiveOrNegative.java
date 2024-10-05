package ControlFlow;

// You are given an integer n. If the number is less than zero then the print ‘Negative’ otherwise the print ‘Positive’.

import java.util.Scanner;

public class PositiveOrNegative {
    public static void PosOrNeg(int n) {
        if (n < 0) {
            System.out.println("Negative");
        } else
            System.out.println("Positive");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        PosOrNeg(n);
        sc.close();
    }
}
