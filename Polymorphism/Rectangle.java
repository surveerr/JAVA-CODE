package Polymorphism;

public class Rectangle extends Shape {
    int length;
    int breadth;

    // constructors
    Rectangle() {
        // System.out.println("Rectangle's default constructor ");
        // System.out.println("length " + length + " breadth " + breadth);
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        // System.out.println("length " + length + " breadth " + breadth);
    }

    void info() {
        System.out.println("length " + length + " breadth " + breadth);
    }

    void info(String type) {
        System.out.println(type + " length " + length + " breadth " + breadth);
    }

    public void draw() {
        System.out.println("Rectangle drawn");
    }

}
