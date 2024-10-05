package TimeComplexity;

import java.util.Scanner;

/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */

public class FindUniqueElement {
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

    public static int UniqueElement(int arr[]) {
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(UniqueElement(arr));
    }
}
