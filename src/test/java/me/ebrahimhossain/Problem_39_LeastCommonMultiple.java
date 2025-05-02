package me.ebrahimhossain;

import java.util.Scanner;

// Problem 39: Least Common Multiple
class Problem_39_LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int lcm = (a * b) / findGCD(a, b);
        System.out.println("LCM of " + a + " and " + b + ": " + lcm);
        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}