import java.util.Scanner;

public class SumUntilX {
    public static int calculateSum(Scanner sc) {
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = calculateSum(sc);
        System.out.println("The sum of all entered numbers is: " + totalSum);
        sc.close();
    }

}
