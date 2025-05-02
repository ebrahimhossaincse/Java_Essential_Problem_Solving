package me.ebrahimhossain;

import java.util.Scanner;

// Problem 45: Divisibility by 3 and 5
class Problem_45_DivisibilityBy3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5.");
        }
        scanner.close();
    }
}