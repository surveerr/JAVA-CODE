package Methods;

import java.util.Scanner;

/*
Given two values, n and r, write a function to calculate the permutation (nPr) for n ≥ r ≥ 0. 
The function should return -1 if n < r or if n or r are negative. The program should include two functions: 
one to calculate the factorial of a number and another to calculate the permutation.
 */
// nPr=n!/(n-r)!

public class Permutation {
    public static int permutation(int n, int r) {
        return Factorial.factorial(n) / Factorial.factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects: ");
        int n = sc.nextInt();
        System.out.print("Enter number of objects selected: ");
        int r = sc.nextInt();
        System.out.println(permutation(n, r));
        sc.close();
    }
}
