package Exceptions;

public class ExceptionDemo {
    public static int Fact(int n) throws NegativeNumberFactorial {
        if (n < 0) {
            throw new NegativeNumberFactorial();
        }
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int divide(int a, int b) throws DividebyZeroException {
        if (b == 0) {
            throw new DividebyZeroException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        int i = 0;
        try {
            System.out.println(Fact(5));
            i = divide(10, 0);
            System.out.println("try");
        } catch (DividebyZeroException e) {
            System.out.println("Divide by Zero exception");
        } catch (NegativeNumberFactorial e) {
            System.out.println("NegativeNumberFactorial");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }
        System.out.println(i);
        System.out.println("main");
    }
}
