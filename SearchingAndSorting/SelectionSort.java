package SearchingAndSorting;

import java.util.Scanner;

/*
Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.
 */

public class SelectionSort {
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

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
