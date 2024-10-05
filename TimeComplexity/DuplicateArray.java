package TimeComplexity;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5,
the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice.
You need to find and return that duplicate number present in the array.
 */

public class DuplicateArray {
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

    public static int TotalSum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int Duplicate(int arr[]) {
        int arraySum = ((arr.length - 2) * (arr.length - 1)) / 2;
        int TotalSum = TotalSum(arr);
        return TotalSum - arraySum;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(Duplicate(arr));
    }
}
