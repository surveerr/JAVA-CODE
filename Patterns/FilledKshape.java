package Patterns;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
/*
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1
 */
public class FilledKshape {
    public static void Kshape(int n) {
        for (int i = n; i > 0; i--) {
            int p = i;
            for (int j = 0; j < i; j++) {
                System.out.print(p-- + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            int p = i + 1;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(p-- + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Kshape(n);
        sc.close();
    }
}
