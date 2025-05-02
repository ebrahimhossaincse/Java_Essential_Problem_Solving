package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.Scanner;

// Problem 30: Number Search in ArrayList
class Problem_30_NumberSearchInArrayList {
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

        System.out.print("Enter number to search: ");
        int searchNum = scanner.nextInt();

        if (numbers.contains(searchNum)) {
            System.out.println(searchNum + " is in the list.");
        } else {
            System.out.println(searchNum + " is not in the list.");
        }
        scanner.close();
    }
}