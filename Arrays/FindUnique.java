package Arrays;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */

public class FindUnique {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeArrayInput() {
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of array at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    // O(n)
    public static int uniqueOptimised(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    // public static int uniqueBetter(int arr[]) {
    // sort(arr);
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
    // return arr[i];
    // }
    // }
    // return arr[0];
    // }

    // O(n^2)
    public static int unique(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count < 2) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(unique(arr));
        System.out.println(uniqueOptimised(arr));
        // System.out.println(uniqueBetter(arr));
    }
}
