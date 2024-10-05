package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

/*
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection;
An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words,
when there is a common value that exists in both the arrays/lists.
 */

public class ArrayIntersection {
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

    public static void Intersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else
                i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input arr1");
        int arr1[] = takeInput();
        System.out.println("Enter arr2");
        int arr2[] = takeInput();

        Intersection(arr1, arr2);

    }
}
