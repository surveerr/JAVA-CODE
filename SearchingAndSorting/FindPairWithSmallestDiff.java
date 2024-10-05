package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

/*
Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements
(one from each array), such that their absolute (non-negative) difference is the smallest, and return the min difference.
 */

public class FindPairWithSmallestDiff {
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

    public static int DiffWithSmallestPair(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;

        int minDiff = Integer.MAX_VALUE;

        while (i < arr1.length && j < arr2.length) {
            minDiff = Math.min(Math.abs(arr1[i] - arr2[j]), minDiff);

            if (arr1[i] > arr2[j]) {
                j++;
            } else
                i++;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println("Input arr1 ");
        int arr1[] = takeInput();
        System.out.println("Input arr2 ");
        int arr2[] = takeInput();

        System.out.println(DiffWithSmallestPair(arr1, arr2));
    }
}
