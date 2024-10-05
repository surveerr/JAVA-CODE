package Arrays;

import java.util.Scanner;

/*
Given an array 'arr' of size 'n'.
Return an array with all the elements placed in reverse order.
 */
public class ReverseArray {
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

    public static int[] reverseArrayBetter(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        for (int i = l; i <= r; i++) {
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        reverseArray(arr);
        System.out.println();
        arr = reverseArrayBetter(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
