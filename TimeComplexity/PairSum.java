package TimeComplexity;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
 */

public class PairSum {
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

    public static int[] InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
        return arr;
    }

    public static int pairSum(int arr[], int x) {
        InsertionSort(arr);

        int l = 0;
        int r = arr.length - 1;
        int Pair = 0;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == x) {
                Pair++;
                int temp_r = r - 1;
                while (l < temp_r) {
                    if (arr[temp_r] == arr[r]) {
                        Pair++;
                        temp_r--;
                    } else
                        break;
                }
                l++;
            } else if (sum > x) {
                r--;
            } else
                l++;
        }
        return Pair;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.println(pairSum(arr, x));
    }
}
