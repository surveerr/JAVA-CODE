package Generic;

public class Vehicle implements PrintInterface {
    int maxSpeed;
    String Company;

    Vehicle(int maxSpeed, String Company) {
        this.maxSpeed = maxSpeed;
        this.Company = Company;
    }

    public void Print() {
        System.out.println(maxSpeed + " " + Company);
    }

    public void Sort() {

    }
}
