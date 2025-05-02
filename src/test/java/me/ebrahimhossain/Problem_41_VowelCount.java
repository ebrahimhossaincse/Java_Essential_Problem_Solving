package me.ebrahimhossain;

import java.util.Scanner;

// Problem 41: Vowel Count
class Problem_41_VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}