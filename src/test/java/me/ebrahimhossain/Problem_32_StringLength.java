package me.ebrahimhossain;

import java.util.Scanner;

// Problem 32: String Length
class Problem_32_StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = str.length();
        System.out.println("Length of string: " + length);
        scanner.close();
    }
}