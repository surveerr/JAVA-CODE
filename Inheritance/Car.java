package Inheritance;

public abstract class Car extends Vehicle {
    int numDoors;

    // constructor
    Car() {
        super("red");
        System.out.println("car's default constructor");
    }

    public void Print() {
        super.Print();
        System.out.println("Car " + "color " + getColor() + " maxSpeed " + maxSpeed + " numDoors " + numDoors + " ");
    }

    @Override
    public boolean ismotorized() {
        return true;
    }

}