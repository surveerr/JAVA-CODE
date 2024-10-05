package Arrays;

import java.util.Scanner;

// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

public class SumOfArray {
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

    public static int ArraySum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takeArrayInput();
        System.out.println(ArraySum(arr));
    }
}
