package ClassAndObjects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("gaurav", 16);
        s1.name = "Gaurav";
        // s1.rollnumber = 16;
        // System.out.println("s1 " + s1);
        // s1.setrollnumber(15);
        // System.out.println(s1.name + " " + s1.getrollnumber());

        Student s2 = new Student("gaurav");
        // System.out.println("s2 " + s2);
        // s2.setrollnumber(16);
        // System.out.println(s2.name + " " + s2.rollnumber);
        System.out.println(Student.CONVERSION_FACTOR);
        Student.getnumberofStudent();
        // System.out.println(Student.numberofStudents);
        s1.Print();
        s2.Print();
        // s1.fun();
        // System.out.println(Student.a + Student.b);

    }
}
