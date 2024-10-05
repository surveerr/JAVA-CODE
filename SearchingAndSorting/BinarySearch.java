package SearchingAndSorting;

import java.util.Scanner;

/*
You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing.
If 'target' is not present in the array 'A', return -1.
 */

public class BinarySearch {
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

    public static int binarySearch(int arr[], int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter target: ");
        int x = sc.nextInt();
        System.out.println(binarySearch(arr, x));
    }
}
