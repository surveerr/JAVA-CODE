package TwoDArrays;

import java.util.Scanner;

/*
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column
has the largest sum(sum of all the elements in a row or column) amongst all the rows/columns.
 */

public class LargestRoworColumn {
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

    public static void RoWorColumn(int arr[][]) {
        if (arr.length == 0) {
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }

        int largestSum = 0;
        int idx = -1;
        boolean isRow = true;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > largestSum) {
                largestSum = sum;
                idx = i;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (sum > largestSum) {
                largestSum = sum;
                idx = j;
                isRow = false;
            }
        }

        if (isRow) {
            System.out.println("row " + idx + " " + largestSum);
        } else
            System.out.println("column " + idx + " " + largestSum);
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        RoWorColumn(arr);
    }
}
