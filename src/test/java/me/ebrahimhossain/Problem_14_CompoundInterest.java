package me.ebrahimhossain;

import java.util.Scanner;

// Problem 14: Compound Interest
class Problem_14_CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (as a decimal): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        double amount = principal * Math.pow(1 + rate / n, n * time);
        double interest = amount - principal;
        System.out.printf("Compound Interest: %.2f\n", interest);
        System.out.printf("Total Amount: %.2f\n", amount);
        scanner.close();
    }
}