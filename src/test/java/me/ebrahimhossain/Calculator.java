package me.ebrahimhossain;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operation;

        // Display available operations
        System.out.println("Welcome to Advanced Calculator");
        System.out.println("Available Operations:");
        System.out.println("1. + : Addition");
        System.out.println("2. - : Subtraction");
        System.out.println("3. * : Multiplication");
        System.out.println("4. / : Division");
        System.out.println("5. % : Modulus");
        System.out.println("6. ^ : Power");
        System.out.println("7. s : Square Root (uses first number only)");
        System.out.println("8. a : Absolute Value (uses first number only)");
        System.out.println("9. f : Factorial (uses first number only)");
        System.out.println("10. i : Sine (uses first number only, in degrees)");
        System.out.println("11. c : Cosine (uses first number only, in degrees)");
        System.out.println("12. t : Tangent (uses first number only, in degrees)");
        System.out.println("13. l : Natural Logarithm (uses first number only)");
        System.out.println("Enter 'q' to quit");

        while (true) {
            // Get user input
            System.out.print("\nChoose operation: ");
            operation = scanner.next().charAt(0);

            // Check for quit
            if (operation == 'q' || operation == 'Q') {
                System.out.println("Calculator terminated.");
                break;
            }

            // Validate operation
            if (!isValidOperation(operation)) {
                System.out.println("Invalid operation! Please try again.");
                continue;
            }

            // Get numbers (some operations need only one number)
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            if (needsSecondNumber(operation)) {
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else {
                num2 = 0; // Default value for operations that don't need second number
            }

            // Perform calculation based on operation
            try {
                switch (operation) {
                    case '+':
                        result = add(num1, num2);
                        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                        break;
                    case '/':
                        if (num2 == 0) throw new ArithmeticException("Division by zero");
                        result = divide(num1, num2);
                        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                        break;
                    case '%':
                        if (num2 == 0) throw new ArithmeticException("Division by zero");
                        result = modulus(num1, num2);
                        System.out.printf("%.2f %% %.2f = %.2f\n", num1, num2, result);
                        break;
                    case '^':
                        result = power(num1, num2);
                        System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, result);
                        break;
                    case 's':
                        if (num1 < 0) throw new ArithmeticException("Negative number for square root");
                        result = squareRoot(num1);
                        System.out.printf("√%.2f = %.2f\n", num1, result);
                        break;
                    case 'a':
                        result = absolute(num1);
                        System.out.printf("|%.2f| = %.2f\n", num1, result);
                        break;
                    case 'f':
                        if (num1 < 0 || num1 != Math.floor(num1))
                            throw new ArithmeticException("Factorial requires non-negative integer");
                        result = factorial((int)num1);
                        System.out.printf("%d! = %.2f\n", (int)num1, result);
                        break;
                    case 'i':
                        result = sine(num1);
                        System.out.printf("sin(%.2f°) = %.2f\n", num1, result);
                        break;
                    case 'c':
                        result = cosine(num1);
                        System.out.printf("cos(%.2f°) = %.2f\n", num1, result);
                        break;
                    case 't':
                        result = tangent(num1);
                        System.out.printf("tan(%.2f°) = %.2f\n", num1, result);
                        break;
                    case 'l':
                        if (num1 <= 0) throw new ArithmeticException("Non-positive number for logarithm");
                        result = logarithm(num1);
                        System.out.printf("ln(%.2f) = %.2f\n", num1, result);
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    // Validate operation
    private static boolean isValidOperation(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ||
                op == '^' || op == 's' || op == 'a' || op == 'f' || op == 'i' ||
                op == 'c' || op == 't' || op == 'l';
    }

    // Check if operation needs second number
    private static boolean needsSecondNumber(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op == '^';
    }

    // Basic arithmetic operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    // Advanced mathematical operations
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static double absolute(double a) {
        return Math.abs(a);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) return 1;
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double sine(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cosine(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tangent(double a) {
        return Math.tan(Math.toRadians(a));
    }

    public static double logarithm(double a) {
        return Math.log(a);
    }
}