package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.Scanner;

// Problem 24: Store and Print Names
class Problem_24_StoreAndPrintNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}