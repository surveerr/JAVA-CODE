package Recursion;

import java.util.Scanner;

/*
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
 */

public class SumOfArray {
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

    public static int ArraySumHelper(int arr[], int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + ArraySumHelper(arr, i + 1);
    }

    public static int ArraySum(int arr[]) {
        return ArraySumHelper(arr, 0);
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(ArraySum(arr));
    }
}
