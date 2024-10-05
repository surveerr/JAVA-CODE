package Arrays;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list.
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
 */

public class Sort_0_1 {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeArrayInput() {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of array at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort01(int arr[]) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            if (arr[l] > arr[r]) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            } else if (arr[l] == 0) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        bubbleSort(arr);
        // sort01(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
