package Strings;

import java.util.Scanner;

/*
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
 */

public class MaximiseTheSum {
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

    public static int maxSum(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        while (i < arr1.length) {
            sum1 += arr1[i++];
        }
        while (j < arr2.length) {
            sum2 += arr2[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = takeInput();
        int arr2[] = takeInput();

        System.out.println(maxSum(arr1, arr2));
    }
}
