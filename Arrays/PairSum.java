package Arrays;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
 */

public class PairSum {
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

    public static int[] InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j > 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    // O(logn)
    public static int pairSumBetter(int arr[], int x) {
        InsertionSort(arr);
        int l = 0;
        int r = arr.length - 1;
        int ans = 0;

        while (l < r) {
            int crrSum = arr[l] + arr[r];
            if (crrSum == x) {
                ans++;

                int temp_r = r - 1;
                while (l < temp_r) {
                    if (arr[temp_r] == arr[r]) {
                        ans++;
                        temp_r--;
                    } else
                        break;
                }
                l++;
            } else if (crrSum > x) {
                r--;
            } else
                l++;
        }
        return ans;
    }

    // O(n^2)
    public static int pairSum(int arr[], int x) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        int arr[] = takeArrayInput();
        System.out.println(pairSum(arr, x));
        System.out.println(pairSumBetter(arr, x));
    }

}
