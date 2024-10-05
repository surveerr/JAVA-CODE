package Test1;

import java.util.Scanner;

// Print the following pattern for the given N number of rows.
// Pattern for N = 5
/*
5432*
543*1
54*21
5*321
*4321
 */
public class NumberStarPattern {
    public static void numberStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j == i + 1) {
                    System.out.print("*");
                } else
                    System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        numberStarPattern(n);
        sc.close();
    }
}
