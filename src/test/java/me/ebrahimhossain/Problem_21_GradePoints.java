package me.ebrahimhossain;

import java.util.Scanner;

// Problem 21: Grade Points
class Problem_21_GradePoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage score: ");
        double score = scanner.nextDouble();

        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}