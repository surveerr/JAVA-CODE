package TwoDArrays;

import java.util.Scanner;

/*
You are given a 2D array of integers ‘A’ of length ’N’x’M’, where ‘N’ is the number of rows and ‘M’ is the number of columns.
Check if the given array forms a square matrix and returns its diagonal elements.
A Square matrix is one that has an equal number of rows and columns.
 */
public class SquareMatrix {
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

    public static String isSquareMatrix(int arr[][]) {
        if (arr.length != arr[0].length) {
            return "NO";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        return "Yes";
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        System.out.println(isSquareMatrix(arr));

    }
}
