package Recursion;

import java.util.Scanner;

public class CheckNumberRecursively {
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

    public static boolean checkNumHelper(int arr[], int x, int i) {
        if (i == arr.length) {
            return false;
        }
        if (arr[i] == x) {
            return true;
        }

        return checkNumHelper(arr, x, i + 1);
    }

    public static boolean checkNum(int arr[], int x) {
        return checkNumHelper(arr, x, 0);
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.println(checkNum(arr, x));
    }
}