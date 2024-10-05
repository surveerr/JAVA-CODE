package Arrays;
/*
For Array A of size n, the prefix sum of A is another array P of size n+1,
where P[i] represents the sum of the first i elements of A. That is,
 */

import java.util.Scanner;

public class PrefixSum {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeArrayInput() {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void prefixSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        prefixSum(arr);
    }
}
