package Arrays;
/*
There is an array ‘A’ of size ‘N’.
You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.
You must return the rotated array.
 */

import java.util.Scanner;

public class ArrayRotation {
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

    public static void reverse(int arr[], int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static int[] rotate(int arr[], int x, String dir) {
        x = x % arr.length;
        int l = 0;
        int r = arr.length - 1;
        reverse(arr, l, r);

        if (dir.equals("Right")) {
            l = 0;
            r = x - 1;
            reverse(arr, l, r);

            l = x;
            r = arr.length - 1;
            reverse(arr, l, r);
        } else if (dir.equals("Left")) {
            l = 0;
            r = arr.length - x - 1;
            reverse(arr, l, r);

            l = r + 1;
            r = arr.length - 1;
            reverse(arr, l, r);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rotation: ");
        int x = sc.nextInt();
        System.out.print("Enter direction: ");
        String dir = sc.next();
        int arr[] = takeArrayInput();
        rotate(arr, x, dir);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
