package Arrays;

import java.util.Scanner;

/*
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. 
Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index).
The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e.
output array/list will also contain only single digit at every index.
*/

public class SumOfTwoArrays {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeArrayInput() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter vale of array at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] sum(int arr1[], int arr2[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int ans[] = new int[Math.max(i, j) + 2];

        int k = ans.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = arr1[i--] + arr2[j--] + carry;
            ans[k--] = sum % 10;
            carry = sum / 10;
            ans[0] = carry;
        }

        while (i >= 0) {
            int sum = arr1[i--] + carry;
            ans[k--] = sum % 10;
            carry = sum / 10;
        }
        while (j >= 0) {
            int sum = arr2[j--] + carry;
            ans[k--] = sum % 10;
            carry = sum / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = takeArrayInput();
        int arr2[] = takeArrayInput();
        int ans[] = sum(arr1, arr2);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
