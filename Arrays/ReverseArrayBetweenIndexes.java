package Arrays;

import java.util.Scanner;

/*
Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.
Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive.
 */
public class ReverseArrayBetweenIndexes {
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

    public static int[] reverseBetweenIndexes(int arr[], int l, int r) {
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter left: ");
        int l = sc.nextInt();
        System.out.print("Enter right: ");
        int r = sc.nextInt();
        int arr[] = takeArrayInput();
        arr = reverseBetweenIndexes(arr, l, r);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
