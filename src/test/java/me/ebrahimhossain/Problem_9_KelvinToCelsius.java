package me.ebrahimhossain;

import java.util.Scanner;

// Problem 9: Kelvin to Celsius
class Problem_9_KelvinToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();

        double celsius = kelvin - 273.15;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        scanner.close();
    }
}