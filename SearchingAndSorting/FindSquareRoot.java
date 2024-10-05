package SearchingAndSorting;

import java.util.Scanner;

/*
You are given a positive integer ‘N’. Your task is to find and return its square root.
If ‘N’ is not a perfect square, then return the floor value of sqrt(N).
 */
public class FindSquareRoot {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of array at index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int SquareRoot(long n) {
        if (n == 0 || n == 1) {
            return (int) n;
        }

        long l = 2;
        long r = n / 2;

        while (l < r) {
            long mid = (l + r) / 2;
            if (mid <= n / mid) {
                l = mid + 1;
            } else
                r = mid;
        }
        return (int) l - 1;
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        long n = sc.nextInt();
        System.out.println(SquareRoot(n));
    }
}
