package me.ebrahimhossain;

import java.util.Scanner;

// Problem 31: Square of a Number
class Problem_31_SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double square = num * num;
        System.out.println("Square of " + num + ": " + square);
        scanner.close();
    }
}