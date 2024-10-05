package SearchingAndSorting;

import java.util.Scanner;

/*
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
merge them into a third array/list such that the third array is also sorted.
 */

public class MergeTwoSortedArrays {
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

    public static int[] MergeSortedArrays(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                ans[k++] = arr2[j++];
            } else {
                ans[k++] = arr1[i];
                ans[k++] = arr2[j];
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Input for arr1");
        int arr1[] = takeInput();
        System.out.println("Input for arr2");
        int arr2[] = takeInput();

        int ans[] = MergeSortedArrays(arr1, arr2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
