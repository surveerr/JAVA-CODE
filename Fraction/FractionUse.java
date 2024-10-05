package Fraction;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        // f1.Print();
        // f1.increment();

        // f1.setnumerator(3);
        // f1.setdenominator(0);
        // f1.getdenominator();
        Fraction f2 = new Fraction(1, 2);
        // f2.Print();
        f1.add(f2);
        // Fraction f3 = Fraction.add(f1, f2);
        // f1.Multiplication(f2);

        // Fraction f3 = Fraction.Multiplication(f1, f2);
        // f1.Subtraction(f2);

        Fraction f3 = Fraction.Substraction(f1, f2);

        f1.Print();
        f3.Print();
    }
}
