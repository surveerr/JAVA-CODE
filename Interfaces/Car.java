package Interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface {

    public boolean isMotorized() {
        return true;
    }

    public String getCompany() {
        return null;
    }

    @Override
    public int gears() {
        return 4;
    }

    public void Print() {
        System.out.println(pi);
    }

}
