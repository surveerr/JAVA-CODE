package Inheritance;

public class Bicycle extends Vehicle {
    Bicycle() {
        super("red");
        System.out.println("Bicycle's default constructor");
    }

    public boolean ismotorized() {
        return false;
    }

    @Override
    public String getcompany() {
        return "Hero";
    }
}
