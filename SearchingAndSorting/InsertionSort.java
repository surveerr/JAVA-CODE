package SearchingAndSorting;

import java.util.Scanner;

/*
You need sort an Array using Insertion Sort.
 */

public class InsertionSort {
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

    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int crrElement = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > crrElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = crrElement;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
