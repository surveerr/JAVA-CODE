package TimeComplexity;

import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 */

public class RotateArray {
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

    public static int[] Reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void rotateArray(int arr[], int x) {
        Reverse(arr, 0, arr.length - 1);
        Reverse(arr, 0, arr.length - x - 1);
        Reverse(arr, arr.length - x, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        rotateArray(arr, x);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
