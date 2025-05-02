package me.ebrahimhossain;

import java.util.Scanner;

// Problem 22: Sum of Even Numbers
class Problem_22_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers up to " + n + ": " + sum);
        scanner.close();
    }
}