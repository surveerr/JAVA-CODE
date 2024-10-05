package TwoDArrays;

import java.util.Scanner;

/*
For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
 */

public class RowWiseSum {
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

    public static void rowWiseSSum(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        rowWiseSSum(arr);
    }
}
