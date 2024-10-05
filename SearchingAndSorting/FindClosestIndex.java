package SearchingAndSorting;

import java.util.Scanner;

/*
You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'.
Your task is to return the index of closest element to the 'target' in the array 'nums'.
 */

public class FindClosestIndex {
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

    public static int closestIndex(int arr[], int x) {
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
        return r;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter target: ");
        int x = sc.nextInt();
        System.out.println(closestIndex(arr, x));
    }
}
