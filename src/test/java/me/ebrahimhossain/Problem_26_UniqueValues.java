package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// Problem 26: Unique Values
class Problem_26_UniqueValues {
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

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Unique values: " + uniqueNumbers);
        scanner.close();
    }
}