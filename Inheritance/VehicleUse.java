package Inheritance;

public class VehicleUse {

    public static void main(String[] args) {
        // Vehicle v = new Vehicle("yellow");
        Vehicle v;
        // v = new Car();
        // System.out.println(v.ismotorized());

        v = new BMW();
        System.out.println(v.ismotorized());
        System.out.println(v.getcompany());
        v = new Bicycle();
        System.out.println(v.ismotorized());
        System.out.println(v.getcompany());

        // we can create any class object from Object class
        // Object o = new Bicycle();
        // Object o2 = new Car();
        // o = new Car();
        // v.color = "red";
        // v.getColor();
        // v.maxSpeed = 300;

        // Car c = new Car();
        // c.color = "black";
        // c.setColor("black");
        // c.maxSpeed = 240;
        // c.numDoors = 4;

        // Bicycle b = new Bicycle();
        // b.color = "blue";
        // b.setColor("blue");
        // b.maxSpeed = 40;

        // BMW bmw = new BMW();
        // v.Print();
        // c.Print();
        // c.PrintCar();
        // b.Print();
    }
}
