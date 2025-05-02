package me.ebrahimhossain;

import java.util.Scanner;

// Problem 37: Greatest Common Divisor
class Problem_37_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + ": " + gcd);
        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}