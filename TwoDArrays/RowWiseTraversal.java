package TwoDArrays;

import java.util.Scanner;

/*
Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix row-wise.
You must return an integer array of size ‘N’ * ‘M’ denoting the row-wise traversal of the matrix.
 */

public class RowWiseTraversal {
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

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        print(arr);
    }
}
