package Generic;

public class Student implements PrintInterface {
    int rollnumber;

    Student(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    @Override
    public void Print() {
        System.out.println(rollnumber);
    }

}
