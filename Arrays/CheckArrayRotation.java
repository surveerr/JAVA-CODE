package Arrays;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and
then rotated by some number 'K' (K is greater than 0) in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
 */

public class CheckArrayRotation {
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

    public static int CheckRotation(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return k + 1;
            }
            k++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(CheckRotation(arr));
    }
}
