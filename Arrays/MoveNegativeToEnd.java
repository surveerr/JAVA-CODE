package Arrays;

import java.util.Scanner;

/*
You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the
array elements such that all negative numbers appear before all positive numbers.
 */

public class MoveNegativeToEnd {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeArrayInput() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter vale of array at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] NegativeToEnd(int arr[]) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        arr = NegativeToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
