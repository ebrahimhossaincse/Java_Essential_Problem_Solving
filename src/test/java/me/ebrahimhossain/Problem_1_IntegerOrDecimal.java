package me.ebrahimhossain;

import java.util.Scanner;

class Problem_1_IntegerOrDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println(num + " is an integer.");
        } else {
            System.out.println(num + " is a decimal.");
        }
        scanner.close();
    }
}