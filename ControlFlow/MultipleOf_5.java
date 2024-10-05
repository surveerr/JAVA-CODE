package ControlFlow;

import java.util.Scanner;

// Given a number, print " Multiple of 5" if the number is a multiple of 5, otherwise print "Not a Multiple of 5"

public class MultipleOf_5 {
    public static void Multiple(int num) {
        switch (num % 5) {
            case 0:
                System.out.println("Multiple of 5");

                break;

            default:
                System.out.println("Not Multiple of 5");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        Multiple(num);
        sc.close();
    }
}
