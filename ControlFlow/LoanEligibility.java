package ControlFlow;

import java.util.Scanner;

public class LoanEligibility {
    public static void Eligibility(int age, double income, boolean isloan) {
        if (age < 18 || income < 2000 || isloan) {
            System.out.println("You are not eligible for the loan.");
        } else
            System.out.println("You are eligible for the loan.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter income: ");
        double income = sc.nextDouble();
        System.out.print("Enter isloan: ");
        boolean isloan = sc.nextBoolean();

        Eligibility(age, income, isloan);
        sc.close();
    }
}
