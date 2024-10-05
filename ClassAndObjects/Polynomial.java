package ClassAndObjects;

public class Polynomial {
    private int degCoeff[];

    // constructor
    public Polynomial() {
        degCoeff = new int[10];
    }

    // Increase capacity
    public void IncreaseCapacity(int degree) {
        int temp[] = degCoeff;
        degCoeff = new int[degree + 1];
        for (int i = 0; i < temp.length; i++) {
            degCoeff[i] = temp[i];
        }
    }

    // set-Polynomial
    public void setCoefficient(int degree, int coefficient) {
        if (degree >= degCoeff.length) {
            IncreaseCapacity(degree);
        }
        degCoeff[degree] = coefficient;
    }

    // print
    public void Print() {
        for (int i = 0; i < degCoeff.length; i++) {
            System.out.print(degCoeff[i] + " ");
        }
    }

    // get-Polynomial
    public int getCoefficient(int index) {
        return degCoeff[index];
    }

    // addition
    public static Polynomial addition(Polynomial p1, Polynomial p2) {
        Polynomial p3 = new Polynomial();
        int i = 0, j = 0, k = 0;
        while (i < p1.degCoeff.length && j < p2.degCoeff.length) {
            p3.setCoefficient(k++, p1.degCoeff[i++] + p2.degCoeff[j++]);
        }
        while (i < p1.degCoeff.length) {
            p3.setCoefficient(k++, p1.degCoeff[i++]);
        }
        while (j < p2.degCoeff.length) {
            p3.setCoefficient(k++, p2.degCoeff[j++]);
        }

        return p3;
    }

    // addition with one argument
    public Polynomial addition(Polynomial p) {
        int i = 0, j = 0, k = 0;
        while (i < this.degCoeff.length && j < p.degCoeff.length) {
            this.setCoefficient(k++, this.degCoeff[i++] + p.degCoeff[j++]);
        }
        while (i < this.degCoeff.length) {
            this.setCoefficient(k++, this.degCoeff[i++]);
        }
        while (j < p.degCoeff.length) {
            this.setCoefficient(k++, p.degCoeff[j++]);
        }
        return this;
    }

    // Substraction
    public static Polynomial substraction(Polynomial p1, Polynomial p2) {
        Polynomial p3 = new Polynomial();
        int i = 0, j = 0, k = 0;
        while (i < p1.degCoeff.length && j < p2.degCoeff.length) {
            p3.setCoefficient(k++, p1.degCoeff[i++] - p2.degCoeff[j++]);
        }
        while (i < p1.degCoeff.length) {
            p3.setCoefficient(k++, p1.degCoeff[i++]);
        }
        while (j < p2.degCoeff.length) {
            p3.setCoefficient(k++, p2.degCoeff[j++]);
        }
        return p3;
    }

    // substraction with one argument
    public Polynomial substaction(Polynomial p) {
        int i = 0, j = 0, k = 0;
        while (i < this.degCoeff.length && j < p.degCoeff.length) {
            this.setCoefficient(k++, this.degCoeff[i++] - p.degCoeff[j++]);
        }
        while (i < this.degCoeff.length) {
            this.setCoefficient(k++, this.degCoeff[i++]);
        }
        while (j < p.degCoeff.length) {
            this.setCoefficient(k++, p.degCoeff[j++]);
        }
        return this;
    }

    // Multiplication with one argument
    public Polynomial multiplication(Polynomial p) {
        for (int i = 0; i < this.degCoeff.length; i++) {
            for (int j = 0; j < p.degCoeff.length; j++) {
                this.setCoefficient(i + j, this.degCoeff[i] * p.degCoeff[j]);
            }
        }
        return this;
    }
}
