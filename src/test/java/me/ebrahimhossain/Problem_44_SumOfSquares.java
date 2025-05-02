package me.ebrahimhossain;

import java.util.Scanner;

// Problem 44: Sum of Squares
class Problem_44_SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares up to " + n + ": " + sum);
        scanner.close();
    }
}