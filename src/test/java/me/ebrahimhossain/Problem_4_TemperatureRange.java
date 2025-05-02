package me.ebrahimhossain;

import java.util.Scanner;

// Problem 4: Temperature Range Check
class Problem_4_TemperatureRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = scanner.nextDouble();

        if (temp >= 18 && temp <= 24) {
            System.out.println("Temperature is comfortable.");
        } else {
            System.out.println("Temperature is not comfortable.");
        }
        scanner.close();
    }
}