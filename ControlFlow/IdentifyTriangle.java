package ControlFlow;

import java.util.Scanner;

public class IdentifyTriangle {
    public static void Triangle(int x, int y, int z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            System.out.println("Not a Triangle");
        } else if (x != y && y != z && x != z) {
            System.out.println("Scalene Triangle");
        } else if (x == y && y == z) {
            System.out.println("Equilateral Triangle");
        } else
            System.out.println("Isosceles Triangle");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();
        System.out.print("Enter Z: ");
        int z = sc.nextInt();

        Triangle(x, y, z);
        sc.close();
    }
}
