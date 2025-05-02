package me.ebrahimhossain;

import java.util.Scanner;


// Problem 40: Palindrome Check
class Problem_40_PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}