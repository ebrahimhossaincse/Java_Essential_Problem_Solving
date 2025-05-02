package me.ebrahimhossain;

import java.util.Scanner;

// Problem 13: Largest of Three Numbers
class Problem_13_LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}