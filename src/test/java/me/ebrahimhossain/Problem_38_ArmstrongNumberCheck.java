package me.ebrahimhossain;

import java.util.Scanner;

// Problem 38: Armstrong Number Check
class Problem_38_ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == original;
    }
}