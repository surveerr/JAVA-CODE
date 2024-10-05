package TwoDArrays;

import java.util.Scanner;

/*
Given an ‘N’ x ‘M’ integer matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i][j] == 0), then all the
cells of the ith row and jth column should be changed to 0.
 */

public class SetMatrixZeroes {
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
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void row(int i, int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public static void col(int j, int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    // O(n^3)
    public static int[][] matrixZeroes(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row(i, arr);
                    col(j, arr);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    // O(n^2)
    public static int[][] matrixZeroesBetter(int arr[][]) {
        int row[] = new int[arr.length];
        int col[] = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    public static int[][] matrixZeroesOptimal(int arr[][]) {
        // arr[..][0]; row
        // arr[0][..]; col

        int col0 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;

                    if (j != 0) {
                        arr[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    if (arr[i][0] == 0 || arr[0][j] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        if (arr[0][0] == 0) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        // matrixZeroes(arr);
        // matrixZeroesBetter(arr);
        matrixZeroesOptimal(arr);
        print(arr);
    }
}
