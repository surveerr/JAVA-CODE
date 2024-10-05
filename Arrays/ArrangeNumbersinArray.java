package Arrays;

import java.util.Scanner;

/*
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
 */
public class ArrangeNumbersinArray {
    public static int[] ArrangeArray(int n) {
        int l = 0;
        int r = n - 1;
        int val = 1;
        int arr[] = new int[n];
        while (l < r) {
            arr[l++] = val++;
            arr[r--] = val++;
            if (n % 2 != 0) {
                arr[l] = val;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = ArrangeArray(n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
