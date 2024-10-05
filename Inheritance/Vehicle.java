package Inheritance;

public abstract class Vehicle {
    private String color;
    int maxSpeed;

    // Vehicle() {
    // System.out.println("Vehicle's default constructor");
    // }

    Vehicle(String color) {
        this.color = color;
        System.out.println("Vehicle's parameterised constructor");
    }

    public void Print() {
        System.out.println("color " + color + " maxSpeed " + maxSpeed);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract boolean ismotorized();

    public abstract String getcompany();
}
