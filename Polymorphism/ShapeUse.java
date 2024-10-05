package Polymorphism;

import java.util.Scanner;

public class ShapeUse {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 4);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // r2.info();
        // r2.info("Rectangle");

        // Shape s = new Circle();
        // s.draw();
        // s = new Rectangle();
        // s.draw();
        Shape s2;
        if (n <= 10) {
            s2 = new Circle();
        } else
            s2 = new Rectangle();

        Circle c = new Circle();
        c.radius = 12;
        s2.draw();
    }
}
