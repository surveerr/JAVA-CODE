package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
Each number is present at least once.That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these,
there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
 */

public class FindDuplicate {
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

    // O(n)
    public static int DuplicateOptimal(int arr[]) {
        int Sum = 0;
        for (int i : arr) {
            Sum += i;
        }

        // finding sum of n-2 natural number
        int nSum = ((arr.length - 2) * (arr.length - 1)) / 2;

        return Sum - nSum;
    }

    // O(nlogn)
    public static int DuplicateBetter(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // O(n^2)
    public static int Duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(Duplicate(arr));
        System.out.println(DuplicateBetter(arr));
        System.out.println(DuplicateOptimal(arr));
    }
}
