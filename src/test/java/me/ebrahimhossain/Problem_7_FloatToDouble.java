package me.ebrahimhossain;

import java.util.Scanner;

// Problem 7: Float to Double Conversion
class Problem_7_FloatToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        double doubleValue = floatValue;
        System.out.println("Double value: " + doubleValue);
        scanner.close();
    }
}