package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection;
An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words,
when there is a common value that exists in both the arrays/lists.
 */

public class IntersectionOfTwoArrays {
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

    public static boolean isPresent(int arr[], int x) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void Intersection(int arr[], int arr2[]) {
        for (int i : arr) {
            if (isPresent(arr2, i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        int arr2[] = takeArrayInput();
        Intersection(arr, arr2);
    }
}
