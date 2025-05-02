package me.ebrahimhossain;

import java.util.Scanner;

// Problem 2: Area of a Circle
class Problem_2_CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle: %.2f\n", area);
        scanner.close();
    }
}