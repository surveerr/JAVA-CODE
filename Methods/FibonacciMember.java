package Methods;

import java.util.Scanner;

/*
Create a function that determines whether a given number N belongs to the Fibonacci sequence.
If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.
 */

public class FibonacciMember {
    public static boolean isFibonacciMember(int n) {
        int fibo = 0, a = 0, b = 1;
        while (fibo <= n) {
            if (fibo == n) {
                return true;
            }
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isFibonacciMember(n));
        sc.close();
    }
}
