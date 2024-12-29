package calculator;
import java.util.*;

public class Calculator {
    double a, b, result;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void Addition() {
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public void Subtraction() {
        result = b - a;
        System.out.println(a + " - " + b + " = " + result);
    }

    public void Multiplication() {
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public void Division() {
        if (a == 0 && b == 0) {
            System.out.println("1");
        } else if (a == 0 || b == 0) {
            System.out.println("Not defined");
        } else {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = 0, a2 = 0;

        while (true) {
            System.out.println("Enter your first number: ");
            try {
                a1 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please provide a valid number.");
                sc.next();
            }
        }

        while (true) {
            System.out.println("\nEnter your second number: ");
            try {
                a2 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please provide a valid number.");
                sc.next();
            }
        }

        Calculator c = new Calculator(a1, a2);

        while (true) {
        	System.out.println("Enter the operation you want to perform:");
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number between 1 and 5.");
                sc.next(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    c.Addition();
                    break;
                case 2:
                    c.Subtraction();
                    break;
                case 3:
                    c.Multiplication();
                    break;
                case 4:
                    c.Division();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close(); // Close scanner before exiting
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.exit(0);
        }
    }
}