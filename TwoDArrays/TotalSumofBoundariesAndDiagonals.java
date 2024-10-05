package TwoDArrays;

import java.util.Scanner;

/*
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
 */

public class TotalSumofBoundariesAndDiagonals {
    private static Scanner sc = new Scanner(System.in);

    public static int[][] takeInput() {
        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        System.out.print("Enter Column: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value of array at [" + i + "][" + j + "] index : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int SumofBoundariesAndDiagonals(int arr[][]) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[0][i];
            sum += arr[arr.length - 1][i];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i][0];
            sum += arr[i][arr.length - 1];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i][i];
            sum += arr[i][arr.length - 1 - i];
        }

        if (arr.length % 2 != 0) {
            sum = sum - arr[arr.length / 2][arr.length / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        System.out.println(SumofBoundariesAndDiagonals(arr));
    }
}
