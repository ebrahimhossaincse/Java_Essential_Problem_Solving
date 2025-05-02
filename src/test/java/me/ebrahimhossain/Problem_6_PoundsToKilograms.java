package me.ebrahimhossain;

import java.util.Scanner;

// Problem 6: Pounds to Kilograms
class Problem_6_PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds * 0.453592;
        System.out.printf("Weight in kilograms: %.2f\n", kilograms);
        scanner.close();
    }
}