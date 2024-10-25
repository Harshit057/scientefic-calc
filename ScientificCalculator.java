import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root (√x)");
            System.out.println("7. Logarithm (log(x))");
            System.out.println("8. Sine (sin(x))");
            System.out.println("9. Cosine (cos(x))");
            System.out.println("10. Tangent (tan(x))");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 11) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double num1, num2;
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4: // Division
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                case 5: // Power
                    System.out.print("Enter the base (x): ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent (y): ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 6: // Square root
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Result: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: Cannot compute square root of a negative number.");
                    }
                    break;
                case 7: // Logarithm
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        System.out.println("Result: " + Math.log(num1));
                    } else {
                        System.out.println("Error: Logarithm not defined for non-positive numbers.");
                    }
                    break;
                case 8: // Sine
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(num1));
                    break;
                case 9: // Cosine
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(num1));
                    break;
                case 10: // Tangent
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.tan(num1));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
