package TimeComplexity;

import java.util.Scanner;

/*
For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to
the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned.
Negative one(-1) if no such index is present.
*/

public class ArrayEquilibriumIndex {
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

    public static int Sum(int arr[], int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int EquilibriumIndex(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int leftsum = Sum(arr, 0, i - 1);
            int rightSum = Sum(arr, i + 1, arr.length - 1);

            if (leftsum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int EquilibriumIndexBetter(int arr[]) {
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 1; i < arr.length; i++) {
            rightsum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            rightsum = rightsum - arr[i];
            leftsum += arr[i - 1];

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(EquilibriumIndex(arr));
        System.out.println(EquilibriumIndexBetter(arr));
    }
}
