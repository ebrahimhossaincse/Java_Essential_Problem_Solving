package me.ebrahimhossain;

import java.util.Scanner;

// Problem 5: String to Number Conversion
class Problem_5_StringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String str = scanner.nextLine();

        try {
            double number = Double.parseDouble(str);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        scanner.close();
    }
}