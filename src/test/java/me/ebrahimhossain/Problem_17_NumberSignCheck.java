package me.ebrahimhossain;

import java.util.Scanner;

// Problem 17: Number Sign Check
class Problem_17_NumberSignCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
        scanner.close();
    }
}