package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.Scanner;

// Problem 29: Average of Positive Numbers
class Problem_29_AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 0 to finish):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        double sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No positive numbers entered.");
        } else {
            double average = sum / count;
            System.out.printf("Average of positive numbers: %.2f\n", average);
        }
        scanner.close();
    }
}