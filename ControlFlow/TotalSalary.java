package ControlFlow;

import java.util.Scanner;

// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:
// Total_salary = Basic + HRA + DA + Allow – PF

public class TotalSalary {
    public static int totalSalary(int basic, char grade) {
        double HRA = 0.2 * basic;
        double DA = 0.5 * basic;
        double PF = 0.11 * basic;
        double TotalSalary = basic + HRA + DA - PF;
        if (grade == 'A') {
            TotalSalary += 1700;
        } else if (grade == 'B') {
            TotalSalary += 1500;
        } else {
            TotalSalary += 1300;
        }

        int ans = (int) Math.round(TotalSalary);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();
        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);
        System.out.println(totalSalary(basic, grade));
        sc.close();
    }
}
