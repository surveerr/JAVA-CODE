package TwoDArrays;

import java.util.Scanner;

/*
You are given a matrix ‘MAT’. Print and return the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows.
In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].
 */

public class TransposeOfMatrix {
    private static Scanner sc = new Scanner(System.in);

    public static int[][] takeInput(int m, int n) {

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value of array at [" + i + "][" + j + "] index : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] Transpose(int arr[][], int m, int n) {
        int ans[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void print(int arr[][]) {
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter row: ");
        int m = sc.nextInt();
        System.out.print("Enter column: ");
        int n = sc.nextInt();

        int arr[][] = takeInput(m, n);

        int ans[][] = new int[n][m];
        ans = Transpose(arr, m, n);
        print(ans);

    }

}
