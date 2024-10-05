package TimeComplexity;

import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
 */

public class Triplet {
    private static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of array at index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int TripletSum(int arr[], int x) {
        SelectionSort(arr);

        int pair = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == x) {
                    pair++;

                    int temp_r = r - 1;
                    while (temp_r > l) {
                        if (arr[temp_r] == arr[r]) {
                            pair++;
                            temp_r--;
                        } else
                            break;
                    }
                    l++;
                } else if (sum > x) {
                    r--;
                } else
                    l++;

            }
        }
        return pair;
    }

    public static void love() {
        for (int i = 0;; i++) {
            System.out.println("Gaile is a cutie :)");
        }
    }

    public static void main(String[] args) {
        // int arr[] = takeInput();
        // System.out.print("Enter X: ");
        // int x = sc.nextInt();
        // System.out.println(TripletSum(arr, x));

        love();

    }
}
