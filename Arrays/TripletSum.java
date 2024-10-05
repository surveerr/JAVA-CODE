package Arrays;

import java.util.Scanner;

/*
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
 */

public class TripletSum {
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

    public static int[] InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j > 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static int tripletSumBetter(int arr[], int x) {
        InsertionSort(arr);
        int ans = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;
            int r = arr.length - 1;

            while (l < r) {
                int crrSum = arr[i] + arr[l] + arr[r];
                if (crrSum == x) {
                    ans++;

                    int temp_r = r - 1;
                    while (l < temp_r) {
                        if (arr[temp_r] == arr[r]) {
                            ans++;
                            temp_r--;
                        } else
                            break;
                    }
                    l++;
                }

                else if (crrSum > x) {
                    r--;
                } else
                    l++;
            }
        }
        return ans;
    }

    public static int tripletSum(int arr[], int x) {
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        int arr[] = takeArrayInput();
        System.out.println(tripletSum(arr, x));
        System.out.println(tripletSumBetter(arr, x));
    }
}
