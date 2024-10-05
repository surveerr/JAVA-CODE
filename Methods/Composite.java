package Methods;

import java.util.Scanner;

/*
Your task is to write a function named print_composite that prints if there are any composite numbers up to a given number, n.

Composite numbers are positive integers greater than 1 that have more than two positive divisors. 
In other words, a composite number has factors other than 1 and itself.
 */

public class Composite {
    public static boolean isComposite(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void PrintComposite(int n) {
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        PrintComposite(n);
        sc.close();
    }
}
