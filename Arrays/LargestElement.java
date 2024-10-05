package Arrays;

import java.util.Scanner;

// Given an array ‘arr’ of size ‘n’ find the largest element in the array.

public class LargestElement {
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

    public static int largestElement(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            largest = Math.max(largest, i);
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(largestElement(arr));
    }
}
