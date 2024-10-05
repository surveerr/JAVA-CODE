package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given an array/list and a number k. You have to find the kth smallest number.
 */

public class FindKthSmallest {
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

    public static int KthSmallest(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter k Index: ");
        int k = sc.nextInt();
        System.out.println(KthSmallest(arr, k));
    }
}
