package ClassAndObjects;

public class Student {
    String name;
    private int rollnumber;
    double cgpa;
    public final static double CONVERSION_FACTOR = 0.95;
    static int numberofStudents;

    // Printing function
    public void Print() {
        System.out.println(name + " " + rollnumber);
    }

    // constructors with no arguments
    public Student() {
        name = "gaurav";
        rollnumber = 21;
        numberofStudents++;
    }

    // constructors with one arguments
    public Student(String name) {
        this.name = name;
        numberofStudents++;
    }

    // constructors with two arguments
    public Student(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
        numberofStudents++;
    }

    // get method
    public int getrollnumber() {
        return rollnumber;
    }

    public static int getnumberofStudent() {
        return numberofStudents;
    }

    // set method
    public void setrollnumber(int rollnumber) {
        System.out.println("this " + this);
        this.rollnumber = rollnumber;
    }

}
