package Inheritance;

public class BMW extends Car {
    BMW() {
        System.out.println("BMW default constructor");
    }

    @Override
    public String getcompany() {
        return "BMW";
    }
}
