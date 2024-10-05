package Methods;

import java.util.Scanner;

// Write a program that calculates and returns the area of a circle given its radius.

public class AreaOfCircle {
    public static double CircleArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println(CircleArea(radius));
        sc.close();
    }
}
