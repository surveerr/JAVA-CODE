package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
 */

public class SecondLargestInArray {
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

    public static int SecondLargest(int arr[]) {
        Arrays.sort(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
