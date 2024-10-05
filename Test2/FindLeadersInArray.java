package Test2;

import java.util.Scanner;
/*
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element
A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the reverse order. That means whichever leader comes
at last should be printed first.
 */

public class FindLeadersInArray {
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

    public static void Leaders(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        Leaders(arr);
    }
}
