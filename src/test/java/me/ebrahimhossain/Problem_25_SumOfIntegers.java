package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.Scanner;

// Problem 25: Sum of Integers
class Problem_25_SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 0 to finish):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
        scanner.close();
    }
}