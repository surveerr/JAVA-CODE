package Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public void Print() {
        System.out.println(numerator + "/" + denominator);
    }

    private void Simplyfy() {
        int gcd = 1;
        int smaller = Integer.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public void increment() {
        this.numerator = numerator + denominator;
        Simplyfy();
    }

    // Add function
    public void add(Fraction f) {
        // first fraction is on which the function is called;
        // other fraction that is going to be added is an argument which will be passed;

        this.numerator = (this.numerator * f.denominator + f.numerator * this.denominator);
        this.denominator = (this.denominator * f.denominator);
        Simplyfy();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int new_numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int new_denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(new_numerator, new_denominator);
        return f3;
    }

    // Multiplication
    public void Multiplication(Fraction f) {
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        Simplyfy();
    }

    public static Fraction Multiplication(Fraction f1, Fraction f2) {
        int new_numerator = f1.numerator * f2.numerator;
        int new_denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(new_numerator, new_denominator);
        return f3;
    }

    // Substraction
    public void Subtraction(Fraction f) {
        this.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        this.denominator = this.denominator * f.denominator;
        Simplyfy();
    }

    public static Fraction Substraction(Fraction f1, Fraction f2) {
        int new_numerator = (f1.numerator * f2.denominator) - (f1.denominator * f2.numerator);
        int new_denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(new_numerator, new_denominator);
        return f3;
    }

    // constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
        Simplyfy();
    }

    // set method
    public void setnumerator(int num) {
        this.numerator = num;
    }

    public void setdenominator(int num) {
        if (num == 0) {
            return;
        }
        this.denominator = num;
    }

    // get method
    public int getnumerator() {
        return numerator;
    }

    public int getdenominator() {
        return denominator;
    }
}
