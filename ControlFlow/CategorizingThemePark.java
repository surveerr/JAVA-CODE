package ControlFlow;

import java.util.Scanner;

// Write a program for a theme park that categorizes visitors into four groups:
// infants, children, adults, and seniors, based on their age. The program should print a message indicating the category the visitor falls into.

public class CategorizingThemePark {
    public static void CategorizingVisitors(int age) {
        if (age <= 4) {
            System.out.println("Infats");
        } else if (age > 4 && age <= 12) {
            System.out.println("Children");
        } else if (age > 12 && age <= 64) {
            System.out.println("Adults");
        } else {
            System.out.println("Seniors");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        CategorizingVisitors(age);
        sc.close();
    }
}
