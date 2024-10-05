package ClassAndObjects;

public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(30, 300);
        // System.out.println(p1.getCoefficient(3));
        // p1.Print();
        System.out.println();
        Polynomial p2 = new Polynomial();
        p2.setCoefficient(3, 200);
        // p2.Print();
        System.out.println();
        // System.out.println(p2.getCoefficient(3));
        Polynomial p3 = new Polynomial();
        p1.setCoefficient(5, 40);
        p2.setCoefficient(5, 60);
        p3 = Polynomial.addition(p1, p2);
        p3 = Polynomial.substraction(p2, p1);

        // p1.addition(p2);
        // p1.substaction(p2);

        p1.multiplication(p2);
        // System.out.println(p3.getCoefficient(3));
        // p3.Print();
        // System.out.println();
        // System.out.print("p1 is == ");
        p1.Print();
    }
}
