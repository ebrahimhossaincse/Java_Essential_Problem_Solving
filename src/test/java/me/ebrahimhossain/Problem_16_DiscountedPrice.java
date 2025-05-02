package me.ebrahimhossain;

import java.util.Scanner;

// Problem 16: Discounted Price
class Problem_16_DiscountedPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        double discountedPrice = price * (1 - discount / 100);
        System.out.printf("Discounted price: %.2f\n", discountedPrice);
        scanner.close();
    }
}