package Arrays;

import java.util.Scanner;

/*
Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array
while keeping the non-zero elements at the start of the array in their original order. Return the modified array.
 */

public class MoveZeroesToEnd {
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

    public static int[] ZerotoEnd(int arr[]) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
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
        arr = ZerotoEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
