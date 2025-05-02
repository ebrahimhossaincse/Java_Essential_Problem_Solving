package me.ebrahimhossain;

import java.util.Scanner;

// Problem 42: Cube of a Number
class Problem_42_CubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double cube = num * num * num;
        System.out.println("Cube of " + num + ": " + cube);
        scanner.close();
    }
}