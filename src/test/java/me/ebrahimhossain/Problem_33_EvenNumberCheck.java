package me.ebrahimhossain;

import java.util.Scanner;

// Problem 33: Even Number Check
class Problem_33_EvenNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }
        scanner.close();
    }
}