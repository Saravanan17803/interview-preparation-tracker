import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter two numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n'e' to Exit");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '4':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 'e':
                    System.out.println("Exiting the calculator program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'e');
    }

    public static void main(String[] args) {
        calculator();
    }
}
