package SearchingAndSorting;

import java.util.Scanner;

/*
You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of
elements in array B that are smaller than or equal to that element for every array element.
 */

public class CountSmall {
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

    public static int[] countSmall(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int l = 0;
            int r = arr2.length - 1;
            int countSmall = 0;

            while (l <= r) {
                int mid = (l + r) / 2;
                if (arr2[mid] <= arr1[i]) {
                    countSmall = mid + 1;
                    l = mid + 1;
                } else
                    r = mid - 1;
            }
            ans[i] = countSmall;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Input arr1");
        int arr1[] = takeInput();
        System.out.println("Enter arr2");
        int arr2[] = takeInput();

        int ans[] = countSmall(arr1, arr2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
