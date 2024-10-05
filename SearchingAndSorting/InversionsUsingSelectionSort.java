package SearchingAndSorting;

import java.util.Scanner;

/*
You have a list of numbers that are not in order. You want to find the sum of the differences between the
indices of pairs of numbers that are in the wrong order. A pair of numbers is considered to be in the wrong
order if the smaller number comes after the larger number in the list.
 */

public class InversionsUsingSelectionSort {
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

    public static int Inversions(int arr[]) {
        int inversion = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int crrIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[crrIdx] > arr[j]) {
                    crrIdx = j;
                }
            }
            inversion += crrIdx - i;

            int temp = arr[crrIdx];
            arr[crrIdx] = arr[i];
            arr[i] = temp;
        }
        return inversion;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(Inversions(arr));
    }
}
