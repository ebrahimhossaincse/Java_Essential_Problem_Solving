package me.ebrahimhossain;

import java.util.Scanner;

// Problem 23: Valid Number Input
class Problem_23_ValidNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            Double.parseDouble(input);
            System.out.println(input + " is a valid number.");
        } catch (NumberFormatException e) {
            System.out.println(input + " is not a valid number.");
        }
        scanner.close();
    }
}