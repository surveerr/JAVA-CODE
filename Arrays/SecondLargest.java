package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) of size N.
You are required to find and return the second largest element present in the array/list.
 */

public class SecondLargest {
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

    // O(n)
    public static int secondMaxOptimised(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // O(nlogn)
    public static int secondMax(int arr[]) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < max) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(secondMax(arr));
        System.out.println(secondMaxOptimised(arr));
    }
}
