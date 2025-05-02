package me.ebrahimhossain;

import java.util.Scanner;

// Problem 35: String Reverse
class Problem_35_StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}