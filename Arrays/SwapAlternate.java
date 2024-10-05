package Arrays;

import java.util.Scanner;
/*
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
 */

public class SwapAlternate {
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

    public static int[] swapAlternate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        arr = swapAlternate(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
