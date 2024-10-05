package Test2;

import java.util.Scanner;

/*
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
 */
public class Sort0_1_2 {
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

    public static int[] BubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] Sort(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        // Sort(arr);
        BubbleSorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
