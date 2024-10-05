package ControlFlow;

// Your program should take an integer input representing the numerical score and output the corresponding grade.
// If the input score is not within the valid range (0-100), the program should display "Invalid score".

import java.util.Scanner;

public class GradeCalculator {
    public static void Grade(int score) {
        boolean flag = true;
        if (score < 0 || score > 100) {
            System.out.println("Please enter valid marks");
            flag = false;
        }
        if (flag == true) {
            switch (score / 10) {
                case 10:
                    System.out.println("A");
                    break;

                case 9:
                    System.out.println("A");
                    break;

                case 8:
                    System.out.println("B");
                    break;

                case 7:
                    System.out.println("C");
                    break;

                case 6:
                    System.out.println("D");
                    break;

                default:
                    System.out.println("F");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        Grade(score);
        sc.close();
    }
}
