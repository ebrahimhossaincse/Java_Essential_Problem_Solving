package me.ebrahimhossain;

import java.util.Scanner;

// Problem 3: Boolean Opposite
class Problem_3_BooleanOpposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();

        System.out.println("Opposite: " + !value);
        scanner.close();
    }
}