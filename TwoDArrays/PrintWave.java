package TwoDArrays;

import java.util.Scanner;

/*
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order,
i.e, print the first column top to bottom, next column bottom to top and so on.
 */

public class PrintWave {
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

    public static void Wave(int arr[][]) {
        int left = 0;
        int right = arr[0].length - 1;

        while (left <= right) {
            if (left % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][left] + " ");
                }
            }

            else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        Wave(arr);
    }
}
