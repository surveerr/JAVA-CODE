package Methods;

import java.util.Scanner;

/*
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Print the answer as integer value
Simple interest=Principal*rate*time/100
 */

public class CalculateSimpleInterest {
    private static Scanner sc = new Scanner(System.in);

    public static int takeInput(String str) {
        System.out.print(str);
        int n = sc.nextInt();
        return n;
    }

    public static int SimpleInterest(int p, double r, int t) {
        return (int) ((p * r * t) / 100);
    }

    public static void main(String[] args) {
        int Principal = takeInput("Enter principal amount: ");
        System.out.print("Enter rate: ");
        double Rate = sc.nextDouble();
        int Time = takeInput("Enter time: ");
        System.out.println(SimpleInterest(Principal, Rate, Time));
    }
}
