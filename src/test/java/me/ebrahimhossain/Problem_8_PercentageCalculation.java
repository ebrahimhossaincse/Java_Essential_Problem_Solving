package me.ebrahimhossain;

import java.util.Scanner;

// Problem 8: Percentage Calculation
class Problem_8_PercentageCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the part: ");
        double part = scanner.nextDouble();
        System.out.print("Enter the total: ");
        double total = scanner.nextDouble();

        double percentage = (part / total) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
        scanner.close();
    }
}